package com.sist.model;

import java.io.PrintWriter;

import com.sist.controller.Controller;
import com.sist.controller.RequestMapping;
import com.sist.dao.Cocktail_MemberDAO;
import com.sist.vo.Cocktail_MemberVO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class Cocktail_MemberModel {
   @RequestMapping("member/join.do")
   public String member_join(HttpServletRequest request,
		   HttpServletResponse response)
   {
	   // include 
	   request.setAttribute("main_jsp", "../member/join.jsp");
	   return "../main/main.jsp";
   }
   
   @RequestMapping("member/idcheck.do")
   public String member_idcheck(HttpServletRequest request,
		   HttpServletResponse response)
   {
	   return "../member/idcheck.jsp";
   }
   
   @RequestMapping("member/idcheck_ok.do")
   public void member_idcheck_ok(HttpServletRequest request,
		   HttpServletResponse response)
   {
	   // void => 일반 데이터 (String , int)
	   // => JSON
	   // data:{"id":id.trim()} ?id=aaa
	   String id=request.getParameter("id");
	   int count=Cocktail_MemberDAO.memberIdcheck(id);
	   
	   try
	   {
		   response.setContentType("text/html;charset=UTF-8");
		   PrintWriter out=response.getWriter();
		   out.write(String.valueOf(count));
		   // int => char
	   }catch(Exception ex) {}
	   
   }
   @RequestMapping("member/join_ok.do")
   public String member_join_ok(HttpServletRequest request,
		   HttpServletResponse response)
   {
	   String id=request.getParameter("id");
	   String pwd=request.getParameter("pwd");
	   String name=request.getParameter("name");
	   String sex=request.getParameter("sex");
	   String birthday=request.getParameter("birthday");
	   String email=request.getParameter("email");
	   String post=request.getParameter("post");
	   String address=request.getParameter("address");
	   String address_detail=request.getParameter("address_detail");
	   String phone1=request.getParameter("phone1");
	   String phone2=request.getParameter("phone2");
	   String comtent=request.getParameter("comtent");
	   
	   Cocktail_MemberVO vo=new Cocktail_MemberVO();
	   vo.setId(id);
	   vo.setPwd(pwd);
	   vo.setName(name);
	   vo.setSex(sex);
	   vo.setBirthday(birthday);
	   vo.setEmail(email);
	   vo.setPost(post);
	   vo.setAddress(address);
	   vo.setAddress_detail(address_detail);
	   vo.setPhone(phone1+"-"+phone2);
	   vo.setComent(comtent);
	   
	   Cocktail_MemberDAO .memberInsert(vo);
	   return "redirect:../main/main.do";
   }
   @RequestMapping("member/login.do")
   public String member_login(HttpServletRequest request,
		   HttpServletResponse response)
   {
	   return "../member/login.jsp";
   }
   // 로그인 
   @RequestMapping("member/login_ok.do")
   public void member_login_ok(HttpServletRequest request,
		   HttpServletResponse response)
   {
	   String id=request.getParameter("id");
	   String pwd=request.getParameter("pwd");
	   Cocktail_MemberVO vo=Cocktail_MemberDAO.memberLogin(id, pwd);
	   if(vo.getMsg().equals("OK"))
	   {
		   HttpSession session=request.getSession();
		   session.setAttribute("id", vo.getId());
		   session.setAttribute("name", vo.getName());
		   session.setAttribute("sex", vo.getSex());
		   session.setAttribute("email", vo.getEmail());
		   session.setAttribute("post", vo.getPost());
		   session.setAttribute("address", vo.getAddress());
		   session.setAttribute("address_detail", vo.getAddress_detail());
		   session.setAttribute("admin", vo.getAdmin());
		   session.setAttribute("login", vo.getLogin());
	   }
	   try
	   {
		   response.setContentType("text/html;charset=UTF-8");
		   PrintWriter out=response.getWriter();
		   out.write(vo.getMsg());
	   }catch(Exception ex) {}
   }
   // 로그아웃 
   @RequestMapping("member/logout.do")
   public String member_logout(HttpServletRequest request,
		   HttpServletResponse response)
   {
	   HttpSession session=request.getSession();
	   session.invalidate();
	   return "redirect:../main/main.do";
   }
}