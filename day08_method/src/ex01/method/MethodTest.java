package ex01.method;

public class MethodTest {

	// 3) 매개변수 없고, 리턴 타입 있는 경우
	// public returnType methodName() { return value;}
	// return 값  -> 오직 하나              ex) int x = 3, int y = 5; return x+y;    //  return x , y; <= error
	
	public static String show() {
		return "Hello String method !";
	}
	
	public static int iShow() {
		int su = 300;
		return su + 1011;
	}
	// 4) 매개변수 있고, 리턴타입 있는 경우
	// public returnType methodName(parameter var1 , ...) { return value;}
	
	public static int plus(int x, int y) {
		int hap =  x+ y;
		return hap;  // x+y;
	}
	
	public static double add(int x, int y) {
		return x+y;  // x+y;
	}
	
	
	public static void main(String[] args) {
		System.out.println(iShow());
		
		int num = iShow();
		String str = show();
		System.out.println(num);
		
		System.out.println("---------------------");
		System.out.println(str);
		
		int sum = plus(7,3);
		System.out.println(sum);
		
		System.out.println(add(7,3));
	}
}