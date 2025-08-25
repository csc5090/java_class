package src;

/* new 키워드로 새롭게 생성된 객체는 서로 다른 객체 주소를 가진다. */

class Tv05 {
	int channelNumber; // 채널 번호
} // Tv05 class

public class ObjectEx05 {
	public static void main(String[] args) {

		Tv05 tv01 = new Tv05();
		Tv05 tv02 = new Tv05(); // tv01과 tv02는 서로 다른 객체주소를 가진다.

		System.out.println("tv01 채널번호 : " + tv01.channelNumber + "\ntv02 채널번호 : " + tv02.channelNumber); // 0,0

		tv01.channelNumber = 10;
		System.out.println("tv01 채널번호 : " + tv01.channelNumber + "\ntv02 채널 번호 : " + tv02.channelNumber); // 10,0

		tv02.channelNumber = 39;
		System.out.println("tv01 채널번호 : " + tv01.channelNumber + "\ntv02 채널 번호 : " + tv02.channelNumber); // 10,39

	}
}
