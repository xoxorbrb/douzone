package ex02.randomMethod;

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println();
		
		// random() :  난수 발생 0.0 ~ 1.0
		System.out.println(Math.random());
		
		System.out.println(Math.random() * 5); // 0 ~ 4;
		
		System.out.println(Math.random() * 5 + 1); // 1~ 5;
		
		System.out.println();
		
		for(int i = 1; i  <=  6; i ++) {
			System.out.println((int)(Math.random()* 45)+1);
		}
	}
}