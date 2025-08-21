package DDIT;

public class ArrayEx06 {

	public static void main(String[] args) {

		int[] iArr01 = new int[10];
		int[] iArr02 = new int[] { 100, 99, 100, 90, 100 };
		int[] iArr03 = { 100, 100, 85, 95, 90 };
		int[] chArr = { 'a', 'b', 'c', 'd', 'e' };

		for (int i = 0; i < iArr01.length; i++) {
			iArr01[i] = i + 1;
			System.out.print(" " + iArr01[i]);

		}

		System.out.println("\n====================================\n");

		for (int k : iArr02) {
			System.out.print(" " + k);
		}

		System.out.println("\n====================================\n");

		System.out.println(Arrays.toString(iArr03)); // 자바 내장 api를 사용해서 배열 원소값을 문자열로 반환
		System.out.println(chArr);

	}

}
