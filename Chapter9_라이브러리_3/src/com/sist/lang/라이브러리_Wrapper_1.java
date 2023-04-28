package com.sist.lang;
/*
 * Wrapper : 전체를 감싼다
 * ------- CSS(container)
 * 프로그램 개발 => 기본형 데이터형을 객체 단위로 저장할때
 * 
 * List<int> => 오류
 * 	   ----- 클래스형
 * List<Integer>
 * 	=>기본형을 클래스화 해서 사용
 * 	  ----------- wrapper
 * 	기본형		클래스형  => 기본형에 기능을 추가해서 클래스화 시킨것 (Wrapper)
 * 	int			Integer
 * 	long		Long
 * 	byte		Byte
 * 	double		Double
 * 	boolean		Boolean
 */
public class 라이브러리_Wrapper_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "4.3";
		double d = Double.parseDouble(s);
		System.out.println(d);
		//사용처 => 문자열을 원하는 데이터형으로 변경할때 주로 사용
		// => 클라이언트에 배포 => 윈도우 / 브라우저 / 핸드폰
		// ==========> 모든 데이터형 문자열 => 기본형 데이터로 변경
		// 클래스명 : 객체단위로 저장 (List<>)
		// 문자열 => 해당 데이터형으로 변환 ==> parseXxxx ==> static
		// 오토박싱 / 언박싱
		/*
		 * 오토박싱
		 * --Integer i = new Integer(10);
		 * Integer i=10; ==> String s=""
		 * 클래스에 해당 데이터값을 설정
		 * int aa=i; //언박싱
		 * 기본형에 클래스 객체를 설정
		 */
		Integer i=100;
		System.out.println("i="+i);
		int aa=i;
		System.out.println("aa=" +aa);
		
		
		
		
	}

}
