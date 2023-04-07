import java.util.Arrays;

//빈도수 구하기
public class 배열응용_5 {
	public static void main(String[] args) {
		int[] arr=new int[100];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10);
		}
		
		System.out.println(Arrays.toString(arr));
		
		//빈도
		int[] result = new int[10];
		for(int i=0;i<arr.length;i++) {
			result[arr[i]]++;
		}
		
		for(int i=0;i<result.length;i++) {
			System.out.println(i + ":"+ result[i]);
		}
		
		int max=result[0];
		int min=result[0];
		int maxIndex=0,minIndex=0;
		for(int i=0;i<result.length;i++) {
			if(max<i) {
				max=result[i];
				maxIndex=i;
			}
			if(min>i) {
				min=result[i];
				minIndex=i;
			}
		}
		System.out.println("빈도수가 가장 많은 값:"+max);
		System.out.println("빈도수가 가장 적은 값:"+min);
		System.out.println("빈도수가 가장 많은 수:"+maxIndex);
		System.out.println("빈도수가 가장 적은 수:"+minIndex);
	}
}
