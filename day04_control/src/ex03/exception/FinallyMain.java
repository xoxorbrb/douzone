package ex03.exception;

import java.util.InputMismatchException;
import java.util.MissingResourceException;
import java.util.Scanner;

public class FinallyMain {
	public static void main(String[] args) {
		System.out.println("x, y = ");
		
		Scanner sc = new Scanner(System.in);
		int x, y, result = 0;
		
		
		try {
			x = sc.nextInt();
			y = sc.nextInt();
			result = x / y; // 문제 발생 소지가 있는 코드
			
			System.out.println("\n\n result = " + result);
			
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} 
		catch (MissingResourceException e) {
			System.out.println("MissingResourceException");
		}
		catch (InputMismatchException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally 무조건 처리됨 !!");
		}
		sc.close();
	}
}
