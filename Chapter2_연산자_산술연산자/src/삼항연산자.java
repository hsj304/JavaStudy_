import java.util.Scanner;

/*
 *  (조건)?값1:값2
 *  -----
 *  true => 값1
 *  false => 값2
 *  =======> if~else
 *  웹/게임
 *  
 */



public class 삼항연산자 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//					   --- 메모리에 저장
		System.out.print("정수 입력:" );
		int num=scan.nextInt();
		
		System.out.println(num%2==0?"짝수":"홀수");
//		if(num%2==0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}

	}

}
