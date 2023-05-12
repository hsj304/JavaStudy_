package com.sist.inter;

import java.util.List;

import com.sist.manager.GenieMusicVO;
/*	목적 (기술면접의 단골) => 스프링은 인터페이스 
 * 표준화가 가능하다(메소드 구현은 다를  수 있다, 메소드명이 동일)
 * ---- 분석
 * 관련된 클래스 여러개를 모아서 관리할 목적
 * 독립적으로 사용이 가능
 * 
 * => 형식
 * 	  public interface Interface명{
 * 		(public static final) int a=10;
 * 
 * 		(public abstract)void display();
 * 		구현
 * 		(public) default void aaa(){
 * 			
 * 		}
 * 	  }
 * 		==> 사용하기 위해서는 상속을 내리고 하위클래스를 통해서 메모리 할당후 사용
 * 		interface A
 * 		class B implements A
 * 		=>A a = new B();
 * 		=>Collection
 * 		  List list = new ArrayList()
 * 		  Map map = new HashMap()
 */
public interface HomeInterface {
	public void cardPrint(List<GenieMusicVO> list);
	public void cardInit(List<GenieMusicVO> list);
}
