package com.sist.lang;
// delete, insert => 원본 변경
// substring => 원본 변경이 없다
public class 라이브러리_StringBuffer_1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("홍길동입니다");
		sb.delete(3, 6); //delete(int s, int e) => e-1
		System.out.println(sb);
		sb.insert(3, "입니다"); // 자체 변경
		System.out.println(sb);
		System.out.println(sb.substring(3)); // 자체 변경이 되지 않는다(새로운 메모리에 저장)
		
		
	}
}
