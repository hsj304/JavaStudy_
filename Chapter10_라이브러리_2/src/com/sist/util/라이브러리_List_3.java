package com.sist.util;

import java.util.ArrayList;
/*
 * 	subList(itn start, int end) => index번호가 start부터 end까지 부분적으로 데이터복사
 */
public class 라이브러리_List_3 {
	public static void main(String[] args) {
		ArrayList names1 = new ArrayList();
		names1.add("홍길동");
		names1.add("심청이");
		names1.add("이순신");
		names1.add("강감찬");
		names1.add("춘향이");
		ArrayList names2 = new ArrayList();
		names2.add("홍길수");
		names2.add("심청이");
		names2.add("이순이");
		names2.add("강감차");
		names2.add("성춘향");
		ArrayList temp = new ArrayList();
		temp.addAll(names1);
		temp.retainAll(names2);// names1과 names2에 같은 데이터를 찾아라
		//찾은 데이터를 names1에 저장
		for(Object s:temp) {
			System.out.println(s); 
		}
		
	}
}
