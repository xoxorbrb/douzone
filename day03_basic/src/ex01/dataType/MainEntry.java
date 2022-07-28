package ex01.dataType;

public class MainEntry {
	
	static int su3; // int: 0, double: 0.0, String: null
	                // 정수형    실수형         문자열
	static String str2;
	static double dd;
	
	public static void main(String[] args) {
		int su = 9;
		char ch = 'A';
		String str = "korea";
		double d = 12.34;
		System.out.println(su3);
		System.out.println(str2);
		System.out.println(dd);
		System.out.println(su); // 4byte
		System.out.println(ch); // 2byte
		System.out.println(str);
		System.out.println(d); // 8byte
		
		System.out.println();
		System.out.println(su + ", " + ch + ", " + str + ", " + d);
		
		System.out.println(100); // 4byte
		System.out.println(2.1512); // 8byte
		
		System.out.println(100L); //long 8byte
		System.out.println(3.4F); //float 4byte
		
		System.out.println("--------------------------------------");
		float f = 12.34f;    // float f = 12.34 error) double이 아니기때문에
		System.out.println(f);
		
		System.out.println("--------------------------------------");
//		int su2; //지역변수는 반드시 초기화 하고 사용한다.
//		System.out.println(su2); error
		
		int x = 2;     //기본 자료형
		Integer y = 2; //참조형
		x = y;
		
		// String str3 = 'A';  error
		String str3 = "A";
		
		// char ch2 = "A";     error
		char ch2 = 'A';
		
		System.out.println("hello java");;
	}
	
}
