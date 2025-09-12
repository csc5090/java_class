package src;

/* 2025 - 09 - 12
 * 개발자 : 최상철
 * 
 * 참조변수만 선언하고 null이 대입된 상태에서 해당 클래스의 소속 멤버변수 등에 접근하면 완전한 객체주소가 저장 안 된 상태라서
 * NullPointerException 예외 오류가 발생함.
 * 
 */

class Member04 {
	String mem_id = "kkkkk"; // 회원아이디
	String mem_name = "홍길동"; // 회원 이름
	String mem_email = "hong@gmail.com"; // 회원 이메일
}

public class TryCatchEx04 {

	public static void main(String[] args) {

		Member04 member = null;

		try {
			System.out.println("아이디:" + member.mem_id + ", 회원 이름 : " + member.mem_name + ", 회원 이메일 : " + member.mem_email);

		} catch (Exception e) {
			System.out.println("에외 발생:" + e);

			member = new Member04();
			System.out.println(
					"아이디:" + member.mem_id + ", 회원 이름 : " + member.mem_name + ", 회원 이메일 : " + member.mem_email);
		}

	}

}
