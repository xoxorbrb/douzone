package ex05.For;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
//		for(int i = 10; i >= 1; i --) {
//			System.out.println(i + "\t");
//		}
//		
//		System.out.println();
//		//문제) "*" 5개를 출력하는 프로그램 작성
//		
//		for(int i=0; i<5; i++) {
//			System.out.println("*");
//		}
//	}
		
		//구구단 프로그램
		
//		Scanner sc = new Scanner(System.in);
		
//		int a = sc.nextInt();
//		
//		sc.close();
//		
//		for(int i = 1; i < 10; i ++) {
//			System.out.println(a + " * " + i + " = " +  a* i);
//		}
//		
//		
		
		//문제 3] 1~100 까지 중에서 3의 배수의 개수와 합을 구하는 프로그램 작성
		
		int a = 0;
		int count = 0;
		for(int i = 1; i < 101; i++) {
			if(i % 3 == 0) {
				count ++;
				a += i;
			}
		}
		System.out.println(a + " " + count);
	}
}
