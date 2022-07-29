package ex04.Switch;

import java.util.Scanner;

public class ScoreSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name = sc.next();
	
		
		System.out.print("국어 점수: ");
		int kor = sc.nextInt();
		System.out.print("영어 점수: ");
		int eng = sc.nextInt();
		System.out.print("전산 점수: ");
		int com = sc.nextInt();
		sc.close();
		
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
		
		switch(grade) {
		case "A":
			System.out.println("학점은 A입니다.");
			break;
		case "B":
			System.out.println("학점은 B입니다.");
			break;
		case "C":
			System.out.println("학점은 C입니다.");
			break;
		case "D":
			System.out.println("학점은 D입니다.");
			break;
		default:
			System.out.println("학점은 F입니다.");
			break;
		}
		
		System.out.print("**** "+name + "님의 성적표 ****\n국어: " + kor +" 영어: "+ eng + "  전산: " + com + "\n총점: "+ total);
		System.out.printf( "  평균: %d   학점: %s", avg, grade);
		
	}
}
