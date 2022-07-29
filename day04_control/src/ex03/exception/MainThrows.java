package ex03.exception;


/* try ~ catch : 직접처리 - 권장
 * throws : 위임
 * throw : 예외 던지기
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainThrows {
	public static void main(String[] args) 
			throws ArithmeticException , InputMismatchException{
		System.out.println("x, y = ");
		
		Scanner sc = new Scanner(System.in);
		int x, y, result = 0;
		x = sc.nextInt();
		y = sc.nextInt();
		
		result  = x / y;  // 예외발생 
		sc.close();
		
		//result  = x / y;  // y == 0 일 때 오류가 남
		
		System.out.println(x +" / " + y + " = " + result);
	}
}

