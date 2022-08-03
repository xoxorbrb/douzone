package quiz;
import java.util.Scanner;
public class Exam3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 (예 : 3 -> 1/2 + 2/3 = 1.17 ):  ");
		int a = sc.nextInt();
		sc.close();
		double X = 0;
		
		for(int i = 2; i < a+2; i ++) {
			if (i == a) {
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