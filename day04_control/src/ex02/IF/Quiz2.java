package ex02.IF;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, result;
		String operator = "";
		try {
		for(int i=0; i<5; i++) {
			
			System.out.printf("숫자 두 개와 연산자를 입력하세요: ");  // 숫자 두 개 입력 , 연산자 입력
			a = sc.nextInt();
			b = sc.nextInt();
			operator = sc.next();
		    
		    switch(operator) {
				case "+":
					result = a + b;
					break;
				case "-":
					result = a - b;
					break;
				case "*":
					result = a * b;
					break;
				case "/":
					result = a / b;
					break;
				case "%":
					result = a % b;
					break;
				default :
					result = 0;
					break;
		    	}
		    
			System.out.println(a + " " + operator + " " + b + " = " + result);
			a = 0;
			b = 0;
			operator = " ";
	} 
		}
		catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}
}
