package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
//		switch(month) {
//		case 1:
//			System.out.println("31일");
//			break;
//		case 2:
//			System.out.println("28일");
//			break;
//		case 3:
//			System.out.println("31일");
//			break;
//		case 4:
//			System.out.println("30일");
//			break;
//		case 5:
//			System.out.println("31일");
//			break;
//		case 6:
//			System.out.println("30일");
//			break;
//		case 7:
//			System.out.println("31일");
//			break;
//		case 8:
//			System.out.println("31일");
//			break;
//		case 9:
//			System.out.println("30일");
//			break;
//		case 10:
//			System.out.println("31일");
//			break;
//		case 11:
//			System.out.println("30일");
//			break;
//		default:
//			System.out.println("31일");
//			break;
//			
//		}	
		
		switch (month) {
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30일");
				break;
			case 2:
				System.out.println("28일");
				break;
			default:
				System.out.println("31일");
				break;
		} // break 없는 switch-case문은 권장하지 않음
		
		sc.close();

	}

}
