package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		int age = sc.nextInt();
		
		sc.nextLine(); // 넥스트라인을 한번소비한다.(nextInt 다음에 nextLine이 오면 
		// 엔터가 자동으로 입력되는 오류때매 다른경우에는 쓰지 않아도 됨)
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		String name = sc.nextLine();
		
		System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 입니다.");
		sc.close();
	}
}
