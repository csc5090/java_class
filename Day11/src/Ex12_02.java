
/* 2025년 8월 28일
 * 개발자 : 최상철 
 * 
 * 2번 문제) 강의 교안에 있는 문제. 
 */

class Mp3 {

	private String comp; // 회사명
	private int size = 8; // 메모리 용량

	public String getComp() { // getter() 메서드 - 값 반환해줌.

		return comp;
	}

	public void setComp(String new_comp) { // 값 저장 setter 메서드
		comp = new_comp;

	}

	public int getSize() {
		return size;
	}

	public void setSize(int new_size) {
		size = new_size;
	}

}// mp3 class

public class Ex12_02 {

	public static void main(String[] args) {
		Mp3 mp = new Mp3();
		mp.setComp("갑을회사");
		mp.setSize(8);
		System.out.println("회사명 : " + mp.getComp());
		System.out.println("메모리 용량 : " + mp.getSize());

	}
}
