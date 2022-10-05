package com.sangmen.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sangmen.db.SqlSessionManager;

public class DAO {

	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSessionFactory();
	
	public int join(customerInfor vo) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		int row = sqlSession.insert("com.sangmen.model.DAO.join", vo);
		return row;
	}   	
	
	public customerInfor login(customerInfor vo) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		customerInfor resultVO = sqlSession.selectOne("com.sangmen.model.DAO.login", vo);
		return resultVO;
	}	
	
	
	
}
