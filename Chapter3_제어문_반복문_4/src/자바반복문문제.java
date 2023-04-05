import java.util.Scanner;

public class 자바반복문문제 {

	//1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 작성 (조건문)
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("정수 입력:"); int x=scanner.nextInt();
//		
//		if(x>10 && x<20) {
//			System.out.println("true");
//		}
//	}
	
	//2. char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식 작성
//	public static void main(String[] args) {
//		char ch = ' ';
//		
//		if(ch == ' ' && ch != '\t') {
//			System.out.println("true");
//		}
//	}
	
	//3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식 작성
//	public static void main(String[] args) {
//		char ch = 'x';
//		
//		if(ch == 'x' || ch =='X') {
//			System.out.println("true");
//		}
//	}
	
	//4. char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식 작성
//	public static void main(String[] args) {
//		char ch = '5';
//		
//		if (ch>='0' && ch <= '9') {
//			System.out.println("true");
//		}
//	}
	
	//5.  두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오
//	public static void main(String[] args) {
//		for(int i=1;i<=6;i++) {
//			for(int j=1;j<=6;j++) {
//				if(i+j==6) {
//					System.out.println("첫번째 주사위 : " + i + ", 두번째 주사위 : " + j);
//				}
//			}
//		}
//	}
	
	//6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("시작과 끝을 입력(10 20) : ");
//		int start = scanner.nextInt(), end = scanner.nextInt();
//		
//		int result=1;
//		for(int i=start;i<=end;i++) {
//			result *= i;
//		}
//		System.out.println("결과 : " + result);
//	}

	//7.  5~16까지의 합을 구하시오
//	public static void main(String[] args) {
//		
//		int sum=0;
//		for(int i=5;i<=16;i++) {
//			sum += i;
//		}
//		
//		System.out.println("결과 : " + sum);
//	}
	
	//8. 3이상 4462 이하에서 짝수인 정수의 합을 구하여라
//	public static void main(String[] args) {
//		int sum=0;
//		
//		for(int i=3;i<=4462;i++) {
//			if(i%2==0) {
//				sum+=i;
//			}
//		}
//		System.out.println("결과 : "+ sum);
//	}
	
	//9. 0~12까지 2의 배수, 3의 배수의 합을 구하여라.
//	public static void main(String[] args) {
//		int sum2=0,sum3=0;
//		
//		for(int i=0;i<=12;i++) {
//			if(i%2==0) {
//				sum2 += i;
//			}
//			if(i%3==0) {
//				sum3 += i;
//			}
//		}
//		
//		System.out.println("2의 배수 합: "+sum2+", 3의 배수 합: " + sum3);
//	}
	
	//10. 1~100까지의 정수 중 4의 배수의 합계를 구하라
//	public static void main(String[] args) {
//		int sum=0;
//		
//		for(int i=0;i<=100;i++) {
//			if(i%4==0) {
//				sum += i;
//			}
//		}
//		System.out.println("4의 배수 합계 : " + sum);
//	}
	
	//11. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램 작성
//	public static void main(String[] args) {
//		int count=0;
//		Scanner scanner = new Scanner(System.in);
//		
//		for(int i=1;i<=10;i++) {
//			System.out.print("정수를 입력하세요(10/"+i+")"); int num=scanner.nextInt();
//			if(num%2==0)
//				count++;
//		}
//		
//		System.out.println("짝수의 갯수:" + count);
//	}
	
	//12. 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램
//	public static void main(String[] args) {
//		int count3=0, count5=0;
//		Scanner scanner = new Scanner(System.in);
//		
//		for(int i=1;i<=10;i++) {
//			System.out.print("정수를 입력하세요(10/"+i+")"); int num=scanner.nextInt();
//			if(num%3==0)
//				count3++;
//			if(num%5==0)
//				count5++;
//		}
//		
//		System.out.println("3의 배수 갯수:" + count3 + ", 5의 배수 갯수:" + count5);
//	}
	
	//13. 
//	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=10;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	
	//14,
//	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
//	}
	
	//16
//	public static void main(String[] args) {
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//	}
	
	//17
//	public static void main(String[] args) {
//		
//		
//		for(int i=1;i<=5;i++) {
//			char c = 'A';
//			for(int j=1;j<=5;j++) {
//				System.out.print(c++ + " ");
//			}
//			System.out.println();
//		}
//	}
	
	//18
	public static void main(String[] args) {
		char c = 'A';
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(c + " ");
			}
			c++;
			System.out.println();
		}
	}
}
