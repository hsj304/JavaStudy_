package com.sist.util;

import java.util.Arrays;
import java.util.Random;

public class 라이브러리_Random_1 {
	public static void main(String[] args) {
		char[] alpha = new char[10];
		Random r = new Random();
		for(int i=0;i<alpha.length;i++) {
			alpha[i]=(char)(r.nextInt(26)+65);
		}
		System.out.println(Arrays.toString(alpha));
		Arrays.sort(alpha);
		System.out.println(Arrays.toString(alpha));
		
		
	}
}
