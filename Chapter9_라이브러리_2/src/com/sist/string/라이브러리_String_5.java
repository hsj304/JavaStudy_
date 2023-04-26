package com.sist.string;
/*
 * concat : 문자열 결합 (+)
 * 
 * String s1 = "Hello ";
 * String s2 = "Java";
 * s1.concat(s2); ==> "Hello Java"
 * 
 * ==> concat ==> MySQL LIKE문장을 만들때
 * 		WHERE name LIKE CONCAT('%', '홍', '%')
 * 		WHERE name LIKE '%'||홍||'%'
 * 
 * endsWith : 끝나는 문자열이 같은 경우에 사용
 * boolean endsWith(String s)
 * String concat(String s)
 * -----------------------------------
 * charAt()
 * equals(), equalsIgnorecase() - 대소문자 구분없이 비교
 * ------ ID,PWD  ------------ 영어검색, 영문 이름
 * indexOf(), lastIndexOf() - 뒤에서부터 찾음
 * ------- 앞에서 부터 찾음
 * length() : 문자 갯수
 * startsWith() : 시작문자열이 같은 경우 => 서제스트
 * substring() : 원하는 문자열을 자르는 경우
 * trim() : 앞뒤 공백 제거
 * split() : 특정 문자로 자를때
 * contains() : 포함문자열인지 확인
 * valueOf() : 모든 데이터형을 문자열로 변환
 */
public class 라이브러리_String_5 {
	public static void main(String[] args) {
//		String s1 = "Hello "; // 공백도 문자다
//		String s2 = "Java!!";
//		
//		System.out.println(s1.concat(s2));
//		System.out.println(s1+s2);
//		
//		if(s2.endsWith("!!")) {
//			System.out.println("!!자로 끝납니다");
//		} else {
//			System.out.println("!!자로 끝나지 않았습니다");
//		}
		
		//
		String[] data= {"JAVA","java","Java","JAva","JAVa","jaVA","javA"};
		for(String s:data) {
			if(s.equals("java")) {
				System.out.println(s);
			}
		}
		//equals는 대소문자를 구분해서 비교
		//원형 : boolean equals(String s)
		//라이브러리 => 1)기능 2)리턴형 3)매개변수 4)사용처 => 로그인, 상세보기
		System.out.println("==== equalsIgnorecase() ====");
		for(String s:data) {
			if(s.equalsIgnoreCase("java"))
				System.out.println(s);
		}
		//equalsIgnoreCase는 대소문자를 구분하지 않음
		//원형 : boolean equalsIgnoreCase(String s)
		//사용처 : 검색, 영문이름, 영문으로 된 데이터 검색
		//한글 : equals
		//한글 => 자음으로 찾기 => 사용자 정의(자바, 오라클)
		System.out.println("====== length() ======");
		String[] data2 = {
				 "apple", 
				  "avocado" ,
				 "banana", 
				  "blackberry", 
				  "blueberry", 
				  "cherry tomato", 
				  "cherry",
				  "coconut", 
				  "grape", 
				  "kiwi", 
				  "lemon", 
				  "lime", 
				  "mango", 
				  "melon", 
				  "orange", 
				  "papaya", 
				  "peach", 
				  "pear", 
				  "persimmon", 
				  "pineapple", 
				  "plum", 
				  "strawberry", 
				  "tangerine", 
				  "tomato", 
				 "watermelon" 
		};
		
		for(String s:data2) {
			System.out.println(s+":"+s.length());
		}
		
		System.out.println("==========================");
		System.out.println("가장 긴 이름의 과일명을 출력하시오");
		int m = 0;
		for(int i=1;i<data2.length;i++) {
			if(data2[i].length()>data2[m].length()) {
				m=i;
			}
		}
		System.out.println(data2[m]);
		
		
		//length() : 문자갯수
		//원형 : int length()
		//사용처 => 문자 제한이 있는 경우, 비밀번호
		//오라클 =>VARCHAR2(10) let a="" let a=10 val var
		System.out.println("======== startsWith ========");
		//startsWith => 시작 문자열이 같은 경우
		//원형 : boolean startsWith(String s)
		//사용처 : 자동 완성기(검색기), 쿠키 검색
		//쿠키 => key는 중복없이 => 구분 : hotel1 hotel2.....
		for(String s:data2) {
			if(s.startsWith("p")) {
				System.out.println(s);
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {
//					// TODO: handle exception
//				}
			}
		}
		
		System.out.println("======= trim() =======");
		//trim() : 좌우 공백 제거
		//원형 : String trim()
		//사용처 : 로그인, 회원가입, 검색...
		//사용자가 입력시 => space
		//String id = "admin" => " admin" 
		String id="admin";
		if(id.equals(" admin")) {
			System.out.println("같은 ID입니다");
		} else {
			System.out.println("다른 ID입니다");
		}
		
		System.out.println("======== contains ========");
		for(String s:data2) {
			if(s.contains("a")) {
				System.out.println(s);
			}
		}
		
		//contains : 포함문자열을 찾을 경우
		//원형 : boolean contains(String s)
		//사용처 : 검색, 추천
		//추천 => 네이버 블로그, 카페 => 포함된 영화명...
		System.out.println("======= valueOf() =======");
		//valueOf : String에서 유일한 static메소드
		//모든 데이터형을 문자열로 변환
		//원형 : static String valueOf((type)) =>오버로딩된 상태
		//사용처 : 자바에서 윈도우 전송, 네트워크 전송, 웹(String만 인식)
		System.out.println(String.valueOf(10)+String.valueOf(30)); //"10" + "30" = "1030"
		
		System.out.println("======= substring =======");
		//substring() indexOf(), lastIndexOf()
		String ss = "http://localhost:8080/JSPProject/main/main.do";
		String res = ss.substring(ss.lastIndexOf("/")+1);
		System.out.println(res);
		ss = ss.substring(ss.indexOf("//")+2);
		res = ss.substring(0, ss.indexOf("/"));
		System.out.println(res);
		ss = "서울특별시 용산구 소월로2길 27 지번 서울시 용산구 후암동 445-8";
		
		res = ss.substring(0,ss.indexOf("지번"));
		System.out.println(res.trim());
		res = ss.substring(ss.indexOf("지번")+2);
		System.out.println(res.trim());
		//substring() : 문자열을 자르는 경우
		//오버로딩
		//substring(int s) => s번째부터 마지막까지 잘라온다
		//substring(int s, int e) => s부터 e-1까지 잘라온다
		//원형 : String substring(int s)
	    //		String substring(int s, int e)
		//사용처 : URL주소 제어, 주소 제어, 문자열이 긴 경우 ...
		ss="홍길동,이순신,강감찬,박문수,을지문덕,심청이,춘향이";
		String[] names = ss.split(",");
		//특수문자별로 잘라서 배열에 저장 ...
		//원형 : String[] split(String regexp)
		//구분이 되어 있는 문자열이 있는 경우 분리 ...
		
		for(String name:names) {
			System.out.println(name);
		}
		
		ss = 	 "갈비살"
				+ " 30,000원"
				+ "돼지갈비"
				+ " 17,000원"
				+ "돼지목살"
				+ " 15,000원"
				+ "삼겹살"
				+ " 15,000원";
		String[] menu = ss.split("원");
		for(String s:menu) {
			System.out.println(s+"원");
		}
		
		ss="red?blue?green?black?white?yellow";
		String[] colors = ss.split("\\?"); // |는 정규식에서 사용하는 기호
											// |, ?, ., +, *, ^
		for(String s:colors) {
			System.out.println(s);
		}
		
		System.out.println("======= replace() =======");
		//replace() : 문자/문자열 변경
		//원형 : String replace(char old, char new)
		//		String replace(String old, String new)
		
		ss = "https://mp-seoul-image-production-s3.mangoplate.com/933725_1552721591193971.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80";
		//오라클에 저장 ==> &(Scanner)
		res = ss.replace("&", "@");
		System.out.println(res);
		System.out.println(res.replace("@","&"));
		//데이터 수집 => html을 제거...
	}
}
