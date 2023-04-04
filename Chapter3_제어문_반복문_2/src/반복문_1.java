/*
 *  반복문 : 유사한 내용이 여러번 반복할때 주로 사용
 *  		영화목록, 맛집목록 .... 
 *  
 *  종류 :
 *  		반복횟수가 정해져 있는 경우 : for
 *  		반복 횟수가 정해지지 않은 경우 : while
 *  		한번 이상 수행이 가능 : do~while
 *  		-------------------------------
 *  		자바 : 출력, 제어 => for
 *  			  데이터베이스, 네트워크 => while
 *  
 *  형식)
 *  	for		  1    2    4 => 2번 false 종료 / true면 반복문장 수행
 *  		for(초기값;조건식;증감식)
 *  		{
 *  			반복 수행문장 3
 *  		}
 *  	while
 *  		초기값 --------1
 *  		while(조건문) -2 ==> 수행을 못할 수도 있다
 *  		{
 *  			반복문장 ---3
 *  			증감식  ---4 => 2번 이동(true 수행, false 종료)
 *  		}
 *  	do~while
 *  		초기값  ----------1
 *  		do {
 *  			반복 수행문장--2
 *  			증감식 ------3
 *  		} while(조건문);-4
 *  
 *  	for => 2차
 *  
 */
public class 반복문_1 {

	public static void main(String[] args) {
//		String[] food = {
//				"버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기",
//				"아삭아삭한 고추된장박이",
//				"달콤 짭조름♡ 떡 베이컨 간장조림♡",
//				"새송이버섯버터굴소스볶음 간단반찬",
//				"[마늘종볶음]단짠단짠 자꾸만 손이가요~"
//		};
//		
//		String[] chef = {
//				"루던", "돌하우스", "요블리", "라피네", "그레노아"
//		};
//		
//		for (int i=0;i<5;i++) {
//			System.out.println(food[i]+"("+chef[i]+")");
//		}
		
//		for(int i=1;i<=10;i++) {
//			System.out.print(i+ " ");
//		}
//		System.out.println("====================");
//		for(char c='A';c<='Z';c++) {
//			System.out.print(c+" ");
//		}
//		char c = 'A';
//		for(int i=0;i<26;i++) {
//			System.out.print(c++ + " ");
//		}
	
//		int i=1;
//		while(i<=10) {
//			System.out.print(i + " ");
//			i++;
//		}
//		System.out.println();
//		System.out.println("====================");
//		char c='A';
//		while(c<='Z') {
//			System.out.print(c + " ");
//			c++;
//		}
//		
		System.out.println("=====do~while=====");	
		int i=1;
		do{
			System.out.print(i + " ");
			i++;
		}while(i<=10);
		System.out.println();
		char c = 'A';
		do {
			System.out.print(c + " ");
			c++;
		}while(c<='Z');

	}

}
