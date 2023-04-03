import java.util.Scanner;

//성적 계산 
//세개의 정수를 받아서 평균을 구해서 등급 출력

public class 다중조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("세개의 정수 입력(10 20 30): ");
		int kor = scanner.nextInt(), eng = scanner.nextInt(), math = scanner.nextInt();
		int avg = (kor+eng+math)/3;
		
		System.out.println("국어점수:"+ kor);
		System.out.println("영어점수:"+ eng);
		System.out.println("수학점수:"+ math);
		
		System.out.println("총점:" + (kor+eng+math));
		System.out.printf("평균:%.2f\n", (kor+eng+math)/3.0);
		
		//학점 계산
		char score='F';
		if(avg >= 90) {
			score = 'A';
		} else if(avg >= 80) {
			score = 'B';
		} else if(avg >= 70) {
			score = 'C';
		} else if(avg >= 60) {
			score = 'D';
		}
		
		System.out.println("학점:" + score);
	}

}
