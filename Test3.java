package com.onesoft.day3;

public class Test3 {
	public static void main(String[] args) {
		String word="Welcome-to-my-world";
		String[] multipleWord=word.split("-");
		String result=multipleWord[2].concat(multipleWord[3]);
		System.out.println(result.toUpperCase());
		char letter=multipleWord[0].charAt(multipleWord[0].length()-1);
		System.out.println("Last letter of welcome is "+letter);
		System.out.println("Length of to is "+multipleWord[1].length());
		System.out.println(multipleWord[3].substring(1, 4));
		System.out.println("Array length is "+multipleWord.length);
	}

}
