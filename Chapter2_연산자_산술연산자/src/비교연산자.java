/*
 * 	비교연산자 => 결과값 (boolean) => true/false
 * 	== 같다
 * 	!= 같지 않다
 * 	<  작다 ==> 왼쪽이 기준
 * 	>  크다
 * 	<= 작거나 같다
 * 	>= 크거나 같다
 * 
 *  7==6 false
 *  7!=6 true
 *  -----  byte, int, short, long, double, float, boolean, char
 *  "a"=="a" => equals()
 * 	'A' < 'B' 65<66 ==> true
 * 	10>5 true
 * 	10<=10 true
 */
public class 비교연산자 {

	public static void main(String[] args) {
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//1. ==
		boolean b1=a==b;
		System.out.println("a==b: "+b1);
		//2. !=
		b1=a!=b;
		System.out.println("a!=b: "+b1);
		b1=a<b;
		System.out.println("a<b: "+b1);
		b1=a>b;
		System.out.println("a>b: "+b1);
		b1=a<=b;
		System.out.println("a<=b: "+b1);
		b1=a>=b;
		System.out.println("a>=b: "+b1);
	}

}
