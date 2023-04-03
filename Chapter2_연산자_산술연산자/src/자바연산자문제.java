import java.util.Scanner;

public class 자바연산자문제 {

	//1번
//	public  static void main(String[] arg) 
//	{  
//	   int a;   
//	   int b;   
//	   a=3;   
//	   b=a+5;       
//	   System.out.printf("a의 값: %d \n", a);   
//	   System.out.printf("b의 값: %d \n", b);   
//	   //a:3, b:8
//	}
	
	//2번
//	public static void main(String[] arg) 
//	{  
//	    int a, b;  
//	    a = 6;  
//	    b = 2;   
//	    System.out.printf("덧셈 연산 결과: %d \n", a+b);  //8
//	    System.out.printf("뺄셈 연산 결과: %d \n", a-b);  //4
//	    System.out.printf("곱셈 연산 결과: %d \n", a*b);  //12
//	    System.out.printf("나누기 연산 결과: %d \n", a/b); //3
//	    System.out.printf("나머지 연산 결과: %d \n", a%b); //0
//	}
	
	//3번
//	public static void main(String[] arg) 
//	{  
//	      int num1, num2;   
//	      num1 = 10/3;
//	       // '몫' 출력   
//	      num2 = 10%3;
//	       // '나머지' 출력
//	   System.out.printf("      몫: %d \n", num1);   //3
//	   System.out.printf("나머지: %d \n", num2);   //1
//	}
	
	//4번
//	public static void main(String[] arg) 
//	{
//	     int num1=1, num2=2, num3=3, num4=4, num5=5;     
//	     num1 = num1 +    num2; //3
//	     num2 = num2 - 2;       //0
//	     num3 = num3 * 2;       //6
//	     num4 = num4 / 2;       //2
//	     num5 = num5 % 2;       //1
//	     System.out.printf("%d, %d, %d, %d, %d \n",num1,num2,num3,num4,num5);   
//	}

	//5번
//	public static void main(String[] arg) 
//	{
//	      int num1=10;   
//	      System.out.printf("%d \n", num1); //10
//	      num1++;
//	      System.out.printf("%d \n", num1);//11
//	      ++num1;
//	      System.out.printf("%d \n", num1);//12
//	      --num1;
//	      System.out.printf("%d \n", num1);//11
//	      num1--;
//	      System.out.printf("%d \n", num1);//10
//	}

	//6번
//	public static void main(String[] arg) 
//	{
//	       int num1=10, num2=10;   
//	       int a, b;   
//	       a = ++num1; //11
//	       b = num2++; //10
//
//	       System.out.printf("%d, %d \n", b, num2); //10  11
//	}

	//7번
//	public static void main(String[] arg) 
//	{
//	        int num1=10, num2=10;   
//	        int a, b;   
//	        num1 = num1 + 1; //num1 : 11
//	        a = num1; //a : 11
//	        System.out.printf("%d, %d \n", a, num1); // 11, 11
//	        b = num2; // 10
//	        num2 = num2 + 1; //11
//	        System.out.printf("%d, %d \n", b, num2);// 10, 11
//	}

	//8번
//	public static void main(String[] arg) 
//	{
//	    int num1=10, num2=10;
//	    System.out.printf("%d \n", ++num1);  //11
//	    System.out.printf("%d \n", num1);  //11
//	    System.out.printf("%d \n", num2++); //10
//	    System.out.printf("%d \n", num2);  //11
//	}

	//9번
//	public static void main(String[] arg) 
//	{
//	    int num1=10, num2=10;
//	    System.out.printf("%d \n", ++num1); //11
//	    System.out.printf("%d \n", num1);   //11
//	    System.out.printf("%d \n", num2++); //10
//	    System.out.printf("%d \n", num2);   //11
//	}
	
	//10번
//	public static void main(String[] arg) 
//	{
//	    int num1 = 2;
//	    int num2 = 7;
//	    int num3; 
//	    int num4; 
//	    num1++; 
//	    num3 = --num1; 
//	    --num2; 
//	    num4 = num2++; 
//	    System.out.printf("%d\n", num3); //2
//	    System.out.printf("%d\n", num4); //6
//	}

	//11번
//	public static void main(String[] arg) 
//	{
//		int i=0;
//		int re=0;
//		i=3;
//		re = ++i;
//		System.out.println("re:"+re+", i:" +i); //re:4, i:4
//		i=3;
//		re = i++;
//		System.out.println("re:" +re + ", i:"+i); // re:3, i:4
//	}
	
	//12번
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int a,b;
//		System.out.print("첫번째 정수를 입력하세요:");
//		a=scan.nextInt();
//		System.out.print("두번째 정수를 입력하세요:");
//		b=scan.nextInt();
//		
//		System.out.println(a+"-"+b+"="+(a-b));
//		System.out.println(a+"*"+b+"="+(a*b));
//	}
	
	//13번
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		
//		int a,b,c;
//		System.out.print("첫번째 정수를 입력하세요:");
//		a=scan.nextInt();
//		System.out.print("두번째 정수를 입력하세요:");
//		b=scan.nextInt();
//		System.out.print("세번째 정수를 입력하세요:");
//		c=scan.nextInt();
//		
//		System.out.println(a+" * "+b+" + "+c+" = "+(a*b+c));
//		
//	}
	
	//14번
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a,b;
		System.out.print("첫번째 정수를 입력하세요:");
		a=scan.nextInt();
		System.out.print("두번째 정수를 입력하세요:");
		b=scan.nextInt();
		
		System.out.println("나머지는 : "+ a%b);
	}
}
