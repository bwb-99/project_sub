package com.sist.dao;
import java.util.*;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sist.vo.*;
import com.sist.commons.*;
public class Cocktail_MemberDAO {
   private static SqlSessionFactory ssf;
   static
   {
	   ssf=CreateSqlSessionFactory.getSsf();
   }
   /*
    *   <select id="memberIdcheck" resultType="int" parameterType="string">
	    SELECT COUNT(*) FROM project_member
	    WHERE id=#{id}
	    </select>
    */
   public static int memberIdcheck(String id)
   {
	   SqlSession session=ssf.openSession();
	   int count=session.selectOne("memberIdcheck",id);
	   session.close();
	   return count;
   }
   
   /*
    *   <insert id="memberInsert" parameterType="Cocktail_memberVO">
	    INSERT INTO project_member VALUES(
	      #{id},#{pwd},#{name},#{sex},#{email},#{birthday},
	      #{post},#{address},#{address_detail},#{coment},
	      #{phone},'n','o'
	      )
	     </insert>
    */
   public static void memberInsert(Cocktail_MemberVO vo)
   {
	   SqlSession session=ssf.openSession(true);
	   session.insert("memberInsert",vo);
	   session.close();
   }
   /*
    *  <select id="memberIdCheckCount" resultType="int" parameterType="string">
	   SELECT COUNT(*) FROM cocktail_member
	   WHERE id=#{id}
	  </select>
	  <select id="memberGetPassword" resultType="Cocktail_memberVO" parameterType="string">
	   SELECT id,pwd,name,sex,email,admin
	   FROM cocktail_member
	   WHERE id=#{id}
	  </select>
    */
   public static Cocktail_MemberVO memberLogin(String id,String pwd)
   {
	   Cocktail_MemberVO vo=new Cocktail_MemberVO();
	   SqlSession session=ssf.openSession();
	   int count=session.selectOne("memberIdCheckCount",id);
	   if(count==0)
	   {
		   vo.setMsg("NOID");
	   }
	   else
	   {
		   vo=session.selectOne("memberGetPassword",id);
		   if(pwd.equals(vo.getPwd()))
		   {
			   vo.setMsg("OK");
		   }
		   else
		   {
			   vo.setMsg("NOPWD");
		   }
	   }
	   session.close();
	   return vo;
   }
}