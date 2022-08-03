package ex03.argumentVariable;

public class MainEntry {
	//매개변수 가변길이함수
	//public static int plus (int a, int b, ... int n)
	
	public static void plus(int ... x) {
		int sum = 0;
		for(int i = 0;  i< x.length; i ++) {
			sum += x[i];
		}
		System.out.println(sum);
	}
	public static void plus(String ... x) {
		String sum = null;
		for(int i = 0;  i< x.length; i ++) {
			sum += x[i];
		}
		System.out.println(sum);
	}
	
//	public static int plus(int a, int b, int c) {
//		int hap = a + b + c;
//		return hap;
//	}
//	public static int plus(int a, int b, int c, int d) {
//		int hap = a + b + c + d;
//		return hap;
//	}
	
	public static void main(String[] args) {
		
		
		// int 매개변수
		plus(1,2,3,4,5,6,7,8,9,10);
		plus(1,2,3);
		plus(1,2,3,4);
		
		// String 매개변수
		plus("hh", "asd", "qweqwe", "asdsadq1");
		plus("123asd123123asd");
		plus("asdasdsad1w","12","2");
	}
}
