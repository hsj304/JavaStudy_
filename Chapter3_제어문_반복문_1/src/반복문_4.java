//1-2+3-4.....10
public class 반복문_4 {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1;i<=10;i++) {
			if(i%2 != 0)
				sum += i;
			else
				sum -= i;
		}
		System.out.println(sum);
	}
}
