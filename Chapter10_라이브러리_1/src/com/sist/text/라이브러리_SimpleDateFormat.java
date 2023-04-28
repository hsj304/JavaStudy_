package com.sist.text;
/*
 * java.text => 출력 형태를 만들어서 사용(변경)
 * ---------
 * 	SimpleDateFormat : 날짜 변경
 * 	DecimalFormat : 숫자변환 - 가격출력 : 10,000원
 * 	MessageFormat : 데이터베이스 => INSERT, UPDATE
 * 	-------------
 * 	String name = "", sex="", addr="", tel=";
 */
import java.util.*;
import java.text.*;

public class 라이브러리_SimpleDateFormat {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		System.out.println(sdf.format(date));
		/* 자바	   오라클
		 * yyyy	=> rrrr
		 * MM	=> mm
		 * dd	=> dd
		 * hh	=> hh24
		 * mm	=> mi
		 * ss	=> ss
		 */
		
	}
}
