
/* 4번문제(과제)
 * 
 * 
 * 
 */



class HandPhone {
	protected String model;
	protected String number;
	
	public HandPhone() {}
	public HandPhone(String model, String number) {
	this.model=model;
	this.number=number;
	
		
	
	
	}
}








public class Ex16_5 {

	public static void main(String[] args) {


		DicaPhone dp=new DicaPhone(“갤럭시”,“010”,“1024”);
		dp.prnDicaphone( );

			//모델명 : 갤럭시 번호 : 010 화소수 : 1024 < 실행결과

	}

}
