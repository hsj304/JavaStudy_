
/*
 * 메소드 : 클래스의 구성 요소 (동적)
 * -----
 * 	1) 특정 기능을 수행하는 명령문의 집합
 * 					   ----- 연산자 / 제어문
 * 	2) 한가지 기능만 수행 할 수 있게 한다
 * 	  예)
 * 		댓글
 * 		----------- 댓글 (class)
 * 		댓글 목록 출력
 * 		댓글 쓰기
 * 		댓글 수정
 * 		댓글 삭제
 * 		-----------
 * 
 * 		게시판(class)
 * 		-------
 * 		글쓰기
 * 		목록출력
 * 		상세보기
 * 		수정
 * 		삭제
 * 		-------
 * 
 * 		영화 (CGV) ==> 상속 (메가박스) ==> 상속(롯데시네마)
 * 		-----
 * 		목록출력
 * 		상세보기
 * 		예약하기
 * 		추천하기
 * 		검색하기
 * 
 * 		3) 메소드 구성요소
 * 		   선언부
 * 		   void display()
 * 		   구현부
 * 		   {
 * 				처리
 * 		   }
 * 
 * 			선언부
 * 			[접근지정어][옵션] 리턴형 메소드명(매개변수....)
 * 								------
 * 								알파벳, 한글로 시작(대소문자 구분)
 * 								숫자 사용이 가능 (앞에사용금지)
 * 								키워드 사용 금지
 * 								특수문자 사용가능(_,$)
 * 								공백을 사용할 수 없다
 * 								**소문자로 시작
 * 						  ----- 기본형(int, char, byte, long .....)
 * 						  ----- 배열, 클래스
 * 			---------- static/final/abstract
 * 			public/ private ....
 * 			{
 * 			}
 * 
 * 			*** 메소드를 호출시에는 메소드는 처음부터 끝까지 수행한 후에 호출된 위치로 온다
 * 
 * 		메소드 만드는 방법
 * 		--------------
 * 		리턴형	매개변수
 * 		O		O
 * 		X		O
 * 		O		X
 * 		X		X
 */

public class 메소드문제 {
	//1. 
	static boolean check(String id) {
		return false;
	}
	
	//2. 
	static String[] postNo(String no) {
		return null;
	}
	
	//3.
	static void gugudan() {
		
	}
	
	//1.
	static void a() {
		for(int i=1;i<=10;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	//2.
	static int sum() {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum += i;
		}
		
		return sum;
	}
	
	//3. 
	static int nSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		
		return sum;
	}
	
	//4. 
	static double div(int a, int b) {
		return a/(double)b;
	}
	
	//5.
	static String upperCase(String a) {
		String result = a;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='a' && a.charAt(i)<='z') {
				result = result.substring(0,i) + (char)(result.charAt(i)-32) + result.substring(i+1);
			}
		}
		return result;
	}
	
	static void reverse(String a) {
		for(int i=a.length()-1;i>=0;i--) {
			System.out.print(a.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		
	}
}
