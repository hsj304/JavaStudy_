import java.util.Scanner;

public class 자바조건문문제 {
		
	//문제1. 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요:"); int num = scan.nextInt();
//		
//		if(num >= 50)
//			System.out.println(num+"은(는) 50 이상입니다.");
//		else
//			System.out.println(num+"은(는) 50 이하입니다.");
//			
//	}
	
	
	// 문제2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요:"); int num = scan.nextInt();
//		
//		if(num%3==0)
//			System.out.println(num+"은(는) 3의 배수 입니다.");
//		else
//			System.out.println(num+"은(는) 3의 배수가 아닙니다.");
//	}

	
//	문제3. 1학년부터 4학년까지 중간고사 시험을 보았다. 
//	         4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
//	         이를 판단하는 프로그램을 작성해보자.
//	         점수가 0미만 100초과이면 경고문구 출력!
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("학년을 입력하세요:"); int grade = scan.nextInt();
//		System.out.print("점수를 입력하세요:"); int num = scan.nextInt();
//		
//		if(num>=0 && num<=100) {
//			if(grade==4) {
//				if(num>=70)
//					System.out.println("합격");
//				else
//					System.out.println("불합격");
//			} else {
//				if(num>=60)
//					System.out.println("합격");
//				else
//					System.out.println("불합격");
//			}
//		} else {
//			System.out.println("점수를 잘못 입력하셨습니다.");
//		}
//	}
	
	//문제4. 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 합계와 평균을 구해보자.
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//
//		System.out.print("세개의 정수를 입력하세요 ex)10 20 30 : "); 
//		int num1 = scan.nextInt(); int num2 = scan.nextInt(); int num3 = scan.nextInt();
//		
//		int max=0, min=9999999, sum;
//		double avg;
//		
//		sum = num1+num2+num3;
//		avg = sum/3.0;
//		
//		if(max<num1)
//			max = num1;
//		if(max<num2)
//			max = num2;
//		if(max<num3)
//			max = num3;
//		
//		if(min>num1)
//			min = num1;
//		if(min>num2)
//			min = num2;
//		if(min>num3)
//			min = num3;
//		
//		System.out.printf("최대값:%d, 최소값:%d, 합계:%d, 평균:%.2f\n", max, min, sum, avg);
//		
//	}
	
	
	//문제5. 사용자로 부터 정수를 입력받아서 양수인지 음수인지 확인하는 프로그램 작성
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//
//		System.out.print("정수를 입력하세요:"); int num = scan.nextInt();
//		
//		if(num >= 0)
//			System.out.println(num+"은(는) 양수입니다.");
//		else
//			System.out.println(num+"은(는) 음수입니다.");
//	}
	
	//문제6. 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성
//	public static void main(String[] args) {
//		int a = (int)(Math.random()*2);
//		char ch;
//		
//		if(a==0) {
//			ch = (char)(Math.random()*26+65);
//		} else {
//			ch = (char)(Math.random()*26+97);
//		}
//		
//		if(ch>='A' && ch <='Z') {
//			System.out.println(ch + "는 대문자입니다.");
//		} else {
//			System.out.println(ch + "는 소문자입니다.");
//		}
//		
//	}
	
//	문제7. 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램
//    작성 ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 
//    나머지는 F)
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("세개의 정수를 입력하세요 ex)10 20 30 : "); 
		int num1 = scan.nextInt(), num2 = scan.nextInt(), num3 = scan.nextInt();
		
		int total = num1+num2+num3;
		double avg = total/3.0;
		char score = 'F';
		
		int temp = (int)avg;
		
		if(temp >= 90) {
			score = 'A';
		} else if (temp >= 80) {
			score = 'B';
		} else if (temp >= 70) {
			score = 'C';
		} else if (temp >= 60) {
			score = 'D';
		} else {
			score = 'F';
		}
		
		System.out.printf("총점:%d, 평균:%.2f, 학점:%c\n", total, avg, score);
	}
	
}
