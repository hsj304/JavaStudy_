package com.sist.movie;

import java.util.Scanner;

import javax.swing.plaf.multi.MultiButtonUI;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/*
 * https://www.kobis.or.kr/kobis/business/main/
 * 일별 박스오피스 : searchMainDailyBoxOffice.do
 * 실시간 예매율 : searchMainRealTicket.do
 * 좌석 점유율 : searchMainDailySeatTicket.do
 */

public class MovieSystem {
	Movie[] movie = new Movie[10];
	
	int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("=========메뉴=========");
		System.out.println("1.일별 박스오피스");
		System.out.println("2.실시간 예매율");
		System.out.println("3.좌석 점유율");
		System.out.println("4.상세보기");
		System.out.println("9.종료하기");
		System.out.println("=====================");
		System.out.print("메뉴 선택:");
		return scan.nextInt();
	}
	
	//목록 출력
	Movie[] movieListData(int no) {
		String[] strUrl = {
				"",
				"searchMainDailyBoxOffice.do",
				"searchMainRealTicket.do",
				"searchMainDailySeatTicket.do"
		};
		String url = "https://www.kobis.or.kr/kobis/business/main/" + strUrl[no];
		
		try {
			//[{},{},{},.....] JSON 
			//[] => JSONArray
			//{} => JSONObject
			Document doc = Jsoup.connect(url).get();
//			System.out.println(doc.toString());
			String msg = doc.toString();
			msg=msg.substring(msg.indexOf("["), msg.lastIndexOf("]")+1);
//			System.out.println(msg);
			JSONParser jp = new JSONParser();
			JSONArray arr = (JSONArray)jp.parse(msg);
			for(int i=0;i<arr.size();i++) {
				JSONObject obj = (JSONObject)arr.get(i);
				movie[i] = new Movie();
				movie[i].title = (String)obj.get("movieNm");
				movie[i].genre = (String)obj.get("genre");
				movie[i].grade = (String)obj.get("watchGradeNm");
				movie[i].director = (String)obj.get("director");
				movie[i].story = (String)obj.get("synop");
				movie[i].time = (String)obj.get("showTm");
			}
		}catch (Exception e) {  }
		
		return movie;
	}
	
	Movie movieDetailData(int no) {
		return movie[no-1];
	}
	
//	public static void main(String[] args) {
//		MovieSystem ms = new MovieSystem();
//		Movie[] mm = ms.movieListData(3);
//		for(int i=0;i<mm.length;i++) {
//			System.out.println((i+1)+"."+mm[i].title);
//		}
//	}
}
