package net.daum.controller;

import java.util.Scanner;

import net.daum.dao.CustomerDAOImpl;
import net.daum.dto.CustomerDTO;

/* 스캐너로 고객번호를 입력받아 오라클 db에 검색한다음, 해당 고객 번호가 있는 경우 고객번호를 기준으로 고객정보를 삭제하고,
 * 해당 고객번호가 없다면 유효성 검증 경고 메시지(예외처리)를 띄운다.
 * 
 */

public class Customer_Delete01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		CustomerDAOImpl cdao = new CustomerDAOImpl();

		System.out.println(">>>>>고객정보 삭제<<<<<");
		System.out.print("검색할 고객번호 입력 >> ");

		int cus_no = Integer.parseInt(scan.nextLine());

		CustomerDTO db_cusNo = cdao.getFindCusNo(cus_no); // 오라클로부터 고객번호 검색

		if (db_cusNo != null) { // 해당 고객 번호가 있다면...
			int result = cdao.delCus(cus_no);

			if (result == 1) {
				System.out.println("고객번호 삭제 성공.");
			}
		} else {
			System.out.println("고객번호가 없어 삭제할 수 없습니다. 다시 입력해주세요.");
		}

	}

}
