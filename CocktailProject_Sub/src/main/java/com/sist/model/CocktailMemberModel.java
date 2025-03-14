package com.sist.model;
import java.util.*;

import com.sist.controller.Controller;
import com.sist.controller.RequestMapping;
import com.sist.dao.CocktailMemberDAO;
import com.sist.vo.CocktailMemberVO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class CocktailMemberModel {
	@RequestMapping("member/join.do")
	public String member_join(HttpServletRequest request,
			   HttpServletResponse response)
	{
		//include
		try
		{
			request.setAttribute("main_jsp", "../member/join.jsp");
			return "../main/main.jsp";
		}catch(Exception ex) 
		{
		   ex.printStackTrace();
		   return "../member/error.jsp";
		}

	}

}
