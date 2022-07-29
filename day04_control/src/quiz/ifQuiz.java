package quiz;

// 윤년/평년 판정 프로그램 작성
/*
 *  4의배수 이면서 100의 배수가 아닐 때
 *  400의 배수 일 때
 */
import java.util.Scanner;

public class ifQuiz {
	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.println("연도 입력해주세요: ");
		        int A = sc.nextInt();
		        sc.close();
		 
		        if(A % 4 == 0 && A % 100 != 0 || A % 400 == 0) {
		             System.out.println("윤년입니다.");
		            }
		       else {
		             System.out.println("윤년이 아닙니다");
		            
		       }
		}
}