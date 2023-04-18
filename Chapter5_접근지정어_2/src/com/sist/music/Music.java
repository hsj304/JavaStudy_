package com.sist.music;
/*
 * 1. 재사용
 * 	= 상속 => is-a
 * 	  기존의 클래스를 확장해서 사용
 * 				  -------
 * 				  extends
 * 	  = 자바는 단일 상속만 가능하다
 * 		class A
 * 		class B extends A
 * 		class C extends JFrame => 라이브러리
 * 		---------------------------------------
 * 		class A
 * 		class B
 * 		class C extends A,B => 오류(C언어)
 * 		C = A+B+알파
 * 
 * 		class A
 * 		class B	extends A
 * 		class C extends B
 * 		---------------------------------------
 * 		class A
 * 		class B
 * 		-------- A와 B는 다른 클래스 => 크기를 가지지 않는다
 * 		A > B => 상속을 내리는 클래스가 크다
 * 				동물 
 * 				 |
 * 			---------
 * 			|	|	|
 * 		  포유류 양서류	조류
 * 			|
 * 		   인간
 * 			|
 * 		  -----
 * 		  |   |
 * 		 남자 여자
 * 		*** 모든 클래스는 Object상속을 받고 있다
 * 			Object => 모든 클래스 최상위 클래스
 * 		*** 상속의 예외 조건
 * 			생성자, static, private, 초기화 블록
 * 	= 포함 => has-a (*****)
 */
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Music {
	private int rank;
	private String state;
	private String title;
	private String singer;
	private String album;
	private int idcrement;
	
	

}
