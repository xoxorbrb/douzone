package ex01_array;
import java.util.Scanner;
public class QuizEx02 {
	public static void main(String[] args) {
		//문제 2] 8월 한달간의 강수량을 입력받아서 평균을 구하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[31]; 
		int sum = 0;
		double avg = 0;
		for(int i = 0; i <arr.length; i++) {
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}
		avg = sum / 31.0;
		System.out.println("평균: " + avg);
	}
}
