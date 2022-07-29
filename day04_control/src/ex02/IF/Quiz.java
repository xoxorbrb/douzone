package ex02.IF;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, max , max1, max2;
		
		System.out.printf("숫자 세 개를 입력하세요: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		
		max = (a>b && a>c)? a:(b > c && b > a)? b:(c > a && c > b)? c:0;  
		max1 = (a != max && (a > b || a > c))? a:(b != max && (b > a || b > c))? b:(c != max && (c > a || c > b))? c:0; 
		max2 = (a != max && a!= max1)? a:(b != max && b != max1)? b:c;
		
		System.out.println(max + " " + max1 + " " + max2);  //최종 결과
	}
}