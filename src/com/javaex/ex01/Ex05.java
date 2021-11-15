package com.javaex.ex01;

public class Ex05 {
	public static void main(String[]args) {
		
		//자동형변환
		System.out.println("2+3.4");
		System.out.println(2+3.4);
		
		double var01 = 2+3.4;
		System.out.println(var01);
		
		//자동형변환(long + float)
		long var02 = 12345L;
		float var03 = 1.1F;
		
		System.out.println(var02+var03); //float 형으로 바뀜
		
		
		float result = var02+var03;
		
		
		//강제 형변환
		int i = (int)11111112.3232323;
		System.out.println(i);
		
		float f01 = 12.5f;
		int i01 = (int)f01; //소수점은 버린다
		
		System.out.println(f01);
		System.out.println(i01);
		
	}
}
