/*
 *  자바에서 지원하는 반복문
 *  -------------------
 *  for : 반복 횟수가 지정된 경우
 *  = 일반 for
 *  = for-each : 출력문(웹에서 가장 많이 등장 : 향상된 for문)
 *  while : 반복 횟수를 모르는 경우 (선 조건)
 *  do~while : 반복 횟수를 모르는 경우 (후 조건) => 무조건 한번 이상은 실행
 *  
 *  for (int i=1;i<=10;i++){
 *  	반복할 문장
 *  }
 *  
 *  for (초기값;조건식;증감식){
 *  	반복할 문장
 *  }
 *  => 조건식이 false일때까지 실행, 감소나 i+=2 도 가능
 *  
 *  =>	for문은 한문장만 수행이 가능
 *  	여러문장 사용시에는 {}을 이용해서 처리한다
 *  =>	for(초기값;조건식;증감식 {
 *  				↓ true'
 *  
 *  
 *  }
 */
public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====for문 이용=====");
		for(int i=1;i<=10;i++) {
			System.out.println(i+". Hello Java");
		}
		
		System.out.println("=====for문 이용=====");
		for(int i=0;i<10;i++) {
			System.out.println(i+". Hello Java");
		}
		
	}

}


