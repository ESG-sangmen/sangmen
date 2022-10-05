package db;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionManager {
	
	// 홈페이지 복붙 위주로
	
	// 1. sqlSession을 제작할 수 있는 공장 필드
	public static SqlSessionFactory sqlSessionFactory;
	
	// 2. 객체 생성시 바로 실행되는 메소드
	static {
		// try-catch는 다른 곳에 에러가 없어야 할 수 있음
		String resource = "com/smhrd/db/Mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	
	
	
	
	
	
	
	
	
	
	
}
