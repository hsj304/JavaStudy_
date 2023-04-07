//6개의 난수 발생 => 1~45 => 중복된 수가 없다
public class 배열응용_3 {
	public static void main(String[] args) {
		int[] lotto=new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			
			lotto[i] = (int)(Math.random()*45+1);
			for(int j=0;j<i;j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					continue;
				}
			}
			
		}
		for(int a:lotto) {
			System.out.print(a + " ");
		}
	}
}
