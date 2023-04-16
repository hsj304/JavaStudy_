package com.sist.main;

import java.io.FileReader;

class Movie{
	String no;
	String title;
	String genre;
	String poster;
	String actor;
	String regDate;
	String grade;
	String director;
	
	
}
class MovieSystem{
	Movie[] movies = new Movie[1938];
	
	MovieSystem() {
		String data="";
		StringBuffer sb = new StringBuffer();
		try {
			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
			int i=0;
			while((i=fr.read()) != -1) {
				data=String.valueOf((char)i);
				sb.append(data);
			}
			fr.close();
			System.out.println(sb.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		String msg = sb.toString();
		String[] movie = msg.split("\n");
		int i=0;
		for(String m:movie) {
			String[] ss=m.split("\\|");
			
			movies[i]=new Movie();
			movies[i].no=ss[0];
			movies[i].title=ss[1];
			movies[i].genre=ss[2];
			movies[i].poster=ss[3];
			movies[i].actor=ss[4];
			movies[i].regDate=ss[5];
			movies[i].grade=ss[6];
			movies[i].director=ss[7];
			i++;
			
		}
	}
}
public class 생성자_3 {
	public static void main(String[] args) {
		MovieSystem ms = new MovieSystem();
		for(Movie m:ms.movies) {
			System.out.println(m.title);
		}
	}
}
