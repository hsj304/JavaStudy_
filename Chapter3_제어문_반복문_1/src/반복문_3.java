//3의 배수의 합, 갯수 확인(1~100)
public class 반복문_3 {
	public static void main(String[] args) {
		int sum1=0, sum2=0, count1=0, count2=0;
		
//		for(int i=3;i<=100;i+=3) {
//			sum += i;
//			count++;
//		}
//		
//		System.out.println("sum:"+sum+", count:"+count);
		
		//5, 7의 배수 
		for(int i=1;i<=100;i++) {
			if(i%5==0) {
				sum1 += i;
				count1++;
			}
			else if(i%7==0) {
				sum2 +=i;
				count2++;
			}
		}
		System.out.println("5의 배수 합계:"+sum1+", 5의 배수 갯수:"+count1);
		System.out.println("7의 배수 합계:"+sum2+", 7의 배수 갯수:"+count2);
	}
}
