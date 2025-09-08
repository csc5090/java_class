package net.daum.controller01;

public class ObjectEx16 {

	int[] score;
	int sum;

	public ObjectEx16(int[] arr) {
		this.score = arr;
	}// 생성자 오버로딩

	public void setArr() {
		for (int k : score) {
			System.out.print(" " + k);
			sum += k;
	}
		System.out.println("\n ======================= \n");
	}

	public Object getScore() {
		return sum;
	}
}
