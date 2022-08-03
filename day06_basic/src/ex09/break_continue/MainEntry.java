package ex09.break_continue;
import java.util.Scanner;
public class MainEntry {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int su;
//		System.out.println("jumsu(0 ~ 100 사이 점수만 입력) = ");
//		while(true) {
//		do {
//		System.out.println("jumsu(0 ~ 100 사이 점수만 입력) = ");
//		su = sc.nextInt();
//		System.out.println(su);
//		} while ( su >= 0 && su <= 100);
//		
//		System.out.println("점수를 더 입력받으시겠습니까? ");
//		char yesno = sc.next().charAt(0);
//		if( yesno == 'n' || yesno == 'N') break;
//		}
//		sc.close();
//		System.out.println("0 ~ 100 이 아닙니다.");
		
		for(int i=1; i < 11; i ++) {
			if(i == 7) break;
			System.out.println(i);
		}
		
		System.out.println("=================");
		
		for(int i = 1; i < 11; i ++) {
			if( i == 7) continue;
			System.out.println(i);
		}
		
		System.out.println("=================");
		
		for(int i = 1; i < 101; i ++) {
			if(i%2 != 0) continue;
			System.out.println(i);
		}
	}
}
