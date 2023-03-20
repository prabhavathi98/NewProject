package com.onesoft.day3;

public class CheckEqualsIgnoreCase {
	public static void main(String[] args) {
		String name="Singapore";
		boolean result=name.equalsIgnoreCase("Singapore");
		boolean result1=name.equalsIgnoreCase("SINGAPORE");
		System.out.println(result);
		System.out.println(result1);
	}

}
