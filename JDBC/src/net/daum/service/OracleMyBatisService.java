package net.daum.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import net.daum.config.MyBatisSessionFactory;
import net.daum.dao.OracleMyBatisDAO;
import net.daum.dto.DeptDTO;

/*  컨트롤러와 DAO사이에 service를 넣는 이유는
데이터베이스 작업(여러 DAO 메서드 호출 등)에 트랜잭션(rollback, commit) 을 걸고 싶을 때 주로 Service 계층에서 처리하기 때문이다.
Service 계층이 없으면 Controller이 직접 DB 처리 로직을 호출해야 하므로 코드가 복잡하고 유지보수가 어렵다.
Controller 요청 처리, DAO는 DB 처리, Service는 비즈니스 로직 처리 하고 유지보수성 향상,로직이 분리되어 변경 및 디버깅이 쉬움,테스트 용이
고객의 추가 요구 사항 반영(애프터 서비스라고 생각하면 쉽다.)
       컨트롤러와 DAO사이 중간 매개체 역할
 * 
 */

public class OracleMyBatisService {

	OracleMyBatisDAO dao;

	public OracleMyBatisService() {
		super(); // 최고 조상 부모클래스 Object의 기본생성자 호출
		dao = new OracleMyBatisDAO();
	} // 기본 생성자 -> new OracleMyBatisService(); 에 의해서 기본생성자를 호출하면서 dao객체 생성

	// 부서목록
	public List<DeptDTO> selectAll() {
		List<DeptDTO> dlist = null;
		SqlSession sqlSession = MyBatisSessionFactory.getSqlSession();
		// mybatis 쿼리문을 수행하는 SqlSession 인스턴스 반환

		try {
			dlist = this.dao.selectAll(sqlSession); // DAO쪽 메서드 호출할 때 인자값으로 sqlSession을 전달
		} finally {
			sqlSession.close();
		}
		return dlist;
	}

	// 부서정보 추가
	public void insertPept(DeptDTO deptDTO) {
		SqlSession sqlSession = MyBatisSessionFactory.getSqlSession();

		try {
			dao.insertDept(deptDTO, sqlSession);
			sqlSession.commit();

			// MyBatis SqlSession은 auto commit이 비활성화 되어 있음. 수동 commit을 넣어줘야 함.

		} finally {
			sqlSession.close();
		}
	}// insertPept

	public DeptDTO getFindDeptNo(int deptno) {
		DeptDTO deptNo = null;
		SqlSession sqlSession = MyBatisSessionFactory.getSqlSession();
		try {
			deptNo = dao.getFindDeptNo(deptno, sqlSession);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				sqlSession.close();

		}
		return deptNo;
	}

	public void updateDept(DeptDTO dept) {
		SqlSession sqlSession = MyBatisSessionFactory.getSqlSession();
		
		try {
			dao.updateDept(dept,sqlSession);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		
	}//updateDept()

	public void deleteDept(DeptDTO dept) {
		SqlSession sqlSession = MyBatisSessionFactory.getSqlSession();
		
		try {
			dao.deleteDept(dept, sqlSession);
			sqlSession.commit();
			
		} finally {
			sqlSession.close();
		}
		
		
		
	} //deleteDept
}
