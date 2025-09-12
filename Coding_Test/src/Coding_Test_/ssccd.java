package Coding_Test_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ssccd {
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		
		nums.add(10);
		nums.add(5);
		nums.add(20);
		nums.add(5);
		nums.add(10);
		nums.add(30);
		
		Set<Integer> fresh = new HashSet<>(nums);
		List<Integer> finallist = new ArrayList<>(fresh);
		Collections.sort(finallist);
		
		System.out.println(finallist);
		
		
		
		
	}
}