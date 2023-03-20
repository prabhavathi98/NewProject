package com.onesoft.day3;

public class Test1 {
	public static void main(String[] args) {
		String firstName="Ram";
		String lastName="Kumar";
		String result1=firstName.toUpperCase();
		String result2=lastName.toUpperCase();
		String result3=result1.concat(result2);
		int result4=result3.length();
		System.out.println(result3);
		System.out.println("Length is "+result4);
	}

}
