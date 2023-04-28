package com.sist.lib;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class 라이브러리_set_5 {
	public static void main(String[] args) {
		Set set = new HashSet();
		for(int i=0;i<10;i++) {
			int r=(int)(Math.random()*100+1);
			set.add(r);
		}
		
		System.out.println(set);
		//50보다 작은 수
		for(Object o:set) {
			int a=(int)o;
			if(a<50) {
				System.out.print(a + " ");
			}
		}
		System.out.println();
		//50보다 큰수 
		for(Object o:set) {
			int a=(int)o;
			if(a>50) {
				System.out.print(a + " ");
			}
		}
		System.out.println("\n==================");
		//1. 정렬
		//2. 검색이 빠르다
		TreeSet tSet = new TreeSet();
		for(int i=0;i<10;i++) {
			int r=(int)(Math.random()*100+1);
			tSet.add(r);
		}
		System.out.println(tSet);
		System.out.println("50보다 작은 수:" + tSet.headSet(50));
		System.out.println("50보다 큰 수:" + tSet.tailSet(50));
	}
}
