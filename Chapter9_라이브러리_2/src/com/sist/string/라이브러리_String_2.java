package com.sist.string;
import java.io.*;

public class 라이브러리_String_2 {

	public static void main(String[] args) {
		try{
			long start = System.currentTimeMillis();
			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
			int i=0;
			StringBuffer data = new StringBuffer();
			while((i=fr.read()) != -1) { //-1은 EOF file의 끝
				data.append((char)i);
			}
			long end = System.currentTimeMillis();
			fr.close();
			System.out.println(data);
			System.out.println("걸린 시간 : " + (end-start));
		} catch (Exception e) {
			e.printStackTrace(); //에러 메시지 확인
			//getMessage() 어떤 에러인지만 확인
		}

	}

}
