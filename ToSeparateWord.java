package com.onesoft.day3;

public class ToSeparateWord {
	public static void main(String[] args) {
		String name="HelloWorld";
		String[] words=name.split("o");
		System.out.println(words[0].toUpperCase());
		System.out.println(words[1].length());
		int arrayLength=words.length;
		System.out.println(arrayLength);
	}

}
