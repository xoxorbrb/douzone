package quiz;

import java.util.Scanner;

public class Score {
	
	static int kor = 0, eng = 0, com = 0; 
	static String name = "";
	public static void input() {  // 입력함수
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력하세요: ");
		name = sc.next();
		System.out.print("국어 점수를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.print("전산 점수를 입력하세요 : ");
		com = sc.nextInt();
	}
	public static int total(int kor, int eng, int com) { // 총점 함수
		return kor + eng + com;
	}
	public static double average(int total) {    // 평균 구하는 함수
		return total/3.0;
	}
	public static String grade(double avg) {
		String grade;
		switch((int)avg/10){
		case 10:
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		default: grade = "F"; break;
		}
		return grade;
	}

	public static void output(String name, int kor, int eng, int com, int total, double avg, String grade) {
		System.out.println(name + "님의 점수 =============");
		System.out.print("국어: " +  kor + "\t영어: " + eng + "\t전산: " + com);
		System.out.print("\n총점: " + total + "\t평균: " + Math.round(avg*100)/100.0 + "\t학점: " + grade + "\n");
		System.out.println("==========================");
	}
	
	public static void main(String[] args) {
		String grade;
		int total;
		double avg;
		System.out.print("인원 수: ");
		int p = new Scanner(System.in).nextInt();
		
		for(int i = 0;  i < p;  i ++) {
			input();
			total = total(kor,eng,com);
			avg = average(total);
			grade = grade(avg);
			output(name, kor, eng, com, total, avg, grade);
		}
	}
}
