package com.sist.main2;
import java.util.*;

//인터페이스 => 여러개를 묶어서 쉽게 관리할 목적
//스프링 (클래스 관리자) => 인터페이스
public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("해당 클래스 번호:");
		int no = scan.nextInt();
		Container cc= new Container();
		Exec a=(Exec)cc.getBean(no);
		a.execute();
//		if(no==1) {
//			A a = (A)cc.getBean(no);
//			a.execute();
//		}
//		if(no==2) {
//			B b = (B)cc.getBean(no);
//			b.execute();
//		}
//		if(no==3) {
//			C c = (C)cc.getBean(no);
//			c.execute();
//		}
//		if(no==4) {
//			D d = (D)cc.getBean(no);
//			d.execute();
//		}
//		if(no==5) {
//			E e = (E)cc.getBean(no);
//			e.execute();
//		}
	}

}
