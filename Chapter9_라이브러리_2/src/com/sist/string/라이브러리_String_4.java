package com.sist.string;

import java.util.Scanner;

/*
 * 문자열을 입력해서 좌우대칭여부 확인
 * ABBA
 */
public class 라이브러리_String_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		while(true) {
			System.out.print("문자열 입력:");
			s = scan.nextLine();
			
			if(s.length()%2 != 0) {
				System.out.println("문자 갯수가 짝수여야 합니다");
				continue;
			}
			break;
		}
		
		boolean b=true;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i) != s.charAt(s.length()-i-1)) {
				b = false;
				break;
			} 
		}
		
//		boolean b=false;
//		int j= s.length()-1;
//		for(int i=0;i<s.length()/2;i++) {
//			if(s.charAt(i) == s.charAt(j)) {
//				b = true;
//			} else {
//				b=false;
//				break;
//			}
//			j--;
//		}
		
		
		
		if(b) {
			System.out.println(s + "는 대칭입니다");
		} else {
			System.out.println(s + "는 대칭이 아닙니다");
		}

	}

}
