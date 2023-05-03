package com.sist.io;

import java.io.File;
import java.io.IOException;

public class FileMain {
	public static void main(String[] args) {
	
		try {
			//File 설정
			File file = new File("c:\\javaDev\school.txt");	
			//File 존재여부 확인
			if(!file.exists()) {
				file.createNewFile();
			}
			System.out.println("파일 만들기 성공...");
//			File dir = new File("c:\\java_datas");
//			if(!dir.exists()) {
//				dir.mkdir();
//				System.out.println("폴더 만들기 완성");
//			}
			
//			File dir=new File("c:\\javaDev");
//			File[] files = dir.listFiles();
//			for(File f:files) {
//				if(f.isFile()) {
//					System.out.println(f.getName() + " " + f.length());
//				} else if (f.isDirectory()) {
//					System.out.println(f.getName() + " DIR " + f.length());
//				}
//			}
		} catch (Exception e) {
			
		}
	}
	
}
