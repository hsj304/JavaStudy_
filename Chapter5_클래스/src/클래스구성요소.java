import java.util.Scanner;

/*
 * 		자바 형식
 * 		-------
 * 		package  클래스의 위치 ==> 한번 사용
 * 		import 외부 라이브러리 불러오기 ==> 여러번 사용이 가능
 * 		public class ClassName {
 * 			------------------------------------------------
 * 			멤버변수
 * 			= 인스턴스 변수 => new를 사용할때마다 메모리가 따로 생성
 * 			= 정적 변수(공유변수) => 메모리가 한개만 생성
 * 			------------------------------------------------
 * 			생성자 : 메모리 할당시 호출되는 메소드
 * 					= 멤버 변수에 대한 초기화
 * 			------------------------------------------------
 * 			메소드 : 특정 작업을 수행하는 명령문의 집합
 * 			------------------------------------------------
 * 			main() : 프로그램의 시작점
 * 			------------------------------------------------
 * 		}
 * 		===> OOP답게 변환 (객체지향프로그램)
 * 			1) 데이터 보호(캡슐화)
 * 			2) 재사용(상속/포함)
 * 			3) 수정, 추가(다형성) => 오버라이딩/오버로딩
 * 		===>클래스의 종류(추상클래스 / 인터페이스)
 * 		===>예외처리
 * 		----------------------------------------자바언어 기초
 * 		===>라이브러리 : 사용자 정의, 자바에서 지원, 외부 업체에서 지워(Jsoup)
 * 
 * 		메소드 기초
 * 		--------
 * 		메소드 : 한개의 기능을 수행할 목적
 * 			1. 메소드 제작 목적
 * 			---------------
 * 				= 재사용(다른 클래스에서 사용하기 위해 만든다)
 * 				= 중복된 코드를 제거
 * 				 예)
 * 					데이터베이스 연결
 * 					------------- 목록
 * 					오라클 연결
 * 					목록에 출력할 데이터를 읽기
 * 					오라클 닫기
 * 					------------- 데이터 추가
 * 					오라클 연결
 * 					데이터 추가
 * 					오라클 닫기
 * 					------------- 데이터 수정
 * 					오라클 연결
 * 					데이터 수정
 * 					오라클 닫기
 * 					------------- 데이터 삭제
 * 					오라클 연결
 * 					데이터 삭제
 * 					오라클 닫기
 * 					-------------
 * 				= 구조화된 프로그램 = 단락을 나눠서 처리(에러....)
 * 			2. 메소드 형식
 * 				선언부
 * 				public static void main(String[] args)
 * 				구현부
 * 				{}
 * 			3. 메소드 구성요소
 * 			결과값 메소드형
 * 			=>사용자의 요청값을 받아서 처리 결과값을 넘겨준다
 * 			---------------매개변수    ----- 리턴형
 * 			
 * 			리턴형		매개변수
 * 			------------------
 * 			O			X
 * 			리턴형 메소드명()
 * 			------------------
 * 			X			O
 * 			void 메소드명(매개변수...)
 * 			------------------
 * 			X			X
 * 			void 메소드명()
 * 			------------------
 * 			*** 결과값(처리) => 리턴형
 * 			리턴형 : 기본형, 배열, 클래스
 * 			메소드명
 * 				= 알파벳이나 한글 사용이 가능(알파벳은 대소문자 구분)
 * 				= 숫자 사용이 가능(앞에 사용 금지)
 * 				= 특수 문자 사용이 가능(_, ?$)
 * 				= 키워드는 사용할 수 없다
 * 				= 공백이 있으면 안된다
 *				= 약속사항 => 소문자로 시작한다
 *					=> 두개의 단어가 연결 : 두번째 시작은 대문자, _
 *					fileName, file_name
 *				매개변수 : 사용자 요청한 값 => 3개이상
 *						게시판 글쓰기, 수정, 회원가입
 *						*** 3개 이상이면 => 배열, 클래스
 *
 *			형식)
 *				두개 정수를 보내주고 => 더한값을 받는다
 *				int add(int a, int b) //선언부
 *				{
 *					//구현부
 *					int c=a+b;
 *					return c;
 *				}
 *
 *				void gugudan() {
 *					----구구단 출력
 *
 *					return; ==> 메소드는 종료시점이 return에서 종료
 *					=> void 일때는 생략이 가능 => 생략을 하면 컴파일러가 자동으로 return을 호출
 *				}
 *				**변수(20%) / 메소드(80%)
 *			*** 메소드 사용하는 방법
 *				=프로그램
 *					1. 재사용
 *					2. 가독성 : 보기 편하다(유지보수) : 단락나누기
 *					3. 반복 제거 : 소스양을 줄인다
 *				=모든 프로그램 => 메소드 제작
 *					1. 사용자 입력
 *					2. 사용자 요청 처리 => 세분화
 *					3. 결과값 출력
 */

//1. 3개의 정수를 받아서 
//2. 총점,평균, 학점을 구해서 출력

/*
 * 	메소드 호출
 * 	--------
 * 	리턴형이 있는 경우 =======> 데이터형 변수명 = 메소드명()
 * 	리턴형이 없는 경우(void) => 메소드명()
 * 
 * 	return은 항상 마지막에 있다
 * 	중간에 있는 경우도 있다(메소드 종료)
 */

public class 클래스구성요소 {
/*
 * 	메소드
 * 	1) 인스턴스 메소드 => 객체 생성시마다 따로 저장
 * 	2) 정적 메소드 => 한개의 공간에만 저장(JVM에 의해 메몰에 자동 저장)
 * 		static
 * 	3) 추상 메소드 : 선언만 하는 메소드(추상클래스, 인터페이스)
 * 		abstract
 * 	4) 종단 메소드 : 수정이 불가능한 메소드
 * 		final
 * 
 */
	
	static int input(String subject) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(subject + " 입력:");
		int value = scanner.nextInt();
		
		return value;
	}
	
	static int totalGesan(int kor, int eng, int math, int hi, int phy) {
		return kor+eng+math+hi+phy;
	}
	
	static double avgGesan(int total) {
		return total/5.0;
	}
	
	static char scoreGesan(double avg) {
		char score='A';
		switch((int)(avg/10)) {
		case 10:case 9:
			score='A';
			break;
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;
		default:
			score='F';
		}
		return score;
	}
	
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("국어 입력:");
//		int kor = scanner.nextInt();
//
//		System.out.print("영어 입력:");
//		int eng = scanner.nextInt();
//
//		System.out.print("수학 입력:");
//		int math = scanner.nextInt();
//	
//		System.out.print("국사 입력:");
//		int hi = scanner.nextInt();
//
//		System.out.print("물리 입력:");
//		int phy = scanner.nextInt();
		int kor = input("국어");
		int eng = input("영어");
		int math = input("수학");
		int hi = input("국사");
		int phy = input("물리");
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("국사:"+hi);
		System.out.println("물리:"+phy);
		
		int total = totalGesan(kor,eng,math,hi,phy);
		System.out.println("총점:"+total);
		double avg = avgGesan(total);
		System.out.printf("%.2f\n", avg);
		
		char score=scoreGesan(avg);
		
		System.out.println("학점:"+score);
	}

}
