package Day01;

/*  자바의 실수 숫자 자료형(타입)의 종류 :
 * 
 * 
	float -> 크기는 4 바이트고, 저장되는 정밀도는 7자리.
	값 뒤에 접미사가 붙는다. 접미사는 생략 불가.
	
	
	double -> 크기는 8바이트. 15자리까지. 접미사 d or D 가 붙음.
	자바의 기본 실수 숫자 타입에 해당. 따라서 접미사는 생략 가능.
	*/
	
public class DataType04 {

	public static void main(String[] args) {
		
		float a = 10.32f ;
		float b = 122.222f ;
		double c = 50.123121 ;
		float d = 12322.222f;
		double e = 121.2222222f;
		System.out.println("a = "+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);
		
		


	}

}
