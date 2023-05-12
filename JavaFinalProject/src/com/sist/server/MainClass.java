package com.sist.server;

/*
 * Thread 사용밥법
 * 1)클래스 상속을 받는 방법
 * 		재정의 ->변경해서 사용
 * 		class A extends Thread {
 *  	
 *  	}
 * 2) 인터페이스 상속을 받는 방법
 * 	  ------------
 * 	  동작만 지정
 * 
 * }
 */

class MyThread extends Thread{
	//각 쓰레드마다 => 쓰레드명을 설정 => Thread-0 .........
	public void run() {
		//작업
		try {
			for(int i=1;i<=10;i++) {
				System.out.println(getName()+":"+i);
				Thread.sleep(100);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

public class MainClass {
	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();
		MyThread m3 = new MyThread();
		
		/*
		 * JVM  역할
		 * 1) 이름 설정
		 * 2) 우선순위 결정
		 * 	  1~10 
		 * 	 사용자 정의 => NORM_PRIORITY => 중간(5)
		 * 	 1 = > main thread
		 * 
		 */
		System.out.println("m1=>"+m1.getName()+", 우선순위"+m1.getPriority());
		System.out.println("m2=>"+m2.getName()+", 우선순위"+m2.getPriority());
		System.out.println("m3=>"+m3.getName()+", 우선순위"+m3.getPriority());
		m1.start();
		m2.start();
		m3.start();
	}
}
