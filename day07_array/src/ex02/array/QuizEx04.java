package ex02.array;
import java.util.Scanner;
public class QuizEx04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[3][4];
		
		for(int i = 0; i < a.length; i ++) {
			for(int j = 0; j < a[0].length; j++) {
				if(i == 2) {
					a[i][j] = a[i-2][j] + a[i-1][j]; 
				}
				else a[i][j] = sc.nextInt();
				
			}
		}
		for(int i = 0; i < a.length; i ++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.print("a["+ i +"]["+j+"] = " + a[i][j] + "\t");
			}System.out.println();
		}
	}
}
