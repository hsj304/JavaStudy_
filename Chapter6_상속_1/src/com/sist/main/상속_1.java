package com.sist.main;
/*
 * 1) 네트워크 프로그램
 * 2) 데이터베이스 프로그램(**********) 웹
 * 	-----------------------------------Spring
 * 	데이터베이스는 데이터 저장 장소
 * -------------------------------자바에서 읽기( 메모리=> 제어)
 * 1. 메모리에 저장 : 변수 => 제어 (제어문, 연산자)
 * 2. 데이터가 많은 경우
 * 	= 같은 데이터형 : 배열
 * 	= 다른 데이터형 : 클래스(***)
 * 3. 클래스 
 * 	=클래스 정의 방법(객체지향프로그램 => 한개의 클래스로 만드는 것이 아니라 클래스와 클래스의 연관관계) => Spring(DI)
 * 				  행위자 (웹:사용자, 관리자)
 * 	*** 접근지정어(권한)
 * 	private : 자신의 클래스에서만 사용이 가능 => 은닉화(캡슐화)
 * 			=> 목적 : 데이터 보호
 * 			=> 변수(클래스의 속성)
 * 			=> private 데이터형 변수명
 * 			    ------------------
 * 	default : 같은 패키지안에서만 사용이 가능
 * 			=> 윈도우, Thread(프로그램안에서 여러개 프로그램을 수행)
 * 				게임 : 총알, 비행기....
 * 	protected : 같은 패키지안에서만 사용이 가능
 * 				상속을 받은 경우=> 다른 패키지에 접근이 가능
 * 				=> 사용빈도가 거의 없다
 * 				=> 상속을 내리면 모든변수, 메소드 사용이 가능
 * 					private 변수는 접근이 불가능하다
 * 				-------------------------------protected
 * 	public : 모든 클래스에서 접근이 가능
 * 			클래스 : 연관관계 => 다른 클래스에서 접근이 가능
 * 			생성자 : 다른 클래스에서 메모리 할당 후 사용
 * 			메소드 : 다른 클래스와 통신을 담당
 * 	===> private / public
 * -------------- 접근 지정어 -------------------
 * private < default < protected < public (******)
 * => 오버라이딩 : 접근지정어의 확장은 가능(축소는 불가능)
 * 예) 한글 (브라우저 : C언어)
 * 					---- char(1byte) : 한글 2byte
 * 						 ASC			UniCode
 * 	-------------------------------------------
 * 클래스의 구성 요소 : 벤치마킹 ==> 요구사항 분석
 * class ClassName {
 *     -------------------------------------------------------------------
 * 		속성, 필드 => 멤버변수 (캡슐화) ==> 다른 클래스에서 사용이 가능하게 만든다
 * 					------------- 읽기/쓰기 메소드
 * 								 -------- getter/setter => 인스턴스 메소드
 * 		공유변수(static) : 패턴(싱글턴) => 한개의 객체만 사용
 * 			 --------  메모리 공간이 한개
 * 			 --------  공유하는 데이터가 존재
 *     -------------------------------------------------------------------
 *     생성자
 *     	1. 클래스명과 동일
 *     	2. 멤버변수에 대한 초기화
 *     	3. 생성자가 없는 경우에는 자동으로 컴파일러가 기본생성자를 추가
 *     									   ------- 매개변수가 없는 생성자
 *     	4. 모든 클래스는 생성자는 1개 이상을 가지고 있다
 *     	5. 생성자는 객체를 생성할때 호출되는 메소드
 *     		사용법) new 생성자()
 *     	6. 리턴형은 존재하지 않는다
 *     	7. 생성자는 필요시에는 여러개를 만들 수 있다
 *     	   -------------------------------- 오버로딩을 지원한다(중복 메소드 정의)
 *     										= 조건) 메소드명이 동일
 *     											   한개의 클래스에서 만든다
 *     											   매개변수의 개수나 데이터형이 다르다
 *     											   리턴형은 관계가 없다
 *     										** 생성자는 초기화 담당
 *     											--> 시작과 동시에 처리하는 일이 있는 경우
 *     											윈도우 디자인, 웹 메인, 자동 로그인, 오라클 연결 ......
 *     											=> 가장 먼저 호출되는 메소드
 *     -------------------------------------------------------------------
 *     메소드 : 기능을 수행, 다른 클래스와 연결
 *     메소드 제작방법(형식)
 *     [접근지정어(public)][제어어] 리턴형 메소드명(매개변수목록) => 선언부
 *     {
 *     		구현부
 *     }
 *     
 *     1. 선언부
 *     	=접근지정어 : public, default
 *     	=제어어 : static, final, abstract
 *     		static : public static
 *     				=> 객체마다 공통으로 사용되는 기능(데이터베이스 연결)
 *     		final : public final => 오버라이딩이 안되는 상태
 *     				=> 수정이 불가능
 *     				=> Math, String, System => 모든 메소드를 그대로 사용
 *     				종단 메소드, 
 *     		abstract : 선언만 하는 메소드 => 구현(프로그램에 맞게 구현해서 사용)
 *     					버튼 클릭
 *     					=>추상클래스 / 인터페이스(***)
 *     								=> 스프링의 기반(결합성이 낮은 프로그램)
 *     
 *     리턴형 : 사용자 요청 처리한 결과값
 *     		  한개만 사용이 가능
 *     		  = 여러개의 값이 있는 경우
 *     			-같은 데이터형 : 배열 => 컬렉션
 *     				배열(고정적), 컬렉션(가변형)
 *     			-다른 데이터형 : 클래스
 *     		  = 한개의 결과값 : 기본형, String
 *     		  = 결과값이 없는 경우 : 메소드 자체에서 처리 => void
 *     매개변수 : 여러개 사용이 가능, 사용자 요청한 값
 *     			------------ 매개변수는 최소화를 시킨다
 *     						 매개변수 3개 이상이면 배열, 클래스를 이용한다
 *     구현부 : 변수가 선언이 되면 => 지역변수 (메소드 종료와 동시에 사라진다)
 *     		   지역변수 : 초기화가 안됨 (반드시 초기화 후 사용)
 *     
 *     **변수/메소드
 *     -------------------------------------------------------------------
 *     this : 클래스마다 this를 가지고 있다(static)
 *     		  자신의 객체 주소를 가지고 있다
 *     ===>멤버변수, 멤버메소드, 생성자 ==> 클래스 소속
 *     this는 멤버변수와 지역변수의 구분
 *     class A {
 *     		int age;
 *     		public void setAge(int age) {
 *     			age = age; => 지역변수 우선순위(매개변수 포함)
 *     			
 *     			멤버변수
 *     			this.age = age
 *     		}
 *     }
 * }
 *     -------------------------------------------------------------------
 *     6장 시작
 *     => 재사용 기법
 *     => 수정, 추가
 *     => 클래스 종류
 *     -------------
 *     견고한 프로그램을 만든다
 *     ------------------
 *     	재사용(상속,포함) / 가독성(메소드) / 견고성(예외처리)
 *     -------------------------------------------------------------------
 *     자바 상속의 특징
 *     =재사용 목적으로 사용한다(기존의 만들어진 클래스를 확장해서 사용)
 *     	*** 필요시에는 변경해서 사용이 가능(오버라이딩)
 *     =반복 코딩을 제거할 수 있다
 *     =기존에 만들어진 클래스를 확장해서 새로운 클래스를 만들어서 사용
 *     =유지보수용(SM) => Jquery(Ajax) => Vue, React
 *     =단일 상속만 가능하다
 *     =상속을 내리는 클래스 : 부모클래스, 슈퍼클래스, 베이스클래스, 상위클래스
 *     	상속을 받는 클래스 : 자식클래스, 서브클래스, 파생클래스, 하위클래스
 *     	상속이 있는 경우에는 클래스의 크기가 있다(형변환)
 *     	
 *     	상속을 내리는 클래스 > 상속을 받는 클래스
 *     -------------------------------------
 *     		동물
 *     		 |
 *     		인간
 *     	class Super
 *     	class sub extends Super
 *     -------------------------------------
 *    	Sub sub = new Sub(); // 확장된 클래스 자체
 *    	Super super = new Sub(); // 하위 클래스를 이용해서 상위클래스 생성
 *    
 *    	Sub sub1 = (Sub)super; //형변환후 사용
 *     -------------------------------------
 *     일반적으로
 *     클래스 = 생성자 동일
 *     -------------------------------------
 *     => 클래스의 생성자가 다른 경우
 *     => 클래스와 메소드 이용
 *     ------------------------------------- 인터페이스
 *    	List list = new ArrayList()
 *    
 *     
 *     
 *     
 *     
 */

//class Data {
//	private int a;
//	
//	public int getA() {
//		return a;
//	}
//
//	public void setA(int a) {
//		this.a = a;
//	}
//
//}
//
//class Human {
//	Data d = new Data();
//	public void getData(int data) {
//		d.setA(data);
//	}
//	public void print() {
//		System.out.println("d.a="+d.getA());
//	}
//}

class Super {
	int a=10;
	int b=20;
	public void display() {
		System.out.println("Super가 가지고 있는 display()...");
		
	}
}
// Super 로부터 상속을 받는다 => 예외조건) 생서자, 초기화 블록 , static(공유)
// private => 상속은 가능 => 접근이 불가능
// --------- protected
// --------- getter/setter
class Sub extends Super {
	
}
public class 상속_1 {
	public static void main(String[] args) {
//		Human h = new Human();
//		h.getData(10);
//		h.print();
//
//		Human h1 = new Human();
//		h1.getData(300);
//		h1.print();
		
		Sub sub = new Sub();
		System.out.println(sub.a);
		System.out.println(sub.b);
		sub.display();
	}
}
