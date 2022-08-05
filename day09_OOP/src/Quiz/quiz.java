package Quiz;

import java.util.Scanner;

public class quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  a = 0;
		int rand = (int)(Math.random()*100 + 1);
		boolean A = true;
		
		for (int i = 0; i < 5; i ++) {
			System.out.print("숫자를 입력하세요: ");
			a = sc.nextInt();
			System.out.println();
			
			if(a == rand) { 
				System.out.println("정답입니다"); 
				A = true;
				break; 
				}
			else if ( a > rand) { 
				System.out.println(a + "보다 작습니다."); 
				A = false;
				continue; 
				}
			else if (a < rand) {
				System.out.println(a + "보다 큽니다.");
				A = false;
				continue;
			}
			else System.out.println("잘못 입력하였습니다.");
			
			
		}
		if(A != true) System.out.println("실패입니다. 정답은 " + rand  + "입니다.");
	}
}
