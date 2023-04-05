import java.util.Arrays;

public class 배열_5 {
	public static void main(String[] args) {
		char[] arr=new char[20];
		for(int i=0;i<arr.length;i++) {
			int n=(int)(Math.random()*2);
			if(n==0) {
				arr[i] = (char)((Math.random()*26)+65);
			} else {
				arr[i] = (char)((Math.random()*26)+97);
			}
		}
		System.out.println(Arrays.toString(arr));
		
		int a=0, b=0;
		
		for(char c:arr) {
			if(c>='A' && c<='Z') {
				a++;
			} else {
				b++;
			}
		}
		System.out.println("대문자는 " + a + ", 소문자는 "+ b);
		
	}
}
