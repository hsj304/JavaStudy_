import java.util.Scanner;

/* up-down 게임
 * 컴퓨터가 난수 발생 ( 1~ 100)
 * => 사용자 입력
 * => 입력시 힌트
 * => for문 횟수
 * 		=> 무한 루프 : for (;;) == while(true)
 */
public class 반복문_6 {
	public static void main(String[] args) {
		int com=(int)(Math.random()*100+1);
		int count=0;
		Scanner scanner = new Scanner(System.in);
		
		for(;;) { // 종료 시점을 정해놔야 한다
			System.out.print("1~100까지 수를 입력 : "); int user = scanner.nextInt();
			if(user >= 1 && user <= 100) {
				count++;
				if(user > com) {
					System.out.println("down");
				} else if (user < com) {
					System.out.println("up");
				} else {
					System.out.println("정답");
					System.out.println("입력 횟수 : "+ count);
					System.exit(0);
				}
			} else {
				System.out.println("잘못된 입력");
			}
		}
	}
}
