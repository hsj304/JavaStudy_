import java.util.Scanner;

//가위바위보 게임
public class 반복문_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int win=0, lose=0, same=0;
		
		while(true) {
			System.out.print("가위(0), 바위(1), 보(2), 종료(9) :");
			
			int com = (int)(Math.random()*3);
			int user = scanner.nextInt();
			
			if(user ==9) {
				System.out.println("게임종료!");
				break;
			}
			
			if(com==0) {
				System.out.print("컴퓨터 : 가위, ");
			} else if(com==1) {
				System.out.print("컴퓨터 : 바위, ");
			} else if(com==2) {
				System.out.print("컴퓨터 : 보, ");
			}
			
			if(user==0) {
				System.out.println("사용자 : 가위, ");
			} else if(user==1) {
				System.out.println("사용자 : 바위, ");
			} else if(user==2) {
				System.out.println("사용자 : 보, ");
			}
			
//			if (com == user) {
//				System.out.println("비겼습니다.");
//				same++;
//			} else if (com-user==-1 || com-user==2) {
//				System.out.println("이겼습니다.");
//				win++;
//			} else {
//				System.out.println("졌습니다.");
//				lose++;
//			}
			
			switch(com-user) {
			case 0:
				System.out.println("비겼습니다.");
				same++;
				break;
			case -1: case 2:
				System.out.println("이겼습니다.");
				win++;
				break;
			default:
				System.out.println("졌습니다.");
				lose++;
			}
			
			System.out.println("현재 상황 : 승("+win+") 패(" + lose + ") 무("+ same+")");
			
		}
	}
}
