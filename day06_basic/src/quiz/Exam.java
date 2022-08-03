package quiz;
import java.util.Scanner;
public class Exam {
	public static void main(String[] args) {
		//과제 1
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력해주세요: ");
		int a = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i < a+1; i ++) {
			
			for(int j = 1; j < i+1; j ++) {
				System.out.print(j);
				if(!(j < a))break;
				System.out.print(" + ");
			}
			sum += i*(a+1-i);
			
			
		}
		System.out.print(" = " + sum);
		System.out.println("===========================");
		
		//과제 2
		System.out.print("\n\n수를 입력해주세요: ");
		int b = sc.nextInt();
		int result = 0;
		for(int i = 1; i < b+1; i ++) {
			if(i%2 ==1) {
				System.out.print( " - " +i);
				result -= i;
			}
			else System.out.print(" + " + i);
			result +=i;
		}
		System.out.print(" = " +  result);
		
		
		//과제 3
		System.out.print("\n\n숫자를 입력해주세요 (예 : 3 -> 1/2 + 2/3 = 1.17 ):  ");
		int c = sc.nextInt();
		sc.close();
		double X = 0;
		
		for(int i = 2; i < c+2; i ++) {
			if (i == c) {
				System.out.print(i - 1 + " / " + i + " = ");
				X += (double)(i-1)/i;
				break;
			}
			System.out.print(i-1 +" / " + i + " + ");
			X += (double)(i-1)/i;
		}
		System.out.printf("값: %.2f" , X);
		
	}
}
