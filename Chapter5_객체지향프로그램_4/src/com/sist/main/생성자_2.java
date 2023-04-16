package com.sist.main;
/*
 * 	초기화
 * 	1. 디폴트 값
 * 		int => 0, String => null, boolean => false....
 * 	2. 명시적 초기화 : 직접 값을 설정
 * 		class A {
 * 			int a=10;
 * 		}
 * 	3. 생성자 초기화
 * 		class A {
 * 			int a;
 * 			A() {
 * 				a=100;
 * 			}
 *		}
 * 	4. 초기화 블럭
 * 		class A {
 * 			int a;
 * 			{ a=100; }
 * 		}
 * 
 * 		디폴트 => 명시적 => 초기화블럭 => 생성자
 */
//class Student{
//	int hakbun=10;
//	String name;
//	
//	{
//		hakbun=100;
//	}
//	
//	Student() {
//		hakbun=1000;
//	}
//}

class Student {
	int hakbun;
	String name;
	Student() {
		System.out.println("Student() Call...");
		hakbun=1;
		name="홍길동";
	}
	Student(int h, String n){
		hakbun = h;
		name = n;
	}
}

public class 생성자_2 {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.hakbun +"." + s.name);
		// 생성자 호출 new를 앞에 붙여서 호출한다

		Student s1 = new Student(2, "심청이");
		System.out.println(s1.hakbun +"." + s1.name);
		Student s2 = new Student(3, "박문수");
		System.out.println(s2.hakbun +"." + s2.name);
		
	}
}
