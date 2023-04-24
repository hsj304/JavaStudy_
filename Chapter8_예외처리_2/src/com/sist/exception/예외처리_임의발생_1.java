package com.sist.exception;

public class 예외처리_임의발생_1 {
/*
 * 	임의발생 : 테스트 목적
 * 	---------------------베포전(베포:상용화)
 * 	형식)
 * 		throw new 예외처리생성자()
 */
	public static void main(String[] args) {
		try {
			int  a=10;
			if(a%2==0) {
				System.out.println("임의로 예외발생!!");
				throw new NumberFormatException("정수 변환이 안됨");
				//getMessage변경 => 생성자 매개변수 이용
				/*
				 * class NumberFormatException extends Exception {
				 * 		private String message = "default 문자열";
				 * }
				 */
			}
			Integer.parseInt(" 10");
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException:"+e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
