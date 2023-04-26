package com.sist.string;

import java.util.Scanner;

/*
 * String은 문자열 배열
 * ------ 문자마다 인덱스 번호를 가지고 있다(0부터 시작)
 * String s = "Hello Java"
 * 			   0123456789 ==> 오라클은 1번
 * 				자바		=> ==   !=  substring(0,3) => 012
 * 				오라클	=> =    <>  substr(1,5)
 * 				자바스크립트=> === !==
 * 주요기능 (310 page)
 * 1)문자열에서 문자 한개 추출 => char charAt(int index)
 */
public class 라이브러리_String_3 {
	public static void main(String[] args) {
		String msg="Hello Java";
//		for(int i=0;i<msg.length();i++) {
//			System.out.println((i+1)+"번째 문자:"+msg.charAt(i));
//		}
		
		//코딩 테스트 => msg를 거꾸로 출력하는 프로그램을 작성
//		for(int i=msg.length()-1;i>=0;i--) {
//			System.out.print(msg.charAt(i));
//		}
		
		//알파벳 문자열을 입력받아서 대문자 몇개, 소문자 몇개를 출력하는 프로그램
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 입력:");
		String s = scan.nextLine();
		
		int u=0,d=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				u++;
			} else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				d++;
			}
		}
		
		System.out.println(s+"에서 대문자는 " + u + "개, 소문자는 "+d+"개 입니다");
	}
	
}
