package com.arjun.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPeek {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C", "D");
		list.stream().peek(x -> System.out.println(x + x)).collect(Collectors.toList());
	}

}
