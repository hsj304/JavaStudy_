//조건문(if)
public class 비교연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1=(char)((Math.random()*26)+65);
		char c2=(char)((Math.random()*26)+65);

		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		
		boolean b1=c1==c2;
		System.out.println("b1="+b1);
		
		b1=c1!=c2;
		System.out.println("b1!="+b1);
		
		b1=c1<c2;
		System.out.println("b1<"+b1);
		
		b1=c1>c2;
		System.out.println("b1>"+b1);
		
		b1=c1<=c2;
		System.out.println("b1<="+b1);
		
		b1=c1>=c2;
		System.out.println("b1>="+b1);
	}

}
