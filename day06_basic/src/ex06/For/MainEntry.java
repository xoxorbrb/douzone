package ex06.For;

public class MainEntry {
	public static void main(String[]  args) {
		
//		for(int i = 0; i < 2; i ++) {
//			for (int j = 1; j < 4; j ++) {
//				System.out.print(j + "\t");
//			}// j end
//			System.out.println();
//		} // i end
		
		// 구구단 전체 출력 하는 프로그램 작성
		for (int i = 1; i < 10; i ++) {     //row  - 행
			for(int j = 2; j < 10; j ++) { // col - 열
				//System.out.print(j + " * " + i + " = " + j * i + "\t");
				System.out.printf("%d * %d = %2d\t \t", j, i, j*i);
			} // j end
			System.out.println();
		} // i end
	}
}
