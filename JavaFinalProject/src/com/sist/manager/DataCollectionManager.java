package com.sist.manager;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.*;

public class DataCollectionManager {

	public static void main(String[] args) {
		List<GenieMusicVO> list = new ArrayList<GenieMusicVO>();
		
		FileOutputStream fos = null;
		ObjectOutputStream oos =null;
		//사이트 연결
		
		
		try {
			fos = new FileOutputStream("c:\\java_datas\\genie_music.txt");
			oos = new ObjectOutputStream(fos);
			
			String[] urls = {
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0100",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0200",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0300",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0107",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0500",
					"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230502&genrecode=M0600"
			};
			
			int k=1;
			for(int i=0;i<urls.length;i++) {
				Document doc=Jsoup.connect(urls[i]).get();
				Elements title = doc.select("table.list-wrap td.info a.title");
				Elements singer = doc.select("table.list-wrap td.info a.artist");
				Elements album = doc.select("table.list-wrap td.info a.albumtitle");
				Elements poster = doc.select("table.list-wrap a.cover img");
				Elements etc = doc.select("table.list-wrap span.rank");
				
				for(int j=0;j<title.size();j++) {
					System.out.println("고유번호:" + k);
					System.out.println("카테고리번호:" + (i+1));
					System.out.println(title.get(j).text());
					System.out.println(singer.get(j).text());
					System.out.println(album.get(j).text());
					System.out.println(poster.get(j).attr("src"));
					String ss = etc.get(j).text();
					System.out.println(ss);
					String state="";
					String id=""; //등폭
					if(ss.contains("유지")) {
						state="유지";
						id="0";
					} else if(ss.contains("new")) {
						state="NEW";
						id="0";
					} else {
						state=ss.replaceAll("[0-9]", ""); //숫자 전체를 지움
						id=ss.replaceAll("[가-힣]", ""); //한글 전체를 지움
					}
					System.out.println("상태:"+state);
					System.out.println("등폭:"+id);
					
					System.out.println("동영상:"+youtubeKeyData(title.get(i).text()));
					System.out.println("======================");
					GenieMusicVO vo = new GenieMusicVO();
					vo.setNo(k);
					vo.setCno(i+1);
					vo.setTitle(title.get(j).text());
					vo.setSinger(singer.get(j).text());
					vo.setAlbum(album.get(j).text());
					vo.setPoster(poster.get(j).attr("src"));
					vo.setState(state);
					vo.setIdcreament(Integer.parseInt(id));
					vo.setKey(youtubeKeyData(title.get(i).text()));
					list.add(vo);
					
					k++;
				}
				
			}
			oos.writeObject(list);
			System.out.println("저장 완료!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
				oos.close();
			} catch (Exception e2) {
				
			}
		}

	}
	
	public static String youtubeKeyData(String title) {
		String key ="";
		
		try {
			String url="https://www.youtube.com/results?search_query=" + URLEncoder.encode(title, "UTF-8");
			Document doc = Jsoup.connect(url).get();
			String data = doc.toString();
			Pattern p = Pattern.compile("/watch\\?v=[^가-힣]+");
			Matcher m=p.matcher(data);
			while(m.find()) {
				String s=m.group();
				s=s.substring(s.indexOf("=")+1, s.indexOf("\""));
				key=s;
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return key;
	}

}
