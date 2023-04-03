import java.util.Scanner;

//가위바위보
public class 선택문_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int com=(int)(Math.random()*3); //0(가위), 1(바위), 2(보)
		//사용자 입력
		System.out.print("가위(0), 바위(1), 보(2) 입력:");
		int user = scanner.nextInt();
		
		switch(com) {
		case 0:
			System.out.println("컴퓨터:가위"); 
			break;
		case 1:
			System.out.println("컴퓨터:바위"); 
			break;
		case 2:
			System.out.println("컴퓨터:보"); 
			break;
		}
		
		switch(user) {
		case 0:
			System.out.println("플레이어:가위"); 
			break;
		case 1:
			System.out.println("플레이어:바위"); 
			break;
		case 2:
			System.out.println("플레이어:보"); 
			break;
		}
		
		switch(com) {
		case 0:
			switch(user) {
			case 0:
				System.out.println("비겼습니다.");
				break;
			case 1:
				System.out.println("사용자가 이겼습니다.");
				break;
			case 2:
				System.out.println("컴퓨터가 이겼습니다.");
				break;
			}
			break;
		case 1:
			switch(user) {
			case 0:
				System.out.println("컴퓨터가 이겼습니다.");
				break;
			case 1:
				System.out.println("비겼습니다.");
				break;
			case 2:
				System.out.println("사용자가 이겼습니다.");
				break;
			}
			break;
		case 2:
			switch(user) {
			case 0:
				System.out.println("사용자가 이겼습니다.");
				break;
			case 1:
				System.out.println("컴퓨터가 이겼습니다.");
				break;
			case 2:
				System.out.println("비겼습니다.");
				break;
			}
			break;
		}
	}
}
