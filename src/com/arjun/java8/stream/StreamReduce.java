package com.arjun.java8.stream;

import java.util.Arrays;

public class StreamReduce {

	public static void main(String[] args) {
		int[] array = {3,5,10,15};
		int sum = Arrays.stream(array).reduce(0, (i,j) -> (i+j));
		System.out.println("Sum: " + sum);
	}

}
