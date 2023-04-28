package com.sist.util;
import java.text.SimpleDateFormat;
import java.util.*;

public class 라이브러리_Calendar_3 {
	public static void log() {
		long start=System.currentTimeMillis();
		for(int i=0;i<10000000;i++) {
			
		}
		long end = System.currentTimeMillis();
		long result = end-start;
		Date date = new Date(result);
		SimpleDateFormat sdf = new SimpleDateFormat("mm분 ss초");
		System.out.println(sdf.format(date));
	}
	
	public static void main(String[] args) {
		long a=System.currentTimeMillis();
		Date date=new Date(a);
		System.out.println(date);
		
		log();
	}
}
