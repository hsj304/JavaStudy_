import java.util.Scanner;

public class 선택문_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("세개의 정수 입력(10 20 30):");
		int kor = scanner.nextInt(), eng = scanner.nextInt(), math = scanner.nextInt();
		int avg = (kor+eng+math)/3;
		
		//학점
		char score;
		switch(avg/10) {
		case 10:case 9:
			score = 'A'; break;
		case 8:
			score = 'B'; break;
		case 7:
			score = 'C'; break;
		case 6:
			score = 'D'; break;
		default:
			score = 'F';
		}
		
		System.out.println("학점:"+score);
		
	}
}
