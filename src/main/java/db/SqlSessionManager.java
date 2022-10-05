package db;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionManager {
	
	// Ȩ������ ���� ���ַ�
	
	// 1. sqlSession�� ������ �� �ִ� ���� �ʵ�
	public static SqlSessionFactory sqlSessionFactory;
	
	// 2. ��ü ������ �ٷ� ����Ǵ� �޼ҵ�
	static {
		// try-catch�� �ٸ� ���� ������ ����� �� �� ����
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
