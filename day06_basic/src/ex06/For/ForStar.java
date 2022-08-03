package ex06.For;

public class ForStar {
	public static void main(String[] args) {
		//삼각형
		for (int i = 1; i <= 5; i ++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}//j end
			
			System.out.println();
		}//i end
		
		System.out.println("====================");
		
		// 정사각형
		for (int i = 1; i <= 5; i ++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}//j end
			
			System.out.println();
		}//i end
		
		System.out.println("====================");
		
		//역삼각형
		for (int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j ++) {
				System.out.print("*");
			} // j end
			System.out.println();
		} // i end
		
		System.out.println("====================");
		
		//공백 삼각형
		for (int i = 1; i <= 5; i++) {
			for(int z = 5; z > i; z--) {
				System.out.print("  ");  // 공백 for문
			}
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");  // 출력 for문
			}
			
			System.out.println();       // 개행 for문
		}
		
		System.out.println("===================");
		
		//정삼각형
		
		for (int i = 1; i <= 5; i ++) {
			for(int z = 5; z > i; z --) {
				System.out.print("  ");
			} // z end
			for(int j =0; j < 2*i-1; j++) {
				System.out.print("*");
			} // j end
			System.out.println();
		}	  // i end
	}
}
