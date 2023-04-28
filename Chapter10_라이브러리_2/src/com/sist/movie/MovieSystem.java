package com.sist.movie;
import java.util.*;


import java.io.*; 

public class MovieSystem {
	private static ArrayList list = new ArrayList();
	
	
	static {
		try {
			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
			int i=0;
			StringBuffer sb = new StringBuffer();
			
			while((i=fr.read()) != -1) {
				sb.append((char)i);
			}
			fr.close();
//			System.out.println(sb.toString());
			String[] movies = sb.toString().split("\n");
			for(String s:movies) {
				StringTokenizer st = new StringTokenizer(s, "|");
				MovieVO vo = new MovieVO();
				vo.setNo(Integer.parseInt(st.nextToken()));
				vo.setTitle(st.nextToken());
				vo.setGenre(st.nextToken());
				vo.setPoster(st.nextToken());
				vo.setActor(st.nextToken());
				vo.setRegdate(st.nextToken());
				vo.setGrade(st.nextToken());
				vo.setDirector(st.nextToken());
				
				
				
				list.add(vo);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//menu
	public int movieMenu() {
		System.out.println("===== 영화 메뉴 =====");
		System.out.println("1. 목록출력");
		System.out.println("2. 상세보기");
		System.out.println("3. 영화검색");
		System.out.println("9. 종료하기");
		System.out.println("===================");
		System.out.print("메뉴 선택:");
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	//목록 출력(페이지)
	public ArrayList movieListData(int page) {
		int totalpage=(int)(Math.ceil(list.size()/10.0));
		//size()=1938  1938/10.0  193.8 ==> 194
		
		int start=(page-1)*10;
		int end = page*10;
		if(page==totalpage) {
			end = list.size();
		}

		ArrayList movieList = new ArrayList(list.subList(start, end));
		return movieList;
	}
	//상세 보기
	public MovieVO movieDetailData(int no) {
		return (MovieVO)list.get(no-1);
	}
	//영화검색
	
	//조립
	public void process() {
		while(true) {
			int menu=movieMenu();
			
			if(menu == 9) {
				System.out.println("프로그램 종료");
				break;
			} else if (menu==1) {
				Scanner scan = new Scanner(System.in);
				System.out.print("페이지 입력:");
				int page = scan.nextInt();
				ArrayList mList = movieListData(page);
				for(int i=0;i<mList.size();i++) {
					MovieVO vo = (MovieVO)mList.get(i);
					System.out.println(vo.getNo()+"."+vo.getTitle());
				}
			} else if (menu==2) {
				Scanner scan = new Scanner(System.in);
				System.out.print("상세보기할 번호 입력(1~1938):");
				MovieVO vo = movieDetailData(scan.nextInt());
				System.out.println("순위:" + vo.getNo());
				System.out.println("영화명:" + vo.getTitle());
				System.out.println("감독:" + vo.getDirector());
				System.out.println("출연:" + vo.getActor());
				System.out.println("장르:" + vo.getGenre());
				System.out.println("개봉일:" + vo.getRegdate());
				/*
				 *   1
					|쇼생크 탈출
					|드라마
					|https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2
					|팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)
					|2016 .02.24 재개봉, 1995 .01.28 개봉
					|15세 관람가
					|프랭크 다라본트

				 */
				
			}
			
		}
	}
	public static void main(String[] args) {
		MovieSystem ms = new MovieSystem();
	}
}
