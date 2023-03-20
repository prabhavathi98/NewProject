package com.onesoft.day3;

public class Test4 {
	public static void main(String[] args) {
		String word="Java is a programming language";
		String[] multiWords=word.split("\\s");
		System.out.println(multiWords[1]);
		System.out.println(multiWords[3].toUpperCase());
		System.out.println(multiWords[0].toLowerCase());
		System.out.println(multiWords[4].length());
		System.out.println(multiWords[3].concat(multiWords[4]));
		System.out.println(multiWords[1].contains("i"));
		System.out.println(multiWords[3].startsWith("pro"));
		System.out.println(multiWords[3].startsWith("ro"));
		System.out.println(multiWords[0].endsWith("va"));
		System.out.println(multiWords[3].endsWith("av"));
		System.out.println(multiWords[3].equals("programming"));
		System.out.println(multiWords[0].equalsIgnoreCase("java"));
		System.out.println(multiWords[4].charAt(3));
		System.out.println(multiWords[1].indexOf('s'));
		System.out.println(multiWords[4].substring(1,6));
		char[] result=word.toCharArray();
		System.out.println(result[3]);
		System.out.println(result[10]);
	}

}
