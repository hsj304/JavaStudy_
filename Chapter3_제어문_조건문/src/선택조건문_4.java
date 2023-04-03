
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
//BBdC1rl5sKY
public class 선택조건문_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("검색어 입력:");
		String fd = scan.next();
		
		try {
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title = doc.select("tr.list a.title");
			Elements singer = doc.select("tr.list a.artist");

			for(int i=0;i<title.size();i++) {
				String s = title.get(i).text();
				if(s.contains(fd)) {
					System.out.println(title.get(i).text() + singer.get(i).text());
				}
			}
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "
										+ "http://youtube.com/embed/BBdC1rl5sKY");
		} catch(Exception ex) {}
	}
}
