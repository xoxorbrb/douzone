package ex04.Switch;

import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[] args) {
		System.out.println("당신의 포인트 점수는? (1~3점) input : ");
		
		
		Scanner sc = new Scanner(System.in);
		
		//int point = sc.nextInt();
		int point = sc.nextInt();
		
		
		sc.close();
		
		switch (point) {  //정수형, 문자형만 들어올 수 있음, 실수형 x
			case 1:  //숫자, '문자', '문자열'
				System.out.println("집");
				//break;
			case 2:
				System.out.println("피아노");
				//break;
			case 3:
				System.out.println("우산");
				//break;
				
		}
		System.out.println("상품에 당첨 되셨습니다. ");
	}
}




/*package ex04.Switch;

import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[] args) {
		System.out.println("도시를 선택하세요: (s, d, b, j)");
		Scanner sc = new Scanner(System.in);
		String city = sc.next();
		
		sc.close();
		
		switch(city) {
		case "s": System.out.print("서울"); //break;
		case "d": System.out.print("대구"); //break;
		case "b": System.out.print("부산"); //break;
		case "j" : System.out.print("제주"); //break;
			default:
				System.out.println("잘못 선택하셨습니다. s, d, b, j 중에서만 선택하세요......");
				System.exit(0);
		}
		
		System.out.println("를(을) 선택하셨습니다.");
	}
}
//*/