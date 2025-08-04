package Day01;

public class YT_PRACTICE {

	public static void main(String[] args) {
		
		//double 과 float의 차이
		double a = 3.14222222222;
		float f = 3.4232222223f;
		System.out.println(a);
		System.out.println(f);
		
		// 한번에 주석
		
		/*
		 * long c = 12380912480912l; System.out.println(c);
		 * 
		 * boolean csc = true; System.out.println(csc);
		 */
		
		// 형변환.
		
		int score = 92;
		System.out.println(score);
		System.out.println((float) score);
		System.out.println((double) score);
		
		float score_f = 93.3F;
		double score_d = 98.2;
		System.out.println((int)score_f );
		
		score = 93 + (int) 98.8;
		System.out.println(score);
		score_d = (double) 90 + 130;
		System.out.println(score_d);
		
		//숫자를 문자열로.
		
		String c = String.valueOf(93);
		c = Integer.toString(93);
		System.out.println(c);
		System.out.println(c);
		
		String c2 = String.valueOf(123);
		c2 = Double.toString(123);
		System.out.println(c2);
		
		
		//문자열을 숫자로
		
		int a = Integer.parseInt("199");
		System.out.println(a);
		
		
		
		
		
		
		
	

	}

}
