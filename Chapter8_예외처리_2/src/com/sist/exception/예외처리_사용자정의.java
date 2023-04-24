package com.sist.exception;

import java.util.Scanner;

class MyException extends Exception {
	public MyException(String message) {
		super(message); // getMessage
	}
}

public class 예외처리_사용자정의 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		try {
			if(num%2==0) {
				throw new MyException("짝수입니다!!"); //사용자 정의는 반드시 예외를 임의로 발생
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
