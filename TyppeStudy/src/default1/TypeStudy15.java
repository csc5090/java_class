package default1;

class ObjectEx15 {
	int sum = 0;

	public ObjectEx15() {
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
	}

	public int getSum() {
		return sum;
	}

}

public class TypeStudy15 {

	public static void main(String[] args) {

		int result_total = new ObjectEx15().getSum(); // new ObjectEx15()에 의해서 기본생성자를 호출
		System.out.println("1부터 100까지 누적합 = " + result_total);

	}

}
