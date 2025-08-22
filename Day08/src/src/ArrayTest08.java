package src;

public class ArrayTest08 {
	
	static int abs(int data) {
		if(data < 0) {
			data = -data; //양의 절대치
		}
		return data; //메서드를 호출한곳으로 절대값을 반환.
	}
	
	static void abs2(int data) {
		if(!(data < 0)) {
			System.out.println("음의 정수 숫자만 입력하세요!");
		} else {
			if(data <0) {
				data = -data; // 양의 절대값
			}//if
			System.out.println("절대값 = "+data);
		}//if else		
	}
	
	public static void main(String[] args) {
		
		int resultData = abs(-50);
		System.out.println("-100의 절대값 = "+ resultData);
		
		int CC = abs(-20000);
		System.out.println("-100의 절대값 = "+ CC);
	}




}
