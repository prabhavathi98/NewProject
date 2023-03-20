package com.onesoft.day3;

public class BooleanFunctions {
	public static void main(String[] args) {
		String name="Prabhavathi";
		boolean result1=name.contains("bha");
		boolean result2=name.startsWith("Pra");
		boolean result3=name.endsWith("hi");
		boolean result4=name.equals("prabha");
		boolean result5=name.equalsIgnoreCase("Prabha");
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
	}

}
