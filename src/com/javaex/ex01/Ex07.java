package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		//산술연산자
		System.out.println("산술연산자");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		
		System.out.println(a / b); // 몫
		System.out.println(a % b); // 나머지
		
		System.out.println("산술연산자 자세히");
		System.out.println(7.0/2.0);
		System.out.println(7.0%2.0); // 나머지값 나옴 1.0
		
		
		//부호연산자
		System.out.println("부호연산자");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		
		System.out.println(pVar);
		System.out.println(mVar);
		
		
		//증감연산자
		System.out.println("증감연산자");
		System.out.println(a); // 7
		System.out.println(++a); // a를 1올린다, a를 출력한다
		System.out.println(a); // 8 : 원본이 바뀜
		
		System.out.println(b);
		System.out.println(--b);
		System.out.println(b);
		
		System.out.println(a++); // a를 출력한다, a를 1올린다
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
