package com.sist.main;
//import com.sist.main.클래스구성요소_1;
//주의점 : 키워드는 사용 할 수 없다.


/*
 * 		1. 메소드의 구성요소
 * 		  리턴타입(결과값) 메소드명(매개변수 => 요청데이터) => 선언부
 * 		  ------------  일치(데이터형)
 * 		  {
 * 				구현부
 * 				return 결과값;
 * 					   -----
 * 			}
 * 			리턴타입 : 사용자가 요청한 내용을 처리후에 결과값의 데이터형
 * 					1)결과값이 있는 경우
 * 					2)결과값이 없는 경우 => void
 * 					리턴타입 / return 값은 항상 일치하지는 않는다
 * 					항상 리턴타입이 결과값보다 크거나 같다
 * 						int 10.5->오류
 * 						double 10 -> 정상수행
 * 					3) 리턴타입이나 결과값은 1개만 나온다
 * 						**여러개일 경우 : 배열, 클래스를 이용한다
 * 									   --  ----- 주소 => 얕은복사
 * 					
 */

class Student {
	int hakbun;
	String name;
	String sex;
	int kor;
	int eng;
	int math;
	
}

class StudentSystem {

	int getHakbun() {
		return 1;
	}
	String getName() {
		return "홍길동";
	}
	String getSex() {
		return "남자";
	}
	int getKor() {
		return 90;
	}
	int getEng() {
		return 80;
	}
	int getMath() {
		return 78;
	}
	Student getData() {
		Student s = new Student();
		s.hakbun = 2;
		s.name = "심청이";
		s.sex = "여자";
		s.kor = 90;
		s.eng = 90;
		s.math = 100;
		
		return s;
	}
}
public class 클래스구성요소_1 {
	public static void main(String[] args) {
		Student hong = new Student();
		StudentSystem ss = new StudentSystem();
		hong.hakbun = ss.getHakbun();
		hong.name = ss.getName();
		hong.sex = ss.getSex();
		hong.kor = ss.getKor();
		hong.eng = ss.getEng();
		hong.math = ss.getMath();
		
		Student shim = ss.getData();
	}
}
