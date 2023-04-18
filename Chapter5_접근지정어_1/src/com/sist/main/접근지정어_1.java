package com.sist.main;
/*
 *  객체지향 프로그램
 *  1) 클래스의 구성요소 => 클래스 (모델링)
 *  2) 객체지향의 3대 요소
 *  	=캡슐화 : 데이터를 보호 (데이터 손실, 변경)
 *  		=접근하는 범위(접근지정어)
 *  	=상속/포함 : 재사용
 *  	=오버라이딩/오버로딩 = 다형성(수정, 추가가 가능)
 *  3) 클래스의 종류
 *  	=추상 클래스 / 인터페이스
 *  	=내부 클래스
 *  	=종단 클래스
 *  	=공유 클래스
 *  	--------- 객체
 *  4)API : 자바에서 지원하는 클래스 (라이브러리)
 *  	java.lang
 *  	java.util
 *  	java.io
 *  	java.net
 *  5) 클래스 조립법 : 사용자 정의 + 라이브러리
 *  -----------------------------------
 *  오라클
 *  오라클 + 자바 연동
 *  -----------------------------------
 *  웹 : HTML/CSS/JavaScript
 *  	+ 오라클 + 자바
 *  	-------------------- JSP => 분리(출력/데이터 관리) => MVC
 *  --------------------------------------------------------
 *  스프링
 *  --------------------------------------------------------
 *  AWS
 *  --------------------------------------------------------
 *  개인 프로젝트 : React + SpringBoot + JPA
 *  
 *  
 *  127page
 *  -----------
 *  1. 접근지정어의 종류
 *  ---------------------------------------------------------------------------------
 *  		클래스내에서만 사용, 같은 패키지에서 사용, 같은 패키지에서 사용				모든 클래스 접근
 *  		(자신의)							 상속을 받은 클래스는 다른 패키지
 *  										 상에서 접근
 *  ---------------------------------------------------------------------------------
 *  	private O				X					X						X
 *  	은닉화
 *  	(멤버변수)
 *  ---------------------------------------------------------------------------------
 *  	default	O				O					X						X
 *  ---------------------------------------------------------------------------------
 *  	protected O				O					O						X
 *  ---------------------------------------------------------------------------------
 *  	public O				O					O						O
 *  
 *  
 *  	1)변수 ==> private
 *  	2)메소드 ==> 다른 클래스와 연결(통신수단) => public
 *  	3)생성자 ==> public (다른 클래스에서 메모리 할당후에 사용)
 *  	---------------------------------------------------
 *  	4)class => public
 *  	5)조립 : 모든 클래스가 연결(변수)
 *  	  변수는 private => 접근 메소드를 통해서 사용
 *  	  ------------ 은닉화 => 캡슐화
 *  		1. 변수를 다른 클래스나 자신의 클래스에서 사용
 *  		   ---읽기, 쓰기
 *  			getter / setter
 */
public class 접근지정어_1 {
	class Student {
		private int hakbun;
		private String name;
		private int kor,eng,math;
		
		public void setHakbun(int hakbun) {
			this.hakbun = hakbun;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setKor(int kor) {
			this.kor = kor;
		}
		public void setEng(int eng) {
			this.eng = eng;
		}
		public void setMath(int math) {
			this.math = math;
		}
		
		public int getHakbun() {
			return hakbun;
		}
		public String getName() {
			return name;
		}
		public int getEng() {
			return eng;
		}
		public int getKor() {
			return kor;
		}
		public int getMath() {
			return math;
		}
		
	}
	
	public static void main(String[] args) {
		
	}
	
}
