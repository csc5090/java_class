package net.daum.controller;

import java.util.List;
import java.util.Scanner;

import net.daum.dto.DeptDTO;
import net.daum.service.OracleMyBatisService;

/*  서비스 흐름은 컨트롤러 ↔ 서비스 ↔ DAO ↔ MyBatis 매퍼태그 해당 아이디를 호출해서 쿼리문 수행
 *  실제 코드 작업은 서비스 흐름의 반대로 하는 것이 좋다.
 *  
 *  패키지 정리)
 *   net.daum.controller -> 자바 애플리케이션 프로그램 개발에서 최초 시작지점인 main() 정적메서드가 포함된 클래스가 있는 곳
 *   net.daum.service -> 컨트롤러와 DAO사이 중간 매개체 역할을 하는 *Service 클래스가 들어가는 곳
 *   net.daum.dao ->  DAO (Data Access Object) 실제로 데이터베이스(DB)에 접근하여 CRUD(Create(데이터 저장) -> insert 쿼리문 ,
 *    Read(데이터 조회) -> select 쿼리문 , Update, Delete) 작업을 수행하는 곳 
 *   net.daum.mappers.mybatis -> sql문을 담고 있는 mybatis 매퍼태그 파일인 Mapper.xml 파일이 위치한 곳, 트랜잭션 설정과 커넥션 풀 
 *   그리고 데이터베이스 연결 정보와 SQL문을 담고 있는 MyBatis 매퍼태그 파일 경로가 설정된  Configuration.xml 파일이 들어간 경로
 *   net.daum.dto -> 람복 라이브러리를 사용한 데이터 저장빈 클래스가 들어간 곳
 *   net.daum.config -> Configuration.xml 파일을 읽어와 mybatis 쿼리문 실행 객체 SqlSession을 반환하는 정적메서드인 getSqlSession()
 *   가 있는 MyBatisSessionFactory 클래스 파일이 있는 곳
 */

public class OracleMyBatisMain {

	private Scanner scan = new Scanner(System.in);
	OracleMyBatisService service = new OracleMyBatisService();

	// 부서목록을 가져오는 메서드

	public void list() {
		System.out.println();
		System.out.println("[부서 목록]");
		System.out.println("-------------------------------------");
		System.out.printf("%-6s%-12s%-16s\n", "부서번호", "부서명", "부서지역");

		/*
		 * %-6s에서 %s는 문자열 출력 형태지시자이다. -는 왼쪽 정렬, 6은 최소 출력 너비 6칸, 결국 %-6s는 문자열을 왼쪽으로 정렬하고,
		 * 전체너비를 6칸으로 맞추라는 의미이다. 빈칸이 남으면 오른쪽 공백이 들어간다.
		 * 
		 */

		System.out.println("------------------------");

		List<DeptDTO> dlist = this.service.selectAll(); // 부서목록을 가져온다. this.은 생략 가능.

		if (dlist != null && dlist.size() > 0) { // size메서드는 컬렉션 원소개수를 반환. 첫 원소개수 카운트는 1부터.

			for (DeptDTO d : dlist) {
				System.out.printf("%-6d%-12s%-16s\n", d.getDeptno(), d.getDname(), d.getLoc());
			}
		} else {
			System.out.println("부서목록이 없음");
		}
		mainMenu();
	} // list()

	public void mainMenu() {
		System.out.println();
		System.out.println("------------------");
		System.out.println("메인 메뉴 : 1.Create | 2.Read | 3.Clear | 4.Exit");
		System.out.print("메뉴 선택 >> ");
		String menuNo = scan.nextLine(); // 문자열로 입력받는다.
		System.out.println();

		// switch~case 다중 선택문으로 분기
		switch (menuNo) {
		case "1":
			create();
			break; // 부서정보 추가
		case "2":
			read();
			break;
			// case "3" : clear(); break;
		case "4":
			exit();
			break;
		}
	} // 메인 메뉴 메서드 호출

	public void read() {
		System.out.println("[부서정보 보기(읽기)]");
		System.out.print("부서번호 입력 >> ");
		int deptno = Integer.parseInt(scan.nextLine());

		// DB 호출은 여기서 딱 한 번만!
		DeptDTO findDept = service.getFindDeptNo(deptno);

		if (findDept != null) { // 부서 정보가 있다면
			// 위에서 찾아온 findDept 변수를 그대로 사용합니다.
			System.out.println("#############");
			System.out.println("부서번호 : " + findDept.getDeptno());
			System.out.println("부서명 : " + findDept.getDname());
			System.out.println("부서지역 : " + findDept.getLoc());

			// 보조메뉴 출력
			System.out.println("---------------------------");
			System.out.println("보조 메뉴 : 1. Update 2. Delete 3.List");
			System.out.print("메뉴 선택 >> ");
			String menuNo = scan.nextLine();
			System.out.println();

			if (menuNo.equals("1")) {
				update(findDept);
			} else if (menuNo.equals("2")) {
				delete(findDept);
			} else {
				list(); // 부서목록보기로 이동
			}
		} else {
			System.out.println("해당 부서 정보가 없음");
			list();
		}

	} // read

	// 부서번호를 기준으로 부서 삭제
	public void delete(DeptDTO dept) {
		System.out.println("[부서 삭제]");
		System.out.println("----------------");
		System.out.println("보조메뉴 : 1.OK | 2.Cancel");
		System.out.print("메뉴 선택 >> ");
		String menuNo = scan.nextLine();

		if (menuNo.equals("1")) {
			service.deleteDept(dept); // 부서번호를 기준으로 부서 삭제
			list();
		} else {
			list();
		}
	}

	public void update(DeptDTO dept) {
		System.out.println("[부서 수정 정보 입력");
		System.out.print("수정할 부서명 입력 >> ");
		dept.setDname(scan.nextLine());
		System.out.print("수정할 부서지역 입력 >> ");
		dept.setLoc(scan.nextLine());

		System.out.println("--------------");
		System.out.println("보조메뉴 : 1.OK | 2.Cancel");
		System.out.print("메뉴 선택 >> ");
		String menuNo = scan.nextLine();

		if (menuNo.equals("1")) {
			System.out.println("\n --------------------");
			service.updateDept(dept); // 부서번호를 기준으로 부서명과 부서지역을 수정
			list();
		} else {
			list();
		}
	}// update

	public void create() {
		System.out.println("##### 부서 정보 입력 #####");
		System.out.print("부서번호 입력 >> ");
		int deptno = Integer.parseInt(scan.nextLine()); // 부서번호를 문자열로 입력받아 정수숫자로 변환.
		System.out.print("부서명 입력 >> ");
		String dname = scan.nextLine();
		System.out.print("부서가 있는 지역 입력 >> ");
		String loc = scan.nextLine();

		System.out.println("-----------------");
		System.out.print("보조 메뉴 : 1.OK | 2.Cancle ");
		System.out.print("메뉴 선택 >> ");
		String menuNo = scan.nextLine();

		if (menuNo.equals("1")) {
			service.insertPept(new DeptDTO(deptno, dname, loc)); // 오버로딩된 생성자를 호출하면서 부서정보 저장
			list(); // 저징 이후 목록 보기
		} else {
			list();
		}
	}// create

	public void exit() {
		System.out.println("*** 부서 프로그램 종료 ***");
		System.exit(0); // 정상종료
	}

	public static void main(String[] args) {

		OracleMyBatisMain oracleMybatis = new OracleMyBatisMain();
		oracleMybatis.list(); // 부서목록 가져오는 메서드 호출

	}

}
