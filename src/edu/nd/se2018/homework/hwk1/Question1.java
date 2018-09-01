package edu.nd.se2018.homework.hwk1;

import java.util.*;

public class Question1 {
		
	public Question1(){}
	
	public int getSumWithoutDuplicates(int[] numbers){
		HashSet<Integer> h = new HashSet<Integer>();
	    for (int i = 0; i < numbers.length; i++){
	    	if (!h.contains(i)){
	    		h.add(numbers[i]);
	    	}
	    }
        Integer integerSum = h.stream().mapToInt(Integer::intValue).sum();
	    return integerSum;
	    
	}
	
	public static void main(String[] args) {
		Question1 q = new Question1();
		int res = q.getSumWithoutDuplicates(new int[] {1,2,2,2,2,2,2});
		System.out.println(res);
	}
}
