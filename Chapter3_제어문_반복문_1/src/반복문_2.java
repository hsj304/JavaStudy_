//1~100까지의 합
public class 반복문_2 {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			sum += i;
		}
		System.out.println(sum);
		
		sum=0;
		for(int i=0;i<=100;i+=2) {
				sum +=i;
		}
		System.out.println(sum);
	}
}
