package ex01.scanner;

import java.util.Scanner; //

public class MainEntry { //extends Object 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 객체 생성, 메모리에 할당, 생성자함수 자동 호출
		int x = 9;
		
		System.out.print("입력:");
		int y = sc.nextInt();
		System.out.println();
	}
}
