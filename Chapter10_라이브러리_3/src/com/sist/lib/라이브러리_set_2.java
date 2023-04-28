package com.sist.lib;

import java.util.HashSet;
import java.util.Set;

class Student implements Cloneable {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	//오버라이딩
//	public String toString() {
//		return name + "(" + age +")";
//	}
	

	//복제 => 새로운 메모리를 만들어서 사용
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (name+age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student s =(Student)obj;
			return name.equals(s.name) && age==s.age;
		}
		return super.equals(obj);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "(" + age +")";
	}
	//매개변수 생성자
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

//new, clone
//=
public class 라이브러리_set_2 {
	public static void main(String[] args) {
		Set set = new HashSet();
		//객체 비교 => 메모리 주소, 실제 저장된 값
		// 			 기본		재정의(오버라이딩)
		
		Student s1 = new Student("홍길동", 25);
		Student s2 = new Student("홍길동", 25);
		
		System.out.println(s1+"\n"+s2);
		
		set.add(s1);
		set.add(s2);
		
		System.out.println(set);
		
		if(s1.equals(s2)) {
			System.out.println("s1==s2");
		} else {
			System.out.println("s1!=s2");
		}
		
	}
}
