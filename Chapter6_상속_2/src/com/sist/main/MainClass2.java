package com.sist.main;
/*
 * 상속이 있는 경우 => 객체 생성 방법
 * 
 * 상속
 * 1. 형식
 * 	  class A extends B => 단일 상속
 * 2. 클래스 크기
 * 	  상속을 내리는 클래스 > 상속을 받는 클래스
 * 3. 형변환
 * 	  작은 클래스 = 큰 클래스
 * 4. 자바의 최상위 클래스 => Object
 * 5. 상속의 예외 : static => 공유, 초기화 블럭, 생성자, private 접근이 안됨
 */
class Human {
	int a=10;
	int b=20;
	
	
	static int c=30;
	
	public void display() {
		System.out.println("Human:display() Call...");
	}
}
class Student extends Human {
	int d=40;
	int e=50;
	/*
	 * 1. 상속 => 재정의
	 * 2. 메소드명 동일
	 * 3. 매개변수 동일
	 * 4. 리턴형 동일
	 * 5. 접근지정어는 확장이 가능 / 축소시 오류
	 */
	public void display() { //오버라이딩
		System.out.println("Student:display() Call...");
	}
}
public class MainClass2 {
	public static void main(String[] args) {
		
		//클래스명과 생성자가 다른 경우
		/*
		 * 클래스명 변수명 = new 생성자()
		 * ------			 ----
		 * Human h2 = new Student();
		 * 
		 * 1) 변수 제어 ==> 클래스타입 Human
		 * 2) 메소드 제어 ==> 생성자 타입 Student
		 */ 
		Human h = new Human();
		Student s = new Student();
		Human h2 = new Student();
//		Student s2 = new Human(); //오류
//		Student s2 = (Student)new Human(); // 오류
		Student s2 = (Student)h2;
//		Student s3 = (Student)h; //ClassCastException => 형변환 오류
		
		//사용 범위 ==> 상위 클래스는 하위 클래스의 추가된 내용에 접근이 불가능하다
		//변수 접근 => 선언된 클래스에 등록 변수까지만 접근이 가능
		//실제 상속 => 라이브러리(윈도우, 데이터베이스)
	}
}
