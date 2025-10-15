package net.daum.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import net.daum.dto.MemberDTO;
import net.daum.dto.ZipcodeDTO;
import net.daum.mybatis.config.DBService;

public class MemberDAOImpl implements MemberDAO {
	/*
	 * DAO (Data Access Object) 실제로 데이터베이스(DB)에 접근하여 CRUD(Create(데이터 저장) -> insert
	 * 쿼리문 , Read(데이터 조회) -> select 쿼리문 , Update, Delete) 작업을 수행하는 곳
	 */

	/*
	 * SqlSession은 DB에 SQL문을 실행하기 위해 필요한 모든 메소드를 가지고 있다. SqlSession은 JDBC에서 개발자가 직접
	 * Connection을 생성하고 PreparedStatement를 이용해서 SQL을 실행하던 모든 작업을 내부적으로 자동으로 처리해 준다.
	 */

	/*
	 * mybatis 쿼리문 실행메서드 정리) 1. selectOne() : 하나의 결과 레코드만 조회할 때 사용 2. selectList() :
	 * 하나 이상의 레코드를 검색해서 컬렉션 List<제네릭타입>으로 반환 3. insert() : 레코드 저장, 반환값은 저장 쿼리문 수행후
	 * 성공한 레코드 행(row)의 수 반환 4. update() : 레코드 수정, 반환값은 수정 쿼리문 수행후 성공한 레코드 행의 수를 반환
	 * 5. delete() : 레코드 삭제, 반환값은 삭제 쿼리문 수행후 성공한 레코드 행의 수를 반환
	 */

	// 정적 필드(변수)

	private static MemberDAOImpl instance = null;

	public MemberDAOImpl() {
	} // 기본생성자

	// DAOImpl()객체 생성해서 반환
	public static MemberDAOImpl getInstance() {
		if (instance == null) {
			instance = new MemberDAOImpl();
		}
		return instance;
	}// getInstance()

	// sqlSession을 매번 새로 생성하여 반환
	private SqlSession getSqlSession() {
		return DBService.getFactory().openSession(false); // false -> 수동 commit 모드. 메서드 체이닝
	}// getSqlsession() -> mybatis 쿼리문을 실행할 sqlSession을 반환.

	@Override
	public MemberDTO idCheck(String id) {
		SqlSession sqlSession = null;

		try {
			sqlSession = getSqlSession();
			return sqlSession.selectOne("m_idcheck", id); //마이바티스의 selectOne()은 단 한 개의 레코드 값만 반환한다.
			//m_idcheck는 member.xml에서 설정할 유일한 select 아이디명
		} finally {
			if (sqlSession != null) {
				sqlSession.close(); // 항상 세션 종료를 해주어야 한다.
				
			}
		}

	}// idcheck. 중복검사 메서드
	
	
	@Override
	public List<ZipcodeDTO> zipFind(String dong){
		SqlSession sqlSession = null;

		try {
			sqlSession = getSqlSession();
			return sqlSession.selectList("z_list", dong);
			
		} finally {
			if (sqlSession != null) {
				sqlSession.close(); // 항상 세션 종료를 해주어야 한다.
				
			}
		}
	}//zipFind()
	
	@Override
	public void insertMember(MemberDTO member) {
		/* 서블릿 MVC에서는 기본적으로 트랜잭션 관리가 Spring과 같은 프레임워크에서 자동으로 관리되는 방식과는 다르다.
		 * 서블릿 MVC에서는 트랜잭션을 수동으로 처리
		 * 
		 */
		SqlSession sqlSession = null;

		try {
			sqlSession = getSqlSession();
			
			sqlSession.insert("m_in", member); 
			sqlSession.commit();
			
			
		} finally {
			if (sqlSession != null) {
				sqlSession.close(); // 항상 세션 종료를 해주어야 한다.
				
			}
		}
		
	} // 회원저장 insertMember()

	@Override
	public void updatePwd(MemberDTO m) {
		SqlSession sqlSession = null;
		
		try {
			sqlSession = getSqlSession(); //마이바티스 쿼리문 수행 객체 sqlSession 생성
			
			sqlSession.update("p_edit",m); //마이바티스에서 update()메서드는 레코드를 수정함.
			//member.xml에서 설정할 유일한 아이디명
			sqlSession.commit();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
	}//updatePwd() 암호화 된 임시비번 수정

	@Override
	public MemberDTO pwdMember(MemberDTO m) {
		SqlSession sqlSession = null;
		
		try {
			sqlSession = getSqlSession(); 
			
			return sqlSession.selectOne("p_find", m);
			
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
	} //pwdMember() -> 아이디와 회원이름을 기준으로 회원정보 검색 - > 비번찾기

	@Override
	public MemberDTO loginCheck(String id) {
		SqlSession sqlSession = null;
		
		try {
			sqlSession = getSqlSession(); 
			return sqlSession.selectOne("p_loginCheck", id);
			
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
	}

	@Override
	public MemberDTO getMember(String id) {
		SqlSession sqlSession = null;
		
		try {
			sqlSession = getSqlSession(); 
			return sqlSession.selectOne("member_info", id);
			
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
	}//getMember() -> 아이디에 해당하는 회원정보 가져오기

	@Override
	public void editMember(MemberDTO m) {
		SqlSession sqlSession = null;
		
		try {
			sqlSession = getSqlSession(); 
			sqlSession.update("medit_ok", m);
			sqlSession.commit();
			
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
		
	}//editMember() --> 아이디를 기준으로 회원정보 수정

	@Override
	public void delMem(MemberDTO dm) {
		SqlSession sqlSession = null;
		
		try {
			sqlSession = getSqlSession(); 
			sqlSession.update("m_del_ok", dm);
			sqlSession.commit();
			
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
	}//회원 탈퇴
	

}
