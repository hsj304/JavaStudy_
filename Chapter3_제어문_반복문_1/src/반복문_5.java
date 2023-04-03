import java.util.Scanner;

// 사용자의 입력을받아서 (구구단) => 3

public class 반복문_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("단을 입력하세요 : "); int num = scanner.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}
}
