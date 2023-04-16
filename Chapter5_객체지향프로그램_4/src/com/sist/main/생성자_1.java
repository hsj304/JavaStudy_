package com.sist.main;
/*
 * 	생성자 :
 * 		1) 객체가 생성될때 호출 메소드
 * 			A a=new A()
 * 					--- 생성자
 * 		2) 특징
 * 		  = 클래스명과 동일
 * 	   	  = 리턴 타입이 없음
 * 			class A {
 * 				A() {}		O
 * 				void A() {}	X 일반 메소드
 * 				A(int a){}	O
 * 				A(int a, int b){}	O
 * 			}
 * 		  = 멤버 변수의 초기화
 * 		  = 생성자는 여러개 사용이 가능(한개의 클래스)
 * 		  = 데이터베이스 연결, 네트워크 연결, 윈도우.....
 * 		  = 자동 추가
 * 			-------
 * 			import java.lang.*
 * 			class A extends Object
 * 					---------------
 * 			생성자 : 기본생성자()
 * 			return : void
 * 
 * 		3) 역할
 * 		  = 시작과 동시에 처리
 * 		 	예) 자동 로그인
 * 				오라클 연결
 * 				서버 연결...
 * 		  = 멤버 변수 초기화
 * 		  = 필요시마다 사용한다 (생략가능)
 * 							--- 컴파일러에 의해 자동으로 추가
 * 
 * 			
 */
public class 생성자_1 {

	public static void main(String[] args) {
		

	}

}
