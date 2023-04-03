import java.util.Scanner;

public class 다중조건문_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("세개의 정수 입력(10 20 30): ");
		int kor = scanner.nextInt(), eng = scanner.nextInt(), math = scanner.nextInt();
		
		int avg = (kor+eng+math)/3;
		
		System.out.println("국어점수:"+ kor);
		System.out.println("영어점수:"+ eng);
		System.out.println("수학점수:"+ math);
		
		System.out.println("총점:" + (kor+eng+math));
		System.out.printf("평균:%.2f\n", (kor+eng+math)/3.0);
		
		char score;
		char option;
		if(avg >= 90) {
			score='A';
			if(avg>97) {
				option = '+';
			} else if (avg>=94) {
				option = '0';
			} else {
				option = '-';
			}
		} else if (avg>=80) {
			score='B';
			if(avg>87) {
				option = '+';
			} else if (avg>=84) {
				option = '0';
			} else {
				option = '-';
			}
			
		} else if (avg>=70) {
			score='C';
			if(avg>77) {
				option = '+';
			} else if (avg>=74) {
				option = '0';
			} else {
				option = '-';
			}
		} else if (avg>=60) {
			score='D';
			if(avg>67) {
				option = '+';
			} else if (avg>=64) {
				option = '0';
			} else {
				option = '-';
			}
		} else {
			score='F';
			option='0';
		}
	}
}
