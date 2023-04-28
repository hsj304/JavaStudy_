package com.sist.util;

import java.util.StringTokenizer;

// 네트워크
/*
 * 	String s = "red|green|blue|black|yellow";
 * 	=> split, StringTokenizer
 * 	=> StringTokenizer st = new StringTokenizer(s, "|")
 * 	   ------------------------------------------------
 * 	   String[] colors = s.split("\\|")
 * 				=> 원형 : split(String regex)
 * 
 */
public class 라이브러리_StringTokenizer_2 {
	public static void main(String[] args) {
		String s = "red|green";
		
		StringTokenizer st = new StringTokenizer(s, "|");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
