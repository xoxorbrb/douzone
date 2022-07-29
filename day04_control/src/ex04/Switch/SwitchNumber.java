package ex04.Switch;
import java.util.Scanner;

public class SwitchNumber {
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요: ");
		int a = new Scanner(System.in).nextInt();
		new Scanner(System.in).close();
		a %= 2;
		
		switch(a) {
		case 0: System.out.println("짝수입니다."); break;
		case 1: System.out.println("홀수입니다."); break;
		default:
			System.out.println("잘못입력하였습니다.");  break;
		}
	}
}
