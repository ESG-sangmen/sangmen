package model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionManager;

public class DAO {

	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSessionFactory();
	
	public int join(customerInfor vo) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		int row = sqlSession.insert("model.DAO.join", vo);
		return row;
	}   	
	
	public customerInfor login(customerInfor vo) {
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		customerInfor resultVO = sqlSession.selectOne("model.DAO.login", vo);
		return resultVO;
	}	
	
	
	
}
