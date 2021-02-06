package org.keroro.member.dao;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.keroro.member.domain.Member;

import lombok.extern.log4j.Log4j;

@Log4j
public class MemberMapperTests {
	
	private MemberDAO dao;
	
	@Before
	public void ready() {
		
		dao = new MemberDAO();
		
	}
	
	@Test
	public void testGetMemberList() throws Exception{
		
		List<Member> memberList = dao.getMemberList();
		
		memberList.forEach(m -> log.info(m));

	}
	
}
