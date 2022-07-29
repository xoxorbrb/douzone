package ex02.IF;

import java.util.Scanner;

public class cerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com, eng, kor;
		System.out.println("전산, 영어, 국어 점수를 차례대로 입력하여주세요: ");
		com = sc.nextInt();
		eng = sc.nextInt();
		kor = sc.nextInt();
		
		sc.close();
		double avg = (com + kor + eng)/3.0;
//	    String pass = avg >= 60 && (com >= 40 && kor >= 40 && eng >= 40)? "합격":"불합격";
		String pass = "";
		if ( avg >= 60) {
			if(com >= 40 && kor >= 40 && eng >= 40) {
				pass = "합격";
			}
			else {
				if(com < 40) {
					System.out.println("전산 과락");
				}
				else if (kor < 40) {
					System.out.println("국어 과락");
				}
				else System.out.println("영어 과락");
				pass = "불합격";
			}
		}
		else pass = "불합격";
		
		System.out.println(pass + "입니다.");
	}
}
