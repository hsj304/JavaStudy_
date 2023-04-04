
public class 반복문_2 {
	public static void main(String[] args) {
		//1~100까지 합, 짝수 합, 홀수 합
		int sum=0, even=0, odd=0;
		
		//1~100까지 증가하는 변수 => 루프변수
//		int i=1;
//		while(i<=100) {
//			sum +=i;
//			if(i%2==0) {
//				even+=i;
//			} else {
//				odd += i;
//			}
//			i++;
//		}
		
		for(int i=1;i<=100;i++) {
			sum +=i;
			if(i%2==0) {
				even+=i;
			} else {
				odd += i;
			}
			
		}
		
		System.out.println("sum="+sum+" even="+even+" odd="+odd);
	}
}
