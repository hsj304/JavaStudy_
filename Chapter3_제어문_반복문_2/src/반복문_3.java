// 3의 배수, 5의 배수, 7의 배수의 합 => 갯수

public class 반복문_3 {
	public static void main(String[] args) {
		int a3=0, a5=0, a7=0;
		int c3=0, c5=0, c7=0;
		
		int i=1;
		while(i<=100) {
			//중복적으로 수행 => 단일조건, 중복이 없는 경우 => 다중 조건
			if(i%3==0 ) {
				a3 += i;
				c3++;
			} 
			if(i%5==0 ) {
				a5 += i;
				c5++;
			} 
			if(i%7==0 ) {
				a7 += i;
				c7++;
			}
			i++;
		}

		System.out.println("=====결과값=====");
		System.out.println("1~100 사이의 3의 배수합 :" + a3 + ", 갯수 :" + c3);
		System.out.println("1~100 사이의 5의 배수합 :" + a5 + ", 갯수 :" + c5);
		System.out.println("1~100 사이의 7의 배수합 :" + a7 + ", 갯수 :" + c7);
		
		int max= c3;
		int min= c3;
		if(c5 > max) {
			max = c5;
		}
		if(c7 > max) {
			max = c7;
		}
		if(min > c5) {
			min = c5;
		}
		if(min > c7) {
			min = c7;
		}
		
		System.out.println("가장 많은 갯수는 " +max);
		System.out.println("가장 적은 갯수는 " +min);
	}
}
