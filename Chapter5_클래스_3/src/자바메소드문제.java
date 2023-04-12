import java.util.Arrays;
import java.util.Scanner;
/*
 * 1)메소드 형식 => 기능처리
 * 	 --------
 * 	 웹 => 화면 변경
 * 	 ------------ 메뉴 클릭, 버튼 클릭, 이미지 클릭, .....
 * 	 검색, 글쓰기, 수정, 회원가입, 회원탈퇴...
 * 	 사용자의 동작과 관련
 * 	 리턴형 메소드명(매개변수...) => 선언부
 * 	{
 * 	}
 * 	= 리턴타입(리턴형)
 */
public class 자바메소드문제 {

	//문제1
	static void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("0~32767까지의 정수 입력:");
		int num = scan.nextInt();
		
		binary(num);
	}
	
	static void binary(int num) {
		int i=num;
		int[] b = new int[16];
		int n=b.length-1;
		
		while(i>0) {
			b[n--] = i%2;
			i /= 2;
		}
		
		print(b);
	}
	
	static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(i%4==0 && i!=0) {
				System.out.print(" ");
			}
			System.out.print(arr[i]);
			
			
		}
	}
	
	static void process1() {
		input();
	}
	//////////
	
	//문제2
	static void rand(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100+1);
		}
	}
	
	static void sort(int[] arr, int n) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				boolean check;
				if(n==0) {
					check=arr[i] > arr[j];
				} else {
					check = arr[i] < arr[j];
				}
						
				if(check) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	static void process2() {
		int[] arr = new int[5];
		rand(arr);
		System.out.println("정렬전:"+ Arrays.toString(arr));
		sort(arr, 0);
		System.out.println("오름차순:"+ Arrays.toString(arr));
		sort(arr, 1);
		System.out.println("내림차순:"+ Arrays.toString(arr));
	}
	/////////////
	
	//문제3
	static void process3() {
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력:");
		int year = scan.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0) {
			System.out.println(year+"년도는 윤년입니다");
		} else {
			System.out.println(year+"년도는 윤년이 아닙니다");
		}
	}
	
	
	public static void main(String[] args) {
//		process1();
//		process2();
		process3();
	}

}
