import java.util.Arrays;
import java.util.Scanner;

public class 자바배열문제 {
	//1에서 100까지 3의 배수를 더하는 while 문의 빈칸에 적절한 코드를 삽입하라
//	public static void main(String[] args) {
//		int sum=0, i=1;
//		while (i<100) {
//		    if(i%3 != 0) {
//		        i++;
//		        continue;
//		    }
//		    else sum += i;
//		    i++;
//		}
//	}
	
	//2. 1에서 50까지의 합을 더하는 while 문이다. 빈칸에 적절한 코드를 삽입하라.

//	public static void main(String[] args) {
//		int sum=0,i=1;
//		while (true) {
//		    if(i>50  ) break;
//		    sum+=i;
//		    i++;  
//		} 
//		System.out.println(sum);
//	}
	
	//2_1
//	public static void main(String[] args) {
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=3;j++) {
//				if(j==2)
//					continue;
//				System.out.println("i="+i+", j="+j);
//			}
//		}
//	}
	
	//3. 4
	
	//4. 
//	public static void main(String[] args) {
//		//1) 10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라.
//		char[] arr = new char[10];
//		
//		//2) 0에서 5까지 정수 값으로 초기화된 정수 배열 n을 선언하라
//		int arr1[] = {0,1,2,3,4,5};
//		
//		//3) '일', '월', '화', '수', '목', '금', '토'로 초기화된 배열 day를 선언하라.
//		char[] day = {'일', '월', '화', '수', '목', '금', '토'};
//		
//		//4개의 논리 값을 가진 배열 bool을 선언하고 true, false, false, true로 선언하라.
//		boolean[] bool = {true, false, false, true};
//	}
	
	//5. 
//	public static void main(String[] args) {
//		char[] alpha = {'a', 'b', 'c', 'd'};
//
//		for(int i=0;i<alpha.length;i++)
//		     System.out.print(alpha[i]);
//
//	}
	
	//6. 양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
//	public static void main(String[] args) {
//		int arr[] = new int[10];
//		for(int i=0;i<10;i++) {
//			arr[i] = (int)(Math.random()*100+1);
//			
//			if(arr[i]%3==0) {
//				System.out.print(arr[i] + " ");
//			}
//		}
//	}
	
	//7. 
//	public static void main(String[] args) {
//		int arr[] = new int[10];
//		int sum=0;
//		for(int i=0;i<10;i++) {
//			arr[i] = (int)(Math.random()*10+1);
//			sum += arr[i];
//		}
//		for(int a:arr) {
//			System.out.print(a + " ");
//		}
//		System.out.println("\n평균:"+sum/10.0);
//	}
	
	//8. 
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		
//		int[] arr = new int[5];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = scan.nextInt();
//		}
//		for(int a:arr) {
//			System.out.print(a + " ");
//		}
//	}
	
	//9.
//	public static void main(String[] args) {
//		char[] arr = new char[10];
//		Scanner scan=new Scanner(System.in);
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=scan.next().charAt(0);
//		}
//		
//		for(char a:arr) {
//			System.out.print(a);
//		}
//		
//	}
	
	//10.
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		
//		int[] arr = new int[10];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		System.out.print(arr[2] + " ");
//		System.out.print(arr[4] + " ");
//		System.out.print(arr[arr.length-1] + " ");
//		
//	}
	
	//11. 
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		
//		int[] arr = new int[10];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		int max = arr[0];
//		for(int a:arr) {
//			if(max<a)
//				max = a;
//		}
//		System.out.println(max);
//	}
	
	//12. 
//	public static void main(String[] args) {
//		int arr[] = new int[10];
//		for(int i=0;i<10;i++) {
//			arr[i] = (int)(Math.random()*100+1);
//		}
//		
//		int sum=0;
//		for(int a:arr) {
//			sum += a;
//		}
//		System.out.println("총점:"+sum+", 평균:"+sum/(double)arr.length);
//	}
	
	//13.
	public static void main(String[] args) {
		int[] arr = {95,75,85,100,50};
		int temp;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
}
