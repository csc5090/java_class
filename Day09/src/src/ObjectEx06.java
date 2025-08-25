package src;

/* new 키워드로 서로 다른 객체를 생성했지만, 같은 객체 주소를 가리키는 방법에 대한 소스예) */

class Tv06 {
	int channel;

}

public class ObjectEx06 {

	public static void main(String[] args) {

		Tv06 tv01 = new Tv06();
		Tv06 tv02 = new Tv06(); // tv01과 tv02는 서로 다른 객체주소를 가지고 있음.

		tv02 = tv01; // tv01 객체주소가 tv02에 대입됨. 기존 tv02 객체 주소는 사라진다. 결국 tv01과 tv02는 같은 객체주소를 가리킨다.

		tv01.channel = 7; // 채널 번호가 0에서 7로 변경됨. 따라서 tv02로 접근하는 채널번호도 7로 변경됨.
		System.out.println("변경 된 tv01 채널번호 : " + tv01.channel + "\n변경 된 tv02 채널번호 : " + tv02.channel); // 7,7

	}

}
