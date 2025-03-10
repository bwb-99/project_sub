package com.sist.dao;

import java.util.*;
import com.sist.dao.*;
import com.sist.vo.*;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sist.commons.CreateSqlSessionFactory;

public class CocktailDAO {
	private static SqlSessionFactory ssf;
	static {
		ssf = CreateSqlSessionFactory.getSsf();
	}
	
	public static CocktailVO cocktailData()
	{
		SqlSession session = null;
		CocktailVO vo = null;
		try {
			session = ssf.openSession();
			vo = session.selectOne("cocktailData");
		}catch(Exception e) {
			e.printStackTrace();
		}finally
		{
			if(session!=null) session.close();
		}
		return vo;
	}
	public static List<CocktailVO> cocktailRecipeData(int cno)
	{
		SqlSession session = null;
		List<CocktailVO> list = null;
		try {
			session = ssf.openSession();
			list = session.selectList("cocktailRecipeData",cno);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(session!=null) session.close();
		}
		return list;
	}
	
}