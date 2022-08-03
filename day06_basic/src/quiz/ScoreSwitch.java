package quiz;

import java.util.Scanner;

public class ScoreSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String agree =  "";
		
		do {
		System.out.print("이름 입력: ");
		String name = sc.next();
		//원하는 만큼 
		//점수 : 0 ~ 100 점까지만 입력 받게 처리
		int kor;
		int eng;
		int com;
		while(true) {
			System.out.println("0 ~ 100점까지만 입력해주세요");
			System.out.print("국어 점수: ");
			kor = sc.nextInt();
			System.out.print("영어 점수: ");
			eng = sc.nextInt();
			System.out.print("전산 점수: ");
			com = sc.nextInt();
		
			if (kor >= 0 && kor <= 100 && eng >= 0 && eng <=100 && com >= 0 && com <= 100) break;
			System.out.println("다시입력합니다.");
		}
		int total = kor + eng + com;
		int avg = total/3;
		
		String grade = null;
		
		if(avg >= 90 && avg <= 100) {
			grade = "A";
			
		}else if (avg >= 80) {
			grade = "B";
		}else if (avg >= 70) {
			grade = "C";
		}else if (avg >= 60) {
			grade = "D";
		}else grade = "F";
		
		System.out.print("**** "+name + "님의 성적표 ****\n국어: " + kor +" 영어: "+ eng + "  전산: " + com + "\n총점: "+ total);
		System.out.printf( "  평균: %d   학점: %s", avg, grade);
		
//		switch(grade) {
//		case "A":
//			System.out.println("학점은 A입니다.");
//			break;
//		case "B":
//			System.out.println("학점은 B입니다.");
//			break;
//		case "C":
//			System.out.println("학점은 C입니다.");
//			break;
//		case "D":
//			System.out.println("학점은 D입니다.");
//			break;
//		default:
//			System.out.println("학점은 F입니다.");
//			break;
//		}
		System.out.print("\n\n계속 하시겠으면 'y' or 'Y'를 눌려주세요");
//		agree = sc.next().charAt(0);
//		}while(agree == 'y' || agree == 'Y');
		agree = sc.next();
		}//while(agree.equalsIgnoreCase("y"));
		while (agree.toUpperCase().equals("Y"));
		System.out.println("종료");
		
		sc.close();
	}
}
