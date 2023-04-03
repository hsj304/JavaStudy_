import java.util.Scanner;

//세 개의 정수를 입력 받아서 총점 / 평균 / 학점 

public class 조건문_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int kor, eng, math;
		
		System.out.print("점수 입력 ex)80 90 100 : "); 
		kor = scan.nextInt(); eng = scan.nextInt(); math = scan.nextInt();
		
		int total = kor+eng+math;
		double avg = total/3.0;
		//학점
		int temp=(int)avg;
		char score='A';
		if(temp > 90 && temp <=100)
			score='A'; //독립적인 문장 => 모든 if문을 수행한다 (속도가 늦다)
		if(temp > 80 && temp <90)
			score='B';
		if(temp > 70 && temp <80)
			score='C';
		if(temp > 60 && temp <70)
			score='D';
		if(temp < 60)
			score='F';
		
		
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println("학점:"+score);
	}

}
