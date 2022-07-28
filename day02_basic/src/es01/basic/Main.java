package es01.basic;

import java.util.Scanner;
	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("첫 번째 수: ");
	        int A = sc.nextInt();
	        System.out.print("두 번째 수: ");
	        int B = sc.nextInt();
	        sc.close();
	        System.out.printf("더하기: %d", A+B);
	        System.out.printf("\n빼기: %d", A-B);
	        System.out.printf("\n곱하기: %d", A*B);
	        System.out.printf("\n나누기: %d", A/B);
	        System.out.printf("\n나머지: %d",A%B);
	}
}