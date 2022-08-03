package ex01_array;

public class ForeachTest {
	public static void main(String[] args) {
		int sum = 0, num;
		for( num = 1;  ; num ++) {
			sum += num;
			if(sum >= 100) break;
		}
		System.out.println("sum " +sum);
		System.out.println("num " + num);
		
		System.out.println("=======================");
		
		for(num = 1; num <= 100; num ++) {
			if ((num % 3)!=0) continue;
			System.out.println("num: "+ num);
		}
		
		
	}
}
