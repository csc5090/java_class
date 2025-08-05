package Day01;

/* 자바의 변수 선언법)
 *  자료형(타입) 변수명; //; 세미콜론은 자바언어에서 한 문장의 끝. 마침표와 같은 뜻.
 *  변수명을 선언하고 최초값을 저장하는 것을 변수 초기화라고 한다.
 *  
 */
public class DataType02 {
	public static void main(String[] args) {
		
		int age= 25; // 4바이트 int 타입 변수 age에 변수를 선언.
		//age = 25; =은 오른쪽 정수숫자값 25를 좌측 변수 age에 정해준 대입연산자.
		System.out.println("나이:"+ age);
		
		age=30;//선언문 하나당 변수는 하나씩만 선언가능. 마지막에 저장된 값이 남게 됨.
		System.out.println("변경된 나이:"+age);
		
		
		
		
		
	}
}
