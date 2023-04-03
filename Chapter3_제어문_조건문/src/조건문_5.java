import java.util.Scanner;

//중첩 조건문 => 3개의 정수를 받아서 총점 / 평균 / 학점 (A+, A-)
//97 A+  94 A0 ~ A-

public class 조건문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int kor, eng, math, total;
		double avg;
		char score = 'A', option = '-';
		
		// 사용자의 입력값을 받는다
		System.out.print("세 개의 정수를 입력(90 90 90) : ");
		kor = scan.nextInt(); eng = scan.nextInt(); math = scan.nextInt();
		
		total = kor + eng + math;
		avg = total/3.0;
		
		int temp = (int)avg;
		if(temp >= 90 && temp <100) {
			score = 'A';
			if(temp >= 97 && temp <=100) {
				option = '+';
			}
			if(temp >= 94 && temp <97) {
				option = '0';
			}
		}
		if(temp >= 80 && temp <90) {
			score = 'B';
		}
		if(temp >= 70 && temp <80) {
			score = 'C';
		}
		if(temp >= 60 && temp <70) {
			score = 'D';
		}
		if(temp <60) {
			score = 'F';
			option=' ';
		}
		
		
		
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점점수:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println("학점:"+score+option);

	}

}
