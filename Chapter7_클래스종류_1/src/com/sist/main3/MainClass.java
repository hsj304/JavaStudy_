package com.sist.main3;
/*
 *  인터페이스 간의 상속
 *  interface A
 * 	interface B extends A
 * 
 * 	interface A {
 * 		void aaa();
 * 	}
 * 	interface B extends A {
 * 		void bbb();
 * 		//void aaa();
 * 	}
 * 
 * 	Class C implements B {
 * 		public void aaa() {}
 * 		public void bbb() {}
 * 	}
 */
interface A {
	
}
interface B extends A {
	
}
class C implements B{ 
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new C();
		B b = new C();
		C c = new C(); 
		
//		if(c instanceof A)  // C 객체는 A에 포함
//			System.out.println("OK");
//		if(c instanceof B)
//			System.out.println("OK2");
//		if(b instanceof A)
//			System.out.println("OK3");
//		if(a instanceof C)
//			System.out.println("OK4");
//		if(a instanceof B)
//			System.out.println("OK5");
		
		String s="";
		StringBuffer sb = new StringBuffer();
		Object o = new Object();
		if(s instanceof Object)
			System.out.println("OK");
		if(sb instanceof Object)
			System.out.println("OK2");
		if(o instanceof String)
			System.out.println("OK3");
//		if(s instanceof StringBuffer) => 오류(상속, 포함관계가 아닌 경우는 크기를 잴 수 없다)
		
	}

}
