package ex04.Switch;

import java.util.Scanner;

public class NewSwitch {
	public static void main(String[] args) {
		System.out.println("원하는 달의 일수 확인 하기 : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		sc.close();
		int day = 0;
		// JDK14버전부터 가능
//		int day = switch(month) {
//			case 1, 3, 5, 7, 8, 10, 12 -> {
//				System.out.println("31 일까지 있습니다.");
//				yield 31;
//			}
//			case 4, 6, 9, 11 -> {
//				System.out.println("30 일까지 있습니다.");
//				yield 30;
//			}
//			case 2 -> {
//				System.out.println("28일까지 있습니다.");
//				yield 28;
//			}
//			default -> {
//				System.out.println("없는 달입니다. 1 ~ 12월까지만 입력해주세요. ");
//			}
//		};  
		
		
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31; break;
		
		case 2: day = 28; break;
		}
		
		System.out.println(month + " ==> " + day + "일까지 있습니다.");
	}

}
