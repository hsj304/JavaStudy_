//&&, ||
/*
 * (조건) && (조건)
 * 
 * && -> 범위나 기간에 포함
 * T T => T
 * T F => F
 * F T => F
 * F F => F
 * 
 * || -> 범위나 기간을 벗어난 경우 : 행사
 * T T => T
 * T F => T
 * F T => T 
 * F F => F
 * 
 * => 효율적 연산
 * 	() && ()
 * false  --
 * 	() || ()
 * true	  --
 * 
 * 
 */
public class 논리연산자 {
	public static void main(String[] args) {
//		int a=10;
//		int b=9;
//		
//		boolean bCheck = (a<b) || (++b==a);
//		System.out.println(bCheck);
//		System.out.println("b="+b);
		
//		int a=100;
//		int b=99;
//		
//		boolean bCheck = (a>b) && (b==a);
//		System.out.println(bCheck);
//		bCheck = (a>b) || (b==a);
//		System.out.println(bCheck);
		
//		char c = (char)((Math.random()*26)+65);
//		boolean bCheck = c >= 'a' && c <= 'z';
//		System.out.println(bCheck);
//		System.out.println("c="+c);
		
//		char sex='M';
//		int score=87;
//		
//		boolean bCheck = (sex=='M' && score>=80);
//		System.out.println(bCheck);
		
//		int a=10;
//		boolean bCheck=a%2==0 && a>2;
//		System.out.println(bCheck);
		
		int year=2024;
		boolean bCheck=((year%4==0 && year%100!=0) || (year%400==0) );
		System.out.println(bCheck);
	}
}
