package ex07.While;

public class MainEntry {
	public static void main(String[] args) {
		
		for(int i = 1; i < 11; i ++) {
			System.out.println(i);
		}
		System.out.println("while =============");
		// 선 조건 후 처리
		int i = 10;  // while은 변수의 초기화가 무조건 있어야함
		while( i >= 1) {   //조건
			System.out.println(i);
			i --; //증감식
		}
		
		System.out.println("do-while ===========");
		//  선처리 후 비교
		
		i = 1;
		
		do {
			System.out.println(i);
			i ++;
		}while(i <= 10);
	}
}
