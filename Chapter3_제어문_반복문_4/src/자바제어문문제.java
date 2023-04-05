import java.util.Scanner;

public class 자바제어문문제 {

	
	//1.100~999사이에 7의 배수의 갯수와 합을 출력하는 프로그램 작성
//	public static void main(String[] args) {
//		int count=0, sum=0;
//		
//		for(int i=100;i<=999;i++) {
//			if(i%7==0) {
//				sum += i;
//				count++;
//			}
//		}
//		
//		System.out.println("7의 배수 갯수:"+count);
//		System.out.println("7의 배수 합:"+sum);
//	}
	
	//2.100~999 사이의 4의배수가 아닌 수의 갯수,합을 출력하는 프로그램 작성
//	public static void main(String[] args) {
//		int count=0, sum=0;
//		
//		for(int i=100;i<=999;i++) {
//			if(i%4 != 0) {
//				sum += i;
//				count++;
//			}
//		}
//		
//		System.out.println("갯수:"+count);
//		System.out.println("합:"+sum);
//	}
	
	//3.1~30 짝수합,홀수합을 출력하는 프로그램을 작성
//	public static void main(String[] args) {
//		int odd=0,even=0;
//		
//		for(int i=1;i<=30;i++) {
//			if(i%2==0) {
//				even+=i;
//			} else {
//				odd +=i;
//			}
//		}
//		
//		System.out.println("짝수합:"+even);
//		System.out.println("홀수합:"+odd);
//	}
	
	//4.1~100 3의 배수이고 5의 배수를 출력하는 프로그램 작성
//	public static void main(String[] args) {
//		for(int i=1;i<=100;i++) {
//			if(i%3==0 && i%5==0) {
//				System.out.print(i + " ");
//			}
//		}
//	}
	
	//5.1~1000까지에서 7의 배수의 합 ,9의 배수의 합
//	public static void main(String[] args) {
//		int sum7=0, sum9=0;
//		
//		for(int i=1;i<=1000;i++) {
//			if(i%7==0) {
//				sum7+=i;
//			}
//			if(i%9==0) {
//				sum9+=i;
//			}
//		}
//		System.out.println("7의 배수:" + sum7);
//		System.out.println("9의 배수:"+sum9);
//		System.out.println("7의 배수+9의 배수:"+ (sum7+sum9));
//	}
	
	//6.10~99까지 정수중에 같은 자리의 정수를 출력하시오
//	public static void main(String[] args) {
//		for(int i=10;i<=99;i++) {
//			if(i%11==0) {
//				System.out.print(i + " ");
//			}
//		}
//	}
	
	//7.정수 입력을 받아서 60이상 합격 =>불합격  if~else
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수 입력:"); int num=scanner.nextInt();
		
		if(num >=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
	
}
