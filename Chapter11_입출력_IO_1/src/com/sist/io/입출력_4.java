package com.sist.io;
import java.io.*;
//BufferedReader / BufferedWriter => 필터스트림

public class 입출력_4 {
	public static void main(String[] args) throws Exception {
		//자동으로 지정된 파일을 생성, 이미 존재하는 경우는 덮어쓴다
		FileWriter out = new FileWriter("c:\\java_datas\\movie_1.txt"); // , true 이어쓰기
		FileReader in = new FileReader("c:\\javaDev\\movie.txt");
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		while(true) {
			String data = br.readLine();
			if(data==null) break;
			bw.write(data+"\n");
		}
		System.out.println("읽기/쓰기 완료");
		in.close();
		out.close();
		
	}
}
