package com.sist.util;

import java.util.ArrayList;
import java.util.Collections;

//List의 메소드
/*
 * add,remove,set,size,clear
 * ------------------------- 기본 메소드
 * containsAll() => 두개의 list에서 중복된 데이터를 모아서 관리
 * 		=>JOIN
 * retainAll => 두개의 list에서 중복된 데이터만 남기기
 * addAll => 데이터 전체 복사
 * subList => 부분적 데이터를 복사할 경우에 사용
 * -----------장바구니, 예매
 * 			  ------ 중복 구매
 */
public class 라이브러리_List_2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);//0
		list.add(5);//1
		list.add(7);//2
		list.add(6);//3
		list.add(9);//4
		list.add(2);//5
		list.add(1);//6
		list.add(4);//7
		//출력
		for(Object i:list) {
			System.out.println(i);
		}
		//일부만 추가 subList(start, end)
		ArrayList list2 = new ArrayList(list.subList(1, 4));
		
		System.out.println("======================");
		
		for(Object i:list2) {
			System.out.println(i);
		}
		System.out.println("======================");
		Collections.sort(list);
		for(Object i:list) {
			System.out.println(i);
		}

		//같은 데이터 추출
		System.out.println("======================");
		System.out.println(list2.containsAll(list));
		for(Object i:list) {
			System.out.println(i);
		}
		
		System.out.println("======================");
		System.out.println(list.retainAll(list2));
		for(Object i:list) {
			System.out.println(i);
		}
		//addAll
		System.out.println("======================");
		ArrayList list3= new ArrayList();
		list3.addAll(list);
		for(Object i:list3) {
			System.out.println(i);
		}
		
	}
}
