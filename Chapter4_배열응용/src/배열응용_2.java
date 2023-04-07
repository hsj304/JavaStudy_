import java.util.Arrays;

// 정수 10개 저장 공간 => 임의로 초기화 (1~100)
// 최대값 / 최소값 ==> 위치

public class 배열응용_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100+1);
		}
		System.out.println(Arrays.toString(arr));
		
		
		//최대값
		//최소값
		int max=arr[0];
		int min=arr[0];
		int maxIndex=0, minIndex=0;
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
				maxIndex=i;
			}
			if(min>arr[i]) {
				min = arr[i];
				minIndex=i;
			}
			
		}
		
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		System.out.println("최대값위치:"+(maxIndex+1));
		System.out.println("최소값위치:"+(minIndex+1));
		
		
		
		
	}
	

}
