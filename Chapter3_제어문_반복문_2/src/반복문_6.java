import java.util.Scanner;

/*
 * 1. 초기화
 * 2. 게임
 * 3. 형식)
 * 		초기값(1)
 * 		do {
 * 			반복 실행문장(2)
 * 			증가식(3)
 * 		} while(조건문) => 증가된 변수로 조건검색
 */
public class 반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10
		int i=1;
		
		do {
			System.out.print(i +" ");
			i++;
		} while(i<=10);
		
		System.out.println("\n==================================");
		Scanner scanner = new Scanner(System.in);
		System.out.print("단 입력:"); int num = scanner.nextInt();
		i = 1;
		do {
			System.out.printf("%d * %d = %2d\n", num, i, num*i);
			i++;
		}while(i<=9);
		
		System.out.println("========================================");
		for(i=10;i<10;i++) {
			System.out.println("i="+i);
		}
		i=10;
		System.out.println("=====while=====");
		while(i<10) {
			System.out.println("i="+i);
		}
		System.out.println("=====do~while=====");
		i=10;
		do {
			System.out.println("i="+i);
			i++;
		} while(i<10);
		
		
	}

}
