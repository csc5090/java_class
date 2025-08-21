package Coding_Test_;

public class Coding_Test_01 {

	public static void main(String[] args) {
		
		int[] ABC = new int[5];
		ABC[0] = 1;
		ABC[1] = 2;
		ABC[2] = 3;
		ABC[3] = 4;
		ABC[4] = 5;
		
		for (int i=0; i<ABC.length; i++) {
			ABC[i] = i * 2;
			System.out.print(ABC[i]);

		}
	}

}
