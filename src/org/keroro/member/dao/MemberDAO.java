package org.keroro.member.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.keroro.common.dao.BaseDAO;
import org.keroro.member.domain.Member;

public class MemberDAO extends BaseDAO{
	
	private static final String NAMESPACE="org.keroro.dao.MemberMapper";
	//
	public List<Member> getMemberList() throws Exception {
		
		try(SqlSession session = getSession()) {
			
			return session.selectList(NAMESPACE+".getMemberList");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		return null;

	}
	
	public Member getMemberOne(String mid) throws Exception {
		
		try(SqlSession session = getSession()) {
			
			return session.selectOne(NAMESPACE + ".getMemberOne" + mid);
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		
	}
	
}
