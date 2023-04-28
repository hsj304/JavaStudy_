package com.sist.util;

import java.util.Arrays;
import java.util.Random;

/*
 * java.util => 프로그램 개발시 유용하게 사용할 수 있는 클래스의 집합
 * 	=>반드시 import를 사용한다 (import java.util.*)
 *  =>java.lang, java.uti;, java.io, java.net)
 *  java.util
 *  1)Random : 난수 발생
 *  ***2)Date/Calendar : 날짜 /시간
 *  ***3)StringTokenizer : 문자 분리(split)
 *  ***4)Collection (중요)
 *  		|
 *  -------------------------	
 *  |			|			|
 *  List		Set			Map
 *  |			|			|
 *  ArrayList 	HashSet	 	HashMap
 *  List : 순서가 존재, 데이터 중복을 허용 => 데이터베이스
 *  Set : 순서가 없다, 데이터 중복을 허용하지 않는다 => 장르..
 *  Map : 순서가 없다, 저장시에 키, 값 => 동시에 저장 => 클래스
 *  ---------------------------------------
 *  Arrays => 배열을 제어하는 기능
 *  ------ 배열 데이터 출력 toString()
 *  ------ sort : 정렬
 *  ------ Array.asList() => 배열을 ArrayList로 변경
 *  
 *  Random => nextInt() => int범위
 *  		  nextInt(5) => 0~4
 *  		  nextInt(101) => 0~100
 *  		  nextInt(100) + 1
 */
public class 라이브러리_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int a = r.nextInt(100)+1;
		System.out.println(a);
		int[] numbers = new int[10];
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = r.nextInt(100)+1;
		}
		System.out.println("=============정렬전=============");
		System.out.println(Arrays.toString(numbers));

		System.out.println("=============정렬후(ASC)=============");
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));

		System.out.println("=============정렬후(DESC)=============");
		for(int i=numbers.length-1;i>=0;i--) {
			System.out.print(numbers[i]+" ");
		}
		
	}

}
