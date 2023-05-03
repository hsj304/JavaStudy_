package com.sist.io2;
import java.util.*;
import java.io.*;

public class StudentSystem {
	//모든 학생을 읽어서 메모리에 저장
	private static List<Student> stdList = new ArrayList<Student>();
	//파일을 읽어서 메모리에 저장
	static {
		FileReader fr =null;
		try {
			fr = new FileReader("c:\\java_datas\\school.txt");
			StringBuffer sb = new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1) {
				sb.append((char)i);
			}
			//1|홍길동|90|90|90|270|90.00\r\n
			String[] stds = sb.toString().split("\n"); //학생별

			for(String ss:stds) {
				StringTokenizer st=new StringTokenizer(ss, "|"); //학생 데이터별
				Student s = new Student();
				s.setHakbun(Integer.parseInt(st.nextToken()));
				s.setName(st.nextToken());
				s.setKor(Integer.parseInt(st.nextToken()));
				s.setEng(Integer.parseInt(st.nextToken()));
				s.setMath(Integer.parseInt(st.nextToken()));
				int total = s.getKor()+s.getEng()+s.getMath();
				s.setTotal(total);
				s.setAvg(total/3.0);
				stdList.add(s);
				
			}
		} catch (Exception e) {
			e.printStackTrace(); //에러 위치 확인
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
				
			}
		}
		
	}
	public int menu() {
		System.out.println("========메뉴========");
		System.out.println("1. 학생 목록");
		System.out.println("2. 학생 등록");
		System.out.println("3. 학생 수정");
		System.out.println("4. 학생 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.println("===================");
		
		int no=0;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			//키보드 읽기 => 예외처리 => Scanner 대체
			System.out.print("메뉴 번호 입력:");
			String str = in.readLine();
			no=Integer.parseInt(str);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return no;
	}
	
	public void process() {
		while(true) {
			int no=menu();
			
			if(no==5) {
				System.out.println("프로그램 종료");
				FileWriter fw = null; //한글 저장시   FileOutputStream => FileWriter 편리
													
				try {
					fw = new FileWriter("c:\\java_datas\\school.txt");
					//자바프로그램과 파일 연결 => 스트림(출력 스트림)  2byte씩 전송한다(문자 스트림)
					String temp="";
					for(Student ss:stdList) {
						temp+=ss.getHakbun()+"|"+ss.getName()+"|"+ss.getKor()+"|"+ss.getEng()+"|"+ss.getMath()
						+"|"+ss.getTotal()+"|"+ss.getAvg()+"\n";
					}
					System.out.println(temp);
					fw.write(temp);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						fw.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				break;
			} else if(no==1) {
				for(Student ss:stdList) {
					System.out.println(ss.getHakbun() + " " 
									+ ss.getName() + " "
									+ ss.getKor() + " "
									+ ss.getEng() + " "
									+ ss.getMath() + " "
									+ ss.getTotal() + " "
									+ String.format("%.2f", ss.getAvg())
									);
				}
			} else if (no==2) {
				try {
					BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("이름 입력:");
					String name = in.readLine();
					System.out.print("국어 점수:");
					String kor = in.readLine();
					System.out.print("영어 점수:");
					String eng = in.readLine();
					System.out.print("수학 점수:");
					String math = in.readLine();
					//시퀀스 => 자동 증가 번호 만들기 => 구분자
					int max=0;
					for(Student ss:stdList) {
						if(ss.getHakbun()>max) {
							max=ss.getHakbun();
						}
					}
					Student s = new Student();
					s.setName(name);
					s.setHakbun(max+1);
					s.setKor(Integer.parseInt(kor));
					s.setEng(Integer.parseInt(eng));
					s.setMath(Integer.parseInt(math));
					int total = s.getKor()+s.getEng()+s.getMath();
					s.setTotal(total);
					s.setAvg(total/3.0);
					
					stdList.add(s);
					
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			} else if(no ==4) {
				try {
					BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("학번 입력:");
					String hak = in.readLine();
					for(Student ss:stdList) {
						if(ss.getHakbun() == Integer.parseInt(hak)) {
							stdList.remove(ss);
							break;
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		}
	}
}
