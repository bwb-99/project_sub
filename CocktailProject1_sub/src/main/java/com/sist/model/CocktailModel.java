package com.sist.model;
import java.util.*; 
import com.sist.dao.*;
import com.sist.vo.*;
import com.sist.controller.Controller;
import com.sist.controller.RequestMapping;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class CocktailModel {
	@RequestMapping("cocktail/cocktail_list.do")
	public String cocktail_list(HttpServletRequest request, HttpServletResponse response)
	{
		String page = request.getParameter("page");
		if(page==null) page="1";
		int curpage= Integer.parseInt(page);
		Map map = new HashMap();
		map.put("start", (curpage*12)-11);
		map.put("end", (curpage*12));
		map.put("detail","y");

	  List<CocktailVO> list = CocktailDAO.cocktailListData(map);
	  int count = CocktailDAO.cocktailTotalPage("y");
	  int totalpage = (int) Math.ceil(count/12.0);
	  List<CocktailVO> clist = new ArrayList<CocktailVO>();
	  Cookie[] cookies= request.getCookies();
		if(cookies!=null)
		{
			for(int i=cookies.length-1; i>=0;i--)
			{
				if(cookies[i].getName().startsWith("cocktail_"))
				{
					String cno=cookies[i].getValue();
					CocktailVO vo = CocktailDAO.cocktailDetailData(Integer.parseInt(cno));
					clist.add(vo);
				}
			}
		}
	  
	  
	  request.setAttribute("list", list);
	  request.setAttribute("clist", clist);
	  request.setAttribute("count", count);
	  request.setAttribute("totalpage", totalpage);
	  request.setAttribute("curpage", curpage);
	  
	  request.setAttribute("cocktail_jsp", "../cocktail/cocktail_list.jsp");
		request.setAttribute("main_jsp","../cocktail/cocktail_main.jsp");
		return "../main/main.jsp";
	}
	@RequestMapping("cocktail/cocktail_detail_before.do")
  public String cocktail_detail_before(HttpServletRequest request,
		  HttpServletResponse response)
  {
	  String cno=request.getParameter("cno");
	  Cookie cookie=new Cookie("cocktail_"+cno, cno);
	  cookie.setPath("/");
	  cookie.setMaxAge(60*60*24);
	  // 전송 
	  response.addCookie(cookie);
	  
	  // 화면 이동 
	  return "redirect:cocktail_detail.do?cno="+cno;
  }
	@RequestMapping("cocktail/cocktail_detail.do")
	public String cocktail_detail(HttpServletRequest request, HttpServletResponse response)
	{
		String cno = request.getParameter("cno");
		CocktailVO vo = CocktailDAO.cocktailDetailData(Integer.parseInt(cno));
		List<CocktailVO> list = CocktailDAO.cocktailRecipeData(Integer.parseInt(cno));
		List<CocktailVO> tags = CocktailDAO.cocktailTagData(Integer.parseInt(cno));
		List<CocktailVO> clist = CocktailDAO.cocktailData4();
		String[] contents = vo.getContent().split("\\d+\\.\\s*");
		request.setAttribute("tags", tags);
		request.setAttribute("list", list);
		request.setAttribute("clist", clist);
		request.setAttribute("vo", vo);
		request.setAttribute("contents", contents);
		
		request.setAttribute("main_jsp", "../cocktail/cocktail_detail.jsp");
		return "../main/main.jsp";
	}
	
	@RequestMapping("cocktail/cocktail_my.do")
	public String cocktail_my(HttpServletRequest request, HttpServletResponse response)
	{
		String page = request.getParameter("page");
		if(page==null) page="1";
		int curpage= Integer.parseInt(page);
		Map map = new HashMap();
		map.put("start", (curpage*12)-11);
		map.put("end", (curpage*12));
		map.put("detail","n");
		final int BLOCK=10;
		int startPage=((curpage-1)/BLOCK*BLOCK)+1;
		int endPage=((curpage-1)/BLOCK*BLOCK)+BLOCK;
		

	  List<CocktailVO> list = CocktailDAO.cocktailListData(map);
	  int count = CocktailDAO.cocktailTotalPage("n");
	  int totalpage = (int) Math.ceil(count/12.0);
	  if(endPage>totalpage) endPage=totalpage;
	  List<CocktailVO> clist = new ArrayList<CocktailVO>();
	  Cookie[] cookies= request.getCookies();
		if(cookies!=null)
		{
			for(int i=cookies.length-1; i>=0;i--)
			{
				if(cookies[i].getName().startsWith("cocktail_"))
				{
					String cno=cookies[i].getValue();
					CocktailVO vo = CocktailDAO.cocktailDetailData(Integer.parseInt(cno));
					clist.add(vo);
				}
			}
		}
	  
	  
	  request.setAttribute("list", list);
	  request.setAttribute("count", count);
	  request.setAttribute("clist", clist);
	  request.setAttribute("startPage", startPage);
	  request.setAttribute("endPage", endPage);
	  request.setAttribute("totalpage", totalpage);
	  request.setAttribute("curpage", curpage);
	  
	  request.setAttribute("cocktail_jsp", "../cocktail/cocktail_my.jsp");
		request.setAttribute("main_jsp","../cocktail/cocktail_main.jsp");
		return "../main/main.jsp";
	}
	@RequestMapping("cocktail/cocktail_ingredients.do")
	public String cocktail_ingredients(HttpServletRequest request, HttpServletResponse response)
	{
		String page = request.getParameter("page");
		if(page==null) page="1";
		int curpage= Integer.parseInt(page);
		Map map = new HashMap();
		map.put("start", (curpage*12)-11);
		map.put("end", (curpage*12));
		final int BLOCK=10;
		int startPage=((curpage-1)/BLOCK*BLOCK)+1;
		int endPage=((curpage-1)/BLOCK*BLOCK)+BLOCK;

	  List<CocktailVO> list = CocktailDAO.ingredientsListData(map);
	  int count = CocktailDAO.ingredientsTotalPage();
	  int totalpage = (int) Math.ceil(count/12.0);
	  if(endPage>totalpage) endPage=totalpage;
	  
	  
	  request.setAttribute("list", list);
	  request.setAttribute("count", count);
	  request.setAttribute("totalpage", totalpage);
	  request.setAttribute("curpage", curpage);
	  request.setAttribute("startPage", startPage);
	  request.setAttribute("endPage", endPage);
	  request.setAttribute("cocktail_jsp", "../cocktail/cocktail_ingredients.jsp");
		request.setAttribute("main_jsp","../cocktail/cocktail_main.jsp");
		return "../main/main.jsp";
	}
}
