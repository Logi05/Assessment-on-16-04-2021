package com.training;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TraverseArrayList {
	public static void main(String[] args) {
		ArrayList<String> list=(ArrayList<String>)Stream.of("Ram","Logi","Priya").collect(Collectors.toList());
		list.stream()
				.forEach((a) -> {
					System.out.println(a+" ");
				});
	}
}
