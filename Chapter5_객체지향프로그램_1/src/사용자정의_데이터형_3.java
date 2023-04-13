/*
 * 1. 같은 자바파일에 클래스를 여러개 만들 수 있다
 * 	  -----------------
 * 	  public은 한개의 클래스에서만 사용이 가능
 * 2. 권장 사항 => 파일을 따로 만든다
 */
class Category{
	String poster;
	String title;
	String subject;
}

class FoodHouse{
	int no; //중복이 안된 숫자 => primary key => 상세보기
	int cno;//참조키 => foreign key
	String[] poster = new String[5];
	double score;
	
	String title;
	String address1, address2;
	String tel;
	String type;
	String price;
	String parking;
	String stime,etime;
	String lastOrder;
	String hol;
	String menu;
	
}

 class 사용자정의_데이터형_3 {
	public static void main(String[] args) {
		
	}
}
