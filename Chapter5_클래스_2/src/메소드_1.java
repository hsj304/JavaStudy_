import java.util.Scanner;

/*
 * 	변수		연산자	제어문	출력
 * 	---		------------	---
 *   |			  |			 |
 *  배열			명령문		Application
 *  클래스		----		-----------
 *  			메소드		web Application
 *  ---------------------------------------
 *  클래스
 *  ----
 *   1. 메소드 (*****)
 *   	= 사용자 정의
 *   	= 라이브러리(암기)
 *   2. 변수(멤버) => 프로그램 종료시까지 메모리 유지
 *   3. 생성자
 *   --------------------------------------
 *   객체 지향 프로그램 : 유지보수 (데이터보호, 재사용, 수정, 추가)
 *   						 캡슐화	  상속/포함  오버라이딩/오버로딩
 *   4. 비정상 종료를 방지하는 프로그램 : 견고한 => 예외처리
 *   5. 자바에서 지원하는 라이브러리 => 조립식
 *   *** 오라클 연결 => 웹
 *   *** 브라우저 연결
 */

//년도를 입력받아서 윤년여부 확인
/*
 * 	메소드안에서 출력 => void
 *  결과값을 받아서 출력 => boolean
 * 	-------------------------- 리턴형
 */


public class 메소드_1 {
	static void isYear(int year ) {
		if((year%4==0&&year%100!=0) || year%400==0) {
			System.out.println(year + "년도는 윤년입니다");
		} else {
			System.out.println(year + "년도는 윤년이 아닙니다");
		}
	}
	
	static void process() {
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력:");
		int year = scan.nextInt();
		
		isYear(year);
	}
	
	public static void main(String[] args) {
		process();
	}
}
