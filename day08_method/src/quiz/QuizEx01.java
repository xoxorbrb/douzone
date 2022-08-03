package quiz;

import java.util.Scanner;

public class QuizEx01 {
	
	public static void info() {
		System.out.println("name, phone, address = ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String phone = sc.next();
		String address = sc.next();
		System.out.println("이름: " + name );
		System.out.println("연락처: " + phone);
		System.out.println("주소: " + address);
		sc.close();
	}
	
	public static void abs(int x) {
		if ( x < 0) x = -x;
		System.out.println(x);
	}
	
	public static void max(int a, int b) {
		
		if(a > b) System.out.println(a);
		else System.out.println(b);
	}
	public static void add(int x, int y) {
		System.out.println("add: " + (x + y));
	}
	public static int sub(int x, int y) {
		
		if(x < y) return y-x;
		else return x - y;
	}
	public static int mul(int x, int y) {
		return x * y;
	}
	public static void div(int x, int y) {
		double result;
		try {
		 	  result  = (double)x/y;
		 	  System.out.println("나누기: "+ result);
		}catch(Exception e) {
			  System.out.println("오류발생");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하세요: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		info();
		System.out.println("===============");
		abs(x);
		System.out.println("===============");
		max(x,y);
		System.out.println("===============");
		add(x,y);
		System.out.print("빼기 : " + sub(x,y) + "\n");
		System.out.print("곱하기 : " + mul(x,y) + "\n");
		div(x,y);
		
		sc.close();
	}
}
