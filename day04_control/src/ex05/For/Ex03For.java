package ex05.For;

public class Ex03For {
	public static void main(String[] args) {
		
		int sum, count ;
		sum = count = 0;
		
		for(int i = 0; i< 100; i++) {
			if( i % 20 == 0) System.out.println();
			if( i % 2 != 0) System.out.print((i + 1) + "\t");
		} // for end
		
		// 1 ~ 100까지 중에서 7의 배수의 합과 개수를 구하는 프로그램
		
		for(int i = 1; i< 101; i++) {
			if(i % 7 == 0) {
				sum += i; // sum = sum + i;
				count ++; // count = count + 1; count += 1;
			}
		}
		
		System.out.println("\n\n7의 배수의 합: " + sum + "\n7의 배수 개수: " + count);
	}
}
