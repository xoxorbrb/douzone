package ex07.While;
import java.util.Scanner;
public class GuGuMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int dan = sc.nextInt();
		sc.close();
		int i = 1;
		while(i < 10) {
			System.out.println(dan + " * " + i + " = " + dan*i);
			i++;
		}
		
		int a = 0, b = 0; // 변수 초기화
		
		do {
			
			do {
			    a++; // 증감식
				System.out.print(a + "\t");
				
			}while(a < 3);
			System.out.println();
			b++;
			a = 0;  //다중 while, do-while문인 경우 안쪽 변수의 초기화
		}while(b < 2);
		
		
		
		System.out.println("============================");
		
		int x = 1, y = 1;
		
		do {
			y = 2;
			do {
				System.out.println(x + " * " + y +" = " + x*y);
				y++;
			}while(y <= 9);
			System.out.println();
			x++;
		}while(x < 10);
	}
}
