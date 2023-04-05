//임의의 정수 10개를 받아서 최대값/최소값 구하기
import java.util.*;

public class 배열_4 {
	public static void main(String[] args) {
		int[] arr= new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		//출력용으로 사용
		for(int a:arr) {
			System.out.print(a+ " ");
		}	
		
		//최대값, 최소값
		int max=arr[0];
		int min=arr[0];
		
		for(int a:arr) {
			if(max<a)
				max =a;
			if(min>a)
				min=a;
		}
		System.out.println();
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
	}
}
