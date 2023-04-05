import java.util.Scanner;

/*
 * 
 */
public class 반복제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 세자리 정수를 입력
		// 조건 : 0을 포함 할 수 없다
		//조건 : 같은 수를 입력할 수 없다
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("세자리 정수를 입력:");
			int input = scanner.nextInt();
			if(input<100 || input > 999) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			int a=input/100;
			int b=(input%100)/10;
			int c=input%10;
			System.out.println("input="+input);
			System.out.println("a=" + a + ", b=" + b + ", c=" + c);
			
			//0을 포함 할 수 없다
			if(a==0 || b==0 || c==0) {
				System.out.println("0은 사용할 수 없습니다.");
				continue;
			}
			//같은 숫자 있는 경우
			if(a==b || b==c || c==a) {
				System.out.println("같은 숫자는 사용할 수 없습니다.");
				continue;
			}
			
			//정상 수행시
			System.out.println("입력값:"+input);
			break;
		}
	}

}
