package ex04.Switch;

import java.util.Scanner;

public class MainSwitch {
	public static void main(String[] args) {
		System.out.println("도시를 선택하세요: (s, d, b, j)");
		Scanner sc = new Scanner(System.in);
		String city = sc.next();
		
		sc.close();
		
		switch(city) {
		case "s": System.out.print("서울"); break;
		case "d": System.out.print("대구"); break;
		case "b": System.out.print("부산"); break;
		case "j" : System.out.print("제주"); break;
			default:
				System.out.println("잘못 선택하셨습니다. s, d, b, j 중에서만 선택하세요......");
				System.exit(0);
		}
		
		System.out.println("를(을) 선택하셨습니다.");
	}
}
