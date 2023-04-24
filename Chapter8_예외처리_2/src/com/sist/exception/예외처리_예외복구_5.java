package com.sist.exception;
/*
 * finally => 생략이 가능
 * finally => try를 수행, catch를 수행 관계없이 무조건 수행되는 문장
 * 파일 닫기, 오라클 연결 해제, 서버 연결 해제
 * 
 *	실행 순서
 *	-------
 *	문장 1
 *	문장 2
 *	try {
 *		문장3
 *		문장4
 *		문장5
 *	} catch(예외처리 클래스1) {
 *		문장6
 *	} catch(예외처리 클래스2) {
 *		문장7
 *	} catch(예외처리 클래스3) {
 *		문장8
 *	} finally {
 *		문장9
 *	}
 *	문장10
 *	문장11
 *
 *	=> 1. try가 정상 수행
 *		1-2-3-4-5 ==> 9-10-11
 *
 *	=> 2. try => 에러(1) - 문장4 에러일경우
 *		1-2-3==> catch(1) 6-9-10-11
 *
 *	=> 3. try => 에러(2) - 문장4 에러일경우
 *		1-2-3==> catch(1) 7-9-10-11
 *
 *	=> 4. try => 에러(3) - 문장4 에러일경우
 *		1-2-3==> catch(1) 8-9-10-11
 *	==> 목적 에러시에 제외를 하고 나머지 문장을 수행
 *
 *	=> 멀티 예외처리
 *	
 */
public class 예외처리_예외복구_5 {
	 public static void main(String[] args) {
		 
		try {
			int[] arr=new int[2];
			arr[0]=10;
			arr[1]=0;
			System.out.println(arr[0]/arr[1]);
			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("에러 발생");
		} 
		System.out.println("프로그램 종료!!");
	}
}
