/*package ex03.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("x, y = ");
		
		Scanner sc = new Scanner(System.in);
		int x, y, result = 0;
		x = sc.nextInt();
		
		y = sc.nextInt();
		if(y == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		} else result = x/y;
		
		sc.close();
		
		//result  = x / y;  // y == 0 일 때 오류가 남
		
		System.out.println("\n\n result = " + result);
	}
}
//*/


package ex03.exception;

import java.util.MissingResourceException;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("x, y = ");
		
		Scanner sc = new Scanner(System.in);
		int x, y, result = 0;
		
		
		try {
			x = sc.nextInt();
			y = sc.nextInt();
			result = x / y; // 문제 발생 소지가 있는 코드
			
			System.out.println("\n\n result = " + result);
			
		}catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} 
		catch (MissingResourceException e) {
			System.out.println("MissingResourceException");
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
		sc.close();
	}
}
