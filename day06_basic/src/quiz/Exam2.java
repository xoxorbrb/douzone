package quiz;
import java.util.Scanner;
public class Exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력해주세요: ");
		int a = sc.nextInt();
		sc.close();
		int result = 0;
		for(int i = 1; i < a+1; i ++) {
			if(i%2 ==1) {
				System.out.print( " - " +i);
				result -= i;
			}
			else System.out.print(" + " + i);
			result +=i;
		}
		System.out.print(" = " +  result);
	}
}
