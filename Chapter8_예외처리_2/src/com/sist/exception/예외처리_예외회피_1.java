package com.sist.exception;

import java.io.IOError;
import java.io.IOException;
import java.sql.SQLException;

/*
 * 예외 떠맡기기, 예외 회피 ..
 * => 메소드를 읽는다 => JVM에 이런 예외가 발생할 수 있다(알려만 주는 것) => 예외선언
 * => 메소드 호출시에 반드시 => 직접, 선언
 * => RuntimeException => 생략이 가능(예외처리를 안해도 된다)
 * 
 * 		상위 클래스를 이용해서 전체 처리가 가능하다
 * 			Throwable(Exception/Error)
 * 				|
 * 		---------------------------------
 * 		|								|
 * 	  Error(x)						Exception
 * 							Check		|		UnCHeck (throw에서 쓸 필요없다, 조건문 처리가 효율적)
 * 							-------------------------
 * 							|						|
 * 						IOException				RuntimeException
 * 						SQLException				|
 * 						...						NumberFormatException, Arr.....
 * 		
 * 				void method() throws RuntimeException
 * 				****void method() throws Exception
 * 				void method() throws NumberFomatException, ClassCastException...
 * 				****void method() throws IOException
 * 				****void method() throws SQLException, NumberForMatException
 */
public class 예외처리_예외회피_1 {
	public static void methods() throws Exception {
		//예외처리 대상
	}
	public static void method1() throws Exception { // 간접처리(JVM이 처리)
		methods();
	}
	public static void method2() {
		try {
			methods();
		} catch (Throwable e) {
			// TODO: handle exception
		}
	}
	public static void method3() throws IOException, SQLException, ClassNotFoundException {
		
	}
	public static void method4() throws IOException, SQLException, ClassNotFoundException {
		method3();
	}
	public static void method5() throws Exception{
		method3();
	}
	public static void method6() throws Throwable {
		method3();
	}
	
	public static void main(String[] args) {
		
	}
}
