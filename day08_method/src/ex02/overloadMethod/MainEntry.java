package ex02.overloadMethod;

public class MainEntry {
	public static int plus(int a, int b, int c) {
		int hap = a + b + c;
		return hap;
	}
	public static int plus(int a, int b, int c, int d) {
		int hap = a + b + c + d;
		return hap;
	}
	public static void add(double str1, double str2) {
		System.out.println(str1 + str2);
	}
	public static void add(String str1,String str2) {
		System.out.println(str1 + str2);
	}
	public static void add (int str1, int str2) {
		System.out.println(str1 + str2);
	}
	public static String name(String name) {
		return name;
	}
	
	public static String name(String name, int x) {
		String str = "";
		for(int i = 0; i < x; i++) {
			str += name +"\n";
		}
		return str;
	}
	
	public static void line(String str) {
		for(int i = 1; i < 11; i ++) System.out.print(str);
		System.out.println();
	}
	
	public static void main(String[] args) {
		add("kosa", "ll");
		System.out.println("Gildong");
		add(1,2);
		add(1,2.0);
		System.out.println(plus(3,5,7));
		System.out.println(plus(3,5,7,9));
		
		System.out.println(name("태규",10));
		line("---");

	}
}
