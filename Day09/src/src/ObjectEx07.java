package src;

//객체 배열

class Tv07 {
	String color; // tv색상
	boolean power; // 전원상태
	int channel; // 채널번호

	// 3개의 tv07 클래스 메서드 정의

	void power() {
		power = !power; // !false => true
	}

	void channelUp() {
		++channel; // 채널 번호 선행 증가
	}

	void channelDown() {
		--channel; // 채널번호 선행감소
	}

} // tv07 class

public class ObjectEx07 {

	public static void main(String[] args) {

		Tv07[] tvArr = new Tv07[3]; // 배열크기가 3인 객체배열 tvArr생성

		// Tv07 객체를 생성해서 tvArr 객체 배열의 각 요소에 저장

		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv07(); // 배열의 i번째에 새 Tv07 객체를 저장, 즉 tvArr[i]에 Tv07 객체의 참조 주소값을 저장
			tvArr[i].channel = i + 10; // 채널 번호 10, 11, 12 저장
			System.out.println("tvArr[" + i + "] : " + tvArr[i].channel);
		} // for

		// 채널번호를 1증가하고 출력
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp(); // 각 채널번호 1증가
			System.out.printf("tvArr[" + i + "].channel=%d\n", tvArr[i].channel); // 11 12 13 채널 번호 출력
		} // for2

	}

}
