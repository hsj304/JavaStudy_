import java.util.Scanner;

/*
 *  3명의 학생 국어, 영어, 수학 => 총점, 평균, 학점, 등수
 */
public class 배열_3 {
	public static void main(String[] args) {
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		
		int[] total = new int[3];
		double[] avg = new double[3];
		char[] score = new char[3];
		int[] rank = new int[3];
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<kor.length;i++) {
			System.out.print((i+1) + "번째 국어점수 입력:");
			kor[i] = scanner.nextInt();
			
			System.out.print((i+1) + "번째 영어점수 입력:");
			eng[i] = scanner.nextInt();
			
			System.out.print((i+1) + "번째 수학점수 입력:");
			math[i] = scanner.nextInt();
			
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3.0;
		}
		
		for(int i=0;i<kor.length;i++) {
			switch((int)avg[i]/10) {
			case 10: case 9:
				score[i]='A';
				break;
			case 8:
				score[i]='B';
				break;
			case 7:
				score[i]='C';
				break;
			case 6:
				score[i]='D';
				break;
			default:
				score[i] = 'F';
			}
		}
		
		for(int i=0;i<rank.length;i++) {
			rank[i]=1;
			for(int j=0;j<rank.length;j++) {
				if(total[i] <total[j]) {
					rank[i]++;
				}
			}
		}
		
		System.out.println("================== 성적표 ==================");
		System.out.printf("%-4s%-4s%-4s%-6s%-6s%-3s%-4s\n", "국어", "영어", "수학", "총점", "평균", "학점", "등수");
		for(int i=0;i<kor.length;i++) {
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c%-5d\n", kor[i], eng[i], math[i], total[i], avg[i], score[i], rank[i]);
		}
	}
}
