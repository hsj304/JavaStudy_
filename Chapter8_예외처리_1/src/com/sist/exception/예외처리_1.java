package com.sist.exception;
/*
 * 		에러발생
 * 			1. 프로그래머의 실수
 * 				=> 초기값이 없는 상태에서 비교
 * 				=> 배열인덱스 오류
 * 				=> 무한 루프
 * 				=> 파일명 오류..
 * 			2. 사용자 입력 오류
 * 				=> 계산기 나누기 => 0
 * 				=> 정수 => 문자열
 * 				----------------- 웹에서 유효성 검사
 * 		예외처리 : 견고한 프로그램을 만들기 위해 사용
 * 				 ---------- 비정상을 방지하고 정상상태 유지
 * 				 ---------- 사전에 에러를 방지하는 프로그램
 * 		1. 예외처리 방식
 * 			= 고려할 점 : if => 예외처리
 * 			= 예외처리  : 복잡한 에러, if으로 해결이 불가능
 * 				웹 : 404, 500(소스오류), 415(한글변환), 400(값을 잘못받는 경우), 403(접속거부)......
 * 					404 : 파일이 없는 경우
 * 		2. 예외처리 종류
 * 						NumberFormatException  
 * 				사용자로부터 문자열을 받아서 정수 변경후에 배열에 저장   나누기를 한 후에 출력
 * 						 -------------------   ------- 	 -----------
 * 			= 예외발생시 => 복구
 * 			  try ~ catch
 * 			= 예외발생시 => 회피
 * 			  throws
 * 			= 예외발생시 => 테스트
 * 			  throw
 * 			= 사용자 정의 예외
 * 			  => 지원하지 않는 예외가 존재
 * 
 * 		예외처리의 계층구조
 * 			Object
 * 			  |
 * 			Throwable
 * 		---------------------
 * 		|					|
 * 	  Error				Exception
 * 							|
 * 					---------------------------------------------------------
 * 					|반드시 예외처리												|필요시에만 사용
 * 				CheckException											UnCheckException
 * 					|														|
 * 				IOException												RuntimeException
 * 					(입출력) - 메모리, 파일, 네트워크								|
 * 					java.io => 클래스가 동일								NumberFormatException => 문자열 정수형으로 변경, 윈도우/웹
 * 				SQLException(오라클 연동) - java.sql => 네트워크 통신			NullPointerException => 주소가 할당되지 않았는데 참조할 경우
 * 					자바응용프로그램 <========> 오라클							ArrayIndexOfOutBoundsException => 배열 범위 초과
 * 					(C)						(S)							ClassCastException => class 형변환이 틀린 경우
 * 					Clinet					Server						ArithmeticException => 0으로 나눌 경우
 * 					=>웹에 출력하는 모든 데이터 => 오라클							IllegalArgument
 * 					=> 자바 ============오라클	
 * 					  		자바전송(X)
 * 					(SQL)	오라클이 인식하는 언어전송
 * 							  
 * 				ClassNotFoundException(리플렉션)
 * 				=> 클래스명이 틀린 경우
 * 				Class.forName("패키지.클래스명")
 * 				.....
 * 				MalformedURLException
 * 					=> URL주소가 틀린경우
 * 					=> Jsoup
 * 				InterruptedException
 * 					=> 쓰레드 충돌
 * 
 * 
 * 	예외의미 => 프로그램에서 돌발적으로(의도하지 않은 상황)에서 문제가 발생시 처리를 어떻게 할지
 * 				프로그램은 에러 발생시 비정상 종료 => 방지하고 정상적으로 종료가 가능하게 만드는 과정(예외처리)
 */
public class 예외처리_1 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		if(b!=0) { //정상수행 => try
			int c=a/b;
			System.out.println("c="+c);
		} else { //예외처리 => catch
			
			
			
			
			System.out.println("0으로 나눌수 없습니다");
		}
		//1. 정상적으로 종료가 되게 만든다
		//2. 우선적 => if문으로 처리가 가능한지 => 자바에서 제공하는 예외처리를 이용
		//3. if는 주로 사용하는게 => 검색용도, 사용자 입력 제한..
		
	}
} 
