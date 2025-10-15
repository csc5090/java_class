package net.daum.dao;

import org.apache.ibatis.session.SqlSession;

import net.daum.mybatis.config.DBService;

public class AdminDAOImpl implements AdminDAO {
	
	private static AdminDAOImpl instance = null;
	
	public AdminDAOImpl() {}
	
	public static AdminDAOImpl getInstance() {
		if(instance == null) {
			instance = new AdminDAOImpl();
		}
		
		return instance;
	}

	
	private SqlSession getSqlSession() {
		return DBService.getFactory().openSession(false);
		
	}
	
}
