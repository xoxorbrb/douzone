package ex04.operator;

public class MainEntry {
	public static void main(String[] args) {
		// shift 연산자 : >>, <<, >>>
		int x = 8, result;
		
		result = x << 2 ; // left shift : 원래 값 * 2 ^ bit 수
		
		System.out.println("left shift result: " + result);
		
		result = x >> 2;  // right shift : 원래 값 / 2 ^ bit 수
		System.out.println("right shift result: " + result );
	}
}