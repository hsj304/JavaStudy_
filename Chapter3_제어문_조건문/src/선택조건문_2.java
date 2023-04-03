import java.util.Scanner;

//한 개의 정수를 받아서 60이상 합격 아니면 불합격
public class 선택조건문_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		
		int num=scan.nextInt();
		
		if(num>=60)
			System.out.println(num + "는 합격입니다");
		else
			System.out.println("불합격입니다");
	}

}
