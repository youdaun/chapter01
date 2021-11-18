package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		int n01 = (int)(Math.random()*45)+1;
		int n02 = (int)(Math.random()*45)+1;
		int n03 = (int)(Math.random()*45)+1;
		int n04 = (int)(Math.random()*45)+1;
		int n05 = (int)(Math.random()*45)+1;
		int n06 = (int)(Math.random()*45)+1;
		*/
		
		/*
		System.out.print(n01+"\t");
		System.out.print(n02+"\t");
		System.out.print(n03+"\t");
		System.out.print(n04+"\t");
		System.out.print(n05+"\t");
		System.out.print(n06+"\t");
		*/
		
		
		int[] ball = new int[6];
		
		for(int i=0; i<6; i++) {
			ball[i] = (int)(Math.random()*45)+1;
		}
		
		for(int i=0; i<6; i++) {
			System.out.print(ball[i]+"\t");
		}

	}

}
