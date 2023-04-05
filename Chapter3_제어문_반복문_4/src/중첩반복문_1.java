
public class 중첩반복문_1 {

	public static void main(String[] args) {
//		char c = 'A';
//		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=3;j++) {
//				System.out.print(c++ + " ");
//			}
//			System.out.println();
//		}
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.println("i="+i+", j="+j);
//			}
//		}
	
		System.out.println("==========구구단==========");
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%d * %d = %2d\t", j, i, j*i);
			}
			System.out.println();
		}
	
	}

}
