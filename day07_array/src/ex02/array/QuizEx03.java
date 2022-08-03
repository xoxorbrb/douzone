package ex02.array;
import java.util.Scanner;
public class QuizEx03 {
	public static void main(String[] args) {
		int[][] a = new int[2][3];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j ++) {
				System.out.print("a[" +i + "]["+ j + "]" + ":  " );
				a[i][j] = new Scanner(System.in).nextInt();
			}
		}
		for(int i = 0; i < a.length; i ++) {
			for(int j = 0; j < a[i].length; j ++) {
				System.out.print("a[" +i + "]["+ j + "]" + ":  " + a[i][j] + "    \t");
			}
		}
	}
}