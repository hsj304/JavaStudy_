import java.util.Scanner;

//사칙연산 처리
public class 다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수 입력:");
		int num2 = scan.nextInt();
		System.out.print("연산자 입력(+,-,*,/):");
		char op = scan.next().charAt(0);// 문자열 중 첫번째에 있는 문자 하나 추출
		// 자바의 단점 : char는 받을 수 없다 (문자열)
		
		if ( op == '+' ) {
			System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
		} else if (op == '-') { 
			System.out.printf("%d-%d=%d\n", num1, num2, num1-num2);
		} else if (op == '*') { 
			System.out.printf("%d*%d=%d\n", num1, num2, num1*num2);
		} else if (op == '/') { 
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			} else {
				System.out.printf("%d/%d=%.2f\n", num1, num2, num1/(double)num2);
			}
		} else {
			System.out.println("잘못된 연산자입니다!!");
		}
		
		
	}

}
