import java.util.Scanner;

//1) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 양수인지 음수인지 판별하여 출력하라
public class 제어문문제 {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("정수 입력:"); int num = scanner.nextInt();
//		
//		if(num >= 0)
//			System.out.println("양수입니다");
//		else
//			System.out.println("음수입니다.");
//	}

	//// 2) 한 개의 정수를 입력 받아 3의 배수인지 판별하여 출력하라
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("정수 입력:"); int num = scanner.nextInt();
//		
//		if(num%3==0)
//			System.out.println("3의 배수입니다");
//		else
//			System.out.println("3의 배수가 아닙니다.");
//	}
	
	//3) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 정수의 절대값을 출력하라
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("정수 입력:"); int num = scanner.nextInt();
//		
//		if(num < 0)
//			System.out.println("a="+num*-1);
//		else
//			System.out.println("a="+num);
//			
//	}
	
	//4) 년도를 입력 받아 윤년인지 아닌지를 판별하는 방법을 if~else문으로 사용하라
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("년도 입력:"); int year = scanner.nextInt();
//		
//		if((year %4==0 && year%100 !=0) || year%400==0)
//			System.out.println(year + "년은 윤년입니다.");
//		else
//			System.out.println(year + "년은 윤년이 아닙니다.");
//			
//	}
	
	//8) 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
//	public static void main(String[] args) {
//		int sum=0;
//		
//		for(int i=2;i<=100;i+=2) {
//			sum += i;
//		}
//		
//		System.out.println("sum : "+sum);
//	}
	
	//9) 5,10,15,20,25,30,35,40,45,50을 출력하는 프로그램을 만들어라 (for 사용)
//	public static void main(String[] args) {
//		for(int i=5;i<=50;i+=5)
//			System.out.print(i+" ");
//	}
	
	//10) B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용)
//	public static void main(String[] args) {
//		for(int i=2;i<=14;i+=2)
//			System.out.printf("%c ", i+64);
//	}
	
	//11) 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("정수 입력:"); int num = scanner.nextInt();
//		int sum=0;
//		
//		for(int i=1;i<=num;i++) {
//			sum += i;
//		}
//		
//		System.out.println("1~"+num+"까지의 합:"+sum);
//	}
	
	//12) 1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
//	public static void main(String[] args) {
//		
//		for(int i=2;i<=30;i += 2) {
//			System.out.printf("%2d ", i);
//			
//			if(i %6==0) {
//				System.out.println();
//			}
//		}
//	}
	
	//13) 1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라 
//	public static void main(String[] args) {
//		int sum=0;
//		
//		for(int i=1;i<=10;i++) {
//			if(i%2==0) {
//				sum -= i;
//			} else {
//				sum += i;
//			}
//		}
//		System.out.println("sum : "+ sum);
//	}
	
	//15) Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,	십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라

//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("2자리수 정수 입력(10~99):"); int num = scanner.nextInt();
//		
//		if(num%11 == 0) {
//			System.out.println("10의 자리와 1의 자리가 같습니다.");
//		}
//	}
	
	//16)	숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울, 그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라. if-else 문과 switch 둘 다 이용해 볼 것.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12) : "); int month = scanner.nextInt();
		
		if(month >= 3 && month <=5) {
			System.out.println("봄");
		} else if (month >= 6 && month <=8) {
			System.out.println("여름");
		} else if (month >= 9 && month <=11) {
			System.out.println("가을");
		} else if (month == 12 || month == 1 || month == 2) {
			System.out.println("겨울");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
}


