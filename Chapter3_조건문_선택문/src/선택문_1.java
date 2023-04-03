import java.util.Scanner;

/*
 * 	switch ~ case
 * 	=> 범위를 지정하는 것이 아니라 특정값으로 설정
 * 	=> 사용이 가능한 특정값은 char, 정수, 문자열
 * 						 ''         ""
 * 	=>많이 사용되는 위치 : 게임(키보드별 처리), 메뉴, 네트워크 기능별 처리
 */
public class 선택문_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("==========메뉴==========");
		System.out.println("1.로그인");
		System.out.println("2.회원가입");
		System.out.println("3.로그아웃");
		System.out.println("4.맛집추천");
		System.out.println("5.레시피");
		System.out.println("6.프로그램 종료");
		System.out.println("=======================");
		
		System.out.print("메뉴를 입력하세요(1~6) : "); int num = scanner.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("로그인을 요청하셨습니다!!"); 
			break;
		case 2:
			System.out.println("회원가입을 요청하셨습니다!!"); 
			break;
		case 3:
			System.out.println("로그아웃을 요청하셨습니다!!"); 
			break;
		case 4:
			System.out.println("맛집 추천을 요청하셨습니다!!"); 
			break;
		case 5:
			System.out.println("레시피를 요청하셨습니다!!"); 
			break;
		case 6:
			System.out.println("종료되었습니다."); 
			System.exit(0);
			break;
		default:
			System.out.println("메뉴에 없는 번호입니다.");
			break;
		}
	}

}
