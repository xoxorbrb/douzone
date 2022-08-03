package ex01_array;
import java.util.Scanner;
public class ArrayEx2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int result= 0;
		for(int i= 0; i < arr.length; i ++) {
			result += arr[i];
			
		}
		System.out.println("합: " + result);
		
		
		Scanner scan = new Scanner(System.in);
		int[] arr2 =  new int[5];
		int sum = 0;
		
		for (int i =0; i < arr2.length; i ++) {
			arr2[i] = scan.nextInt();
			sum += arr2[i];
		}
		scan.close();
		System.out.println("합: " + sum);
	}
	
	
}

