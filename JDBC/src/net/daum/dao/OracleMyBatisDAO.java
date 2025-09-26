package net.daum.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import net.daum.dto.DeptDTO;

/*
 * DAO (Data Access Object) 실제로 데이터베이스(DB)에 접근하여 CRUD(Create(데이터 저장) -> insert 쿼리문 ,
 *    Read(데이터 조회) -> select 쿼리문 , Update, Delete) 작업을 수행하는 곳 
 */

/*
 *   mybatis 쿼리문 실행메서드 정리)
 *     1. selectOne() : 하나의 결과 레코드만 조회할 때 사용
 *     2. selectList() : 하나 이상의 레코드를 검색해서  컬렉션 List<제네릭타입>으로 반환
 *     3. insert() : 레코드 저장, 반환값은 저장 쿼리문 수행후 성공한 레코드 행(row)의 수 반환
 *     4. update() : 레코드 수정, 반환값은 수정 쿼리문 수행후 성공한 레코드 행의 수를 반환
 *     5. delete() : 레코드 삭제, 반환값은 삭제 쿼리문 수행후 성공한 레코드 행의 수를 반환     
 */

public class OracleMyBatisDAO {
	
	public List<DeptDTO> selectAll(SqlSession sqlSession) {
		List<DeptDTO> dlist = sqlSession.selectList("dept_list"); 
		
		return dlist;
	}

	public void insertDept(DeptDTO deptDTO, SqlSession sqlSession) {
		sqlSession.insert("dept_in", deptDTO);		
		
	}//insertDept()
	
	public DeptDTO getFindDeptNo(int deptno, SqlSession sqlSession) {
		return sqlSession.selectOne("dept_info", deptno);
	} //getFindDeptNo

	public void updateDept(DeptDTO dept, SqlSession sqlSession) {
		sqlSession.update("dept_edit", dept); //mybatis에서 update()메서드는 레코드를 수정한다.
		//dept_edit은 매퍼xml에서 설정하는 유일 아이디명
		
	}//updateDept()

	
	//부서번호를 기준으로 부서삭제
	public void deleteDept(DeptDTO dept, SqlSession sqlSession) {
		sqlSession.delete("dept_del", dept);
	} //deleteDept()
	
	
	

}
