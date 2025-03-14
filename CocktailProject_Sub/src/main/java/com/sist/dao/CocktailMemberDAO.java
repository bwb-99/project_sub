package com.sist.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sist.commons.CreateSqlSessionFactory;
import com.sist.vo.CocktailMemberVO;

public class CocktailMemberDAO {
	private static SqlSessionFactory ssf;
	   static
	   {
		   ssf=CreateSqlSessionFactory.getSsf();
	   }
	   /*
	    *  <select id="memberIdcheck" resultType="int" parameterType="string">
	       SELECT COUNT(*) FROM cocktail_member
	       WHERE id=#{id}
	       </select>
	       ============================================
	       SqlSession session=ssf.openSession();
		   int count=session.selectOne("memberIdcheck",id);
		   session.close();
		   return count;
	    */
	   public static int memberIdcheck(String id)
	   {
		   int count=0;
		   SqlSession session=null;
		   try
		   {
			   session=ssf.openSession();
			   count=session.selectOne("memberIdcheck",id);
		   }
		   catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }
		   finally
		   {
			   if(session!=null)
				   session.close();
		   }
		   return count;
	   }
	   /*
	    * <insert id="memberInsert" parameterType="CocktailMemberVO">
	      INSERT INTO cocktail_member VALUES(
	      #{id},#{pwd},#{name},#{sex},#{email},#{birthday},
	      #{post},#{address},#{address_detail},#{regdate},
	      #{coment},'n','n',#{phone},#{avater}
           )
          </insert>
	    */
	   public static void memberInsert(CocktailMemberVO vo)
	   {
		   SqlSession session=null;
		   try
		   {
			   session = ssf.openSession(true);
			   session.insert("memberInsert",vo);
		   }catch(Exception ex)
		   {
			  ex.printStackTrace(); 
		   }
		   finally
		   {
			   if(session != null)
				   session.close();
		   }
		
	   }
	   /*
	    * <select id="memberIdCheckCount" resultType="int" parameterType="string">
	      SELECT COUNT(*) FROM cocktail_member
	      WHERE id=#{id}
	      </select>
	      <select id="memberGetPassword" resultType="MemberVO" parameterType="string">
	      SELECT id,pwd,name,sex,admin
	      FROM cocktail_member
	      WHERE id=#{id}
	      </select>
	    */
	   public static CocktailMemberVO memberLogin(String id,String pwd)
	   {
		   CocktailMemberVO vo=new CocktailMemberVO();
		   SqlSession session=null;
		   
		   try
		   {
			   session=ssf.openSession();
			   int count = session.selectOne("memberIdCheckCount",id);
			   
			   if(count == 0) 
			   {
				 vo.setMsg("NOID");   
			   }
			   else
			   {
				   vo=session.selectOne("memberGetPassword",id);
			       if(vo!=null && pwd.equals(vo.getPwd())) 
			       {
			    	 vo.setMsg("OK");   
			       }
			       else
			       {
			    	   vo.setMsg("NOPWD");
			       }
			   }
		   }catch(Exception ex)
		   {
			   ex.printStackTrace();
			   vo.setMsg("에러");
		   }
		   finally
		   {
			   if(session!=null)
			   {
				   session.close();
			   }
		   }
		   return vo;
	   }
}
