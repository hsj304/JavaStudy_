import java.util.Scanner;


//char를 한개 보내서 => 대문자, 소문자 => boolean
public class 메소드_3 {
	static String isAlpha(char c) {
		String bCheck = "";
		if(c >= 'A' && c<='Z') {
			bCheck = "대문자입니다";
		} else if(c>='a' && c<='z') {
			bCheck = "소문자입니다";
		}
		return bCheck;
	}
	
	static void process() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("알파벳 입력:");
		char c = scanner.next().charAt(0);
		
		String result = isAlpha(c);
		System.out.println(c+"는(은) " + result);
		//가급적이면 결과값이 여러개인 경우 문자열로 처리
		
	}
	
	public static void main(String[] args) {
		process();
	}
}
