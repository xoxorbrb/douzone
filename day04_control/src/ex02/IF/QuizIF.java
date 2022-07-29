package ex02.IF;

import java.util.Scanner;

public class QuizIF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 두 개를 입력해주세요: ");
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
//		if (a > b) {
//			System.out.println(a);
//		}
//		else if (a == b) {
//			System.out.println(a + " == " + b );
//		}
//		else
//		{
//			System.out.println(b);
//		}
//	}
		int result = (a > b)? a:b;
		System.out.println(result);
	}
}
