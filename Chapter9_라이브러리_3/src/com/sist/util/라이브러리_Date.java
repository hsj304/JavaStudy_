package com.sist.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date : java.util
 * 1)시스템의 현재 시간/날짜를 읽어오는 클래스
 * 	 ----------------
 * 2)Date클래스의 단점 => 기능이 빈약하다
 * 					  날짜만 저장하는 클래스(오라클의 데이터형과 호환)
 * 			|
 * 			보완 => Calendar
 * 3)Date => SimpleDateFormat => java.text
 * 			 ---------------- 원하는 스타일로 날짜를 변경
 * 4)사용처 : 웹(등록일)
 */
public class 라이브러리_Date {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		/*
		 * 년도	: yyyy(2023), yyy(023)
		 * 월	: M(1,2,3,4,....), MM(01,02,03,04,.....)
		 * 일	: d(1,2,3,4,....), dd(01,02,03,04,.....)
		 * 시간	: h(1,2,3,4,....), hh(01,02,03,04,.....)
		 * 분	: m(1,2,3,4,....), mm(01,02,03,04,.....)
		 * 초	: s(1,2,3,4,....), ss(01,02,03,04,.....)
		 * 
		 * Date => 호환, 날짜만 저장하는 기능(오라클)=>DATE
		 */
	}
}
