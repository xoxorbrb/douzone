package ex04.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("당신의 포인트 점수는? (1~3점) input : ");
		
		
		Scanner sc = new Scanner(System.in);
		
		//int point = sc.nextInt();
		double point = sc.nextDouble();
		
		
		sc.close();
		
		switch ((int)point) {  //정수형, 문자형만 들어올 수 있음, 실수형 x
			case 1:  //숫자, '문자', '문자열'
				System.out.println("포인트 점수 1점입니다.");
				//break;
			case 2:
				System.out.println("포인트 점수 2점입니다.");
				//break;
			case 3:
				System.out.println("포인트 점수 3점입니다.");
				//break;
				
			default:
				System.out.println("없는 점수 입니다. 1~3까지만 입력 요망.");
				break;
		}
	}
}
