package 제3장문제풀이;

public class DataEx03 {

	public static void main(String[] args) {
		
		// 03장. 자료형.pdf no.31 3번 문제.
		
		
		byte var01 = 127;
		short var02 = 128;
		int var03 = 128;
		long var04 = 128l;
		
		var04 = var01; // 1바이트 크기가 8바이트 long 타입으로 자동 형변환.
		System.out.println("var01="+var01+",var04="+var04);
		
		var01 = (byte)var03;//4바이트가 1바이트로 수동 형변환.
							//저장되는 값이 byte형 최대값을 벗어나서 최소값이 저장ㅇ됨.
	
		System.out.println("var01="+var01+",var03="+var03);
		
	
		

	}

}
