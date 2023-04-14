/*
 * 		기초
 * 		 =변수, 데이터형 (정수:int, byte, long,  실수 : double, boolean, char)
 * 		 =연산자, 제어문
 * 		  ---- 단항연산자 (++, --, !, (type))
 * 			   이항연산자(산술, 비교, 논리, 대입)
 * 			   삼항연산자
 * 			   조건문(단일 if, 선택 if~else, 다중 if~else if...)
 * 			   반복문(for, while)
 * 					----  이차 for, for-each
 * 			   반복제어문(break)
 * 		 =배열 : 1차
 * 		 =문자열 저장 => String
 * 			기능 : 
 * 				javascript
 * 				1)equals : 문자열 비교
 * 				  boolean equals(String s)
 * 				2)startsWith : 시작 문자열
 * 				  boolean startsWith(String s)
 * 				3)endsWith : 끝문자열
 * 				  boolean endsWith(String s)
 * 				4)contains : 포함
 * 				  boolean contains(String s)
 * 				5)length : 문자 갯수
 * 				  int length()
 * 				6)indexOf() : 문자, 문자열의 위치 (처음부터)
 * 				  ***문자열은 index번호가 0부터 시작
 * 				7)lastIndexof() : 문자 문자열의 마지막 위치 (뒤부터)
 * 				8)trim : 좌우 공백 제거
 * 				  String trim()
 * 				9)valueOf : 모든 데이텨형을 문자열로 변환
 * 				  valueOf(1) => "1"
 * 				  *** 윈도우 / 웹 => 모든 데이터형 문자열
 * 				  static String valueOf(모든 데이터형) : String에서 유일하다
 * 				  String.valueOf(1)
 * 				10) replace() : 변환(문자열, 문자)
 * 				   String replace(char,char)
 * 				   String replace(String, String)
 * 				11)replaceAll : 변환(문자열)
 * 				   String replaceAll(String, String)
 * 									 ------ regexp => 정규식
 * 				   replaceAll("[가-힣]", "")
 * 					[A-Z]  [a-z]  [0-9]
 * 				12)substring() : 문자열을 자르는 경우
 * 				   String substring(int s)
 * 				   String substring(int s, ine e)
 * 
 * 					   변수  메소드
 * 		class : 설계 => 속성, 기능 
 * 				웹 => 출력 내용(변수)
 * 				  => 메뉴, 버튼 => 기능 
 * 				--------------------- 요구사항분석(설계)
 * 		추상화 : 설계(지능, 데이터) : 사물을 단순화
 * 		 예)
 * 			사원 : 사번, 이름 ...
 * 				  출근한다, 퇴근한다....
 * 		--------------------------------------------
 * 		class 설계 ==> 메모리 저장 (인스턴스)
 * 				 	  new( 클래스를 저장할때 => new)
 * 					  **Spring은 new를 사용하지 않는것이 규칙
 * 					 
 * 		
 */

class Student {
	int hakbun;
	String name;
}
public class 클래스의구성요소_1 {
	public static void main(String[] args) {
		Student hong = new Student();
		
		hong.hakbun=1;
		hong.name="홍길동";
		Student shim = hong;
		shim.hakbun=2;
		shim.name="심청이";
		System.out.println(hong.hakbun);
		System.out.println(hong.name);
	}
}
