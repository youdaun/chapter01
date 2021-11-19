package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		
		int[] arrA = new int[] {10, 50, 30};
		int[] arrB = new int[] {10, 20, 30};
		
		if(arrA.length == arrB.length) {
			for(int i=0; i<arrA.length; i++) {
				if(arrA[i] != arrB[i]) {
					System.out.println((i+1) + "번째 값이 다릅니다.");
				}
			}
		}
		else {
			System.out.println("배열의 크기가 다릅니다.");
		}

	}

}
