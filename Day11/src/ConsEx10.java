/* 2025년 8월 28일
 * 개발자 : 최상철 
 * 
 * 자바에서 생성자가 오버로딩이 안 되었을 때는 컴파일러가 전달인자가 없는 기본생성자를 묵시적으로 제공한다.
 * 그러므로 코드를 생략해도 된다.
 * 하지만 생성자가 오버로딩이 된 경우는 기본생성자 묵시적 제공을 하지 않는다.
 * 이런경우 기본생성자를 호출하려고 하면 컴파일 에러가 발생한다.
 * 
 */ 

class Data10{
	int value; // 인스턴스 변수
	
	//기본생성자 묵시적 제공 안함.
	Data10(int value) {
		this.value = value;
	}//생성자 오버로딩
	
	void pr() {
		System.out.println("value = "+value);
	}
	
}


public class ConsEx10 {

	public static void main(String[] args) {
		
		new Data10().pr(); // new Data10()에 의해서 기본생성자를 호출하려다가 컴파일 에러 발생.
		

	}

}
