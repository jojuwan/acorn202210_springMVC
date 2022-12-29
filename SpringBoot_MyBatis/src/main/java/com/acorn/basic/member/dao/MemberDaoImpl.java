package com.acorn.basic.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
// component scan 을 통해서 spring 이 관리하는 bean 이 될수 있도록 어노테이션 붙이기
@Repository
public class MemberDaoImpl implements MemberDao{
	
	// application.properties 에 설정한 정보가 잘 동작한다면 SqlSession 객체가 자동 주입된다.
	@Autowired
	private SqlSession session;
}
