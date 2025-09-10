package Coding_Test_;

class ssccd {
	public static void main(String[] args) {
		int price = 999999;
		int answer = 0;

		if (100000 <= price && price < 300000) {
			answer = (price - (int) (price * 0.05));
		} else if (300000 <= price && price < 500000) {
			answer = (price - (int) (price * 0.1));
		} else if (500000 <= price && price <= 1000000) {
			answer = (price - (int) (price * 0.2));
		}
		
		System.out.println(answer);

	}
}