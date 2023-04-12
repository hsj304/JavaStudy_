import java.util.Arrays;
import java.util.Scanner;

/*
 * 1. 난수발생
 * 2. 사용자 입력
 * --------------------
 * 3. 비교
 * 4. 힌트
 * --------------------
 * 5. 종료여부
 */
public class 메소드조립법_3 {
	
	
	
	static int[] input() {
		int[] com = new int[3];
		for(int i=0;i<3;i++) {
			com[i]=(int)(Math.random()*9+1);
			for(int j=0;j<i;j++) {
				if(com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
		
		while(true) {
			int[] user = new int[3];
			Scanner scan = new Scanner(System.in);
			
			System.out.print("세자리 정수 입력:");
			int input=scan.nextInt();
			if(input<100 || input > 999) {
				System.out.println("잘못된 입력입니다!!");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[0]==user[2] || user[2]==user[1]) {
				System.out.println("같은 숫자는 사용이 불가능합니다!!");
				continue;
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0을 입력할 수 없습니다");
				continue;
			}
			
			compare(com, user, input);
		}
	}
	
	static void compare(int[] com, int[] user, int input) {
			//비교
			int s=0,b=0;
			//s는 같은 자리 수가 동일, b는 다른자리에 숫자 
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(com[i]==user[j]) {
						if(i==j) { //같은 자리
							s++;
						} else { // 다른 자리
							b++;
						}
					}
				}
			}
			
			end(s);
			
			//힌트
			System.out.printf("input:%d, result:%dS-%dB\n", input, s, b);
			
			
	}
	
	static void end(int s) {
		//종료 여부
		if(s==3) {
			System.out.println("Game Over!!");
			System.exit(0);
		}
	}
	
	
	public static void main(String[] args) {
		input();
		/*
		int[] com = new int[3];
		int[] user = new int[3];
		for(int i=0;i<3;i++) {
			com[i]=(int)(Math.random()*9+1);
			for(int j=0;j<i;j++) {
				if(com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
//		System.out.println(Arrays.toString(com));
		Scanner scan = new Scanner(System.in);
		//사용자 입력
		while(true) {
			System.out.print("세자리 정수 입력:");
			int input=scan.nextInt();
			if(input<100 || input > 999) {
				System.out.println("잘못된 입력입니다!!");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[0]==user[2] || user[2]==user[1]) {
				System.out.println("같은 숫자는 사용이 불가능합니다!!");
				continue;
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0을 입력할 수 없습니다");
				continue;
			}
			
			//비교
			int s=0,b=0;
			//s는 같은 자리 수가 동일, b는 다른자리에 숫자 
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(com[i]==user[j]) {
						if(i==j) { //같은 자리
							s++;
						} else { // 다른 자리
							b++;
						}
					}
				}
			}
			
			//힌트
			System.out.printf("input:%d, result:%dS-%dB\n", input, s, b);
			//종료 여부
			if(s==3) {
				System.out.println("Game Over!!");
				break;
			}
		}
		*/
		
	}
}
