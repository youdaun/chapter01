package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int num;
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
/*		while(true) {
			int num = sc.nextInt();
			if(num == 0) {
				System.out.println("합계: " + sum);
				System.out.println("종료");
				break;
			}
			else {
				sum = sum + num;
				System.out.println("합계: " + sum);
			}
		}
*/
		do {
		
			num = sc.nextInt();
			sum = sum + num;
			System.out.println("합계: " + sum);
			
		}while(num != 0);
		// 반복문안에 내용을 무조건 1번이상 실행해야할떄 쓴다
			
		sc.close();
	}

}
