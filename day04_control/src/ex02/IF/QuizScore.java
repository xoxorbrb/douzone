package ex02.IF;

import java.util.Scanner;

public class QuizScore {
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
		
		System.out.print("**** "+name + "님의 성적표 ****\n국어: " + kor +" 영어: "+ eng + "  전산: " + com + "\n총점: "+ total);
		System.out.printf( "  평균: %d   학점: %s", avg, grade);
		
	}
}
