/*
 *  알파벳 10개 저장하는 공간을 만든다
 *  
 *  배열 변수가 3개 이상이면
 */
public class 배열_2 {
	
	public static void main(String[] args) {
		//1.선언
		int[] arr = new int[5]; // new => 동적 메모리 할당
		//2.초기화
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
		//3.출력
		for(int i:arr) {
			System.out.print(i + " ");
		}
		//4.제어
		//5.결과값 출력
	}
	
	
}
