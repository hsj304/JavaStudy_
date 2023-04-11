import java.util.Arrays;

/*
 * 		리턴형	매개변수
 * 		O		O
 * 		O		X
 * 		X		O
 * 		X		X
 * 
 * 		1) 2~9단 구구단 출력 (4)
 * 		2) id,pwd를 받아서 로그인 true, 아니면 false(1)
 * 		3) 검색어를 입력받아서 검색된 노래명들을 출력(3)
 * 		4) 5정수를 넘겨주고 정렬된 정수를 받는다
 * 		static int[] sort(int a, int b, int c, int d, int e)
 */

//6개의 난수를 발생해서 => 전송을 받은 다음 => 총합, 평균
public class 메소드_4 {
	//6개 난수를 발생
	static int[] rand() {
		int[] arr=new int[6];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100+1);
		}
		return arr;
	}
	
	//최대값, 최소값
	static int max(int[] arr) {
		int max=arr[0];
		for(int a:arr) {
			if(max < a)
				max=a;
		}
		return max;
	}
	
	static int min(int[] arr) {
		int min=arr[0];
		for(int a:arr) {
			if(min > a)
				min=a;
		}
		return min;
	}
	
	static void process() {
		int[] arr = rand();
		int total = 0;
		for(int a:arr) {
			total += a;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총합:"+total);
		System.out.printf("%.2f\n", total/(double)arr.length);
		System.out.println("최대값:"+max(arr));
		System.out.println("최소값:"+min(arr));
	}
	
	public static void main(String[] args) {
		process();
	}
}
