package quiz;
import java.util.Scanner;
public class QuizEx5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		//String agree =  "";
		String[][] a = new String[7][7];
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
		double avg = total/3.0;
		
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
		System.out.printf( "  평균: %.2f   학점: %s", avg, grade);

			
				a[i][0] = name;
				a[i][1] = Integer.toString(kor);
				a[i][2] = Integer.toString(eng);
				a[i][3] = Integer.toString(com);
				a[i][4] = Integer.toString(total);
				a[i][5] = Double.toString(Math.round(avg*100)/100.0);
				a[i][6] = grade;
		
				i++;
				System.out.println("\n\n");
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
		//System.out.print("\n\n계속 하시겠으면 'y' or 'Y'를 눌려주세요");
//		agree = sc.next().charAt(0);
//		}while(agree == 'y' || agree == 'Y');
		}//while(agree.equalsIgnoreCase("y"));
		//while (agree.toUpperCase().equals("Y"));
		while(i < 7);
		//System.out.println("종료");
		
		sc.close();
		
		System.out.println("이름 \t\t국어\t\t영어\t\t전산\t\t총점\t\t평균\t\t등급");
		
		for(int x = 0; x< a.length; x ++) {
			for(int z = 0; z < a[0].length; z++) {
				System.out.print(a[x][z]+ "\t\t");
			}System.out.println();
		}
		
		}
}
