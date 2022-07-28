package ex02.dataType;

public class MainEntry {
	public static void main(String[] args) {
		char ch = 'A'; //ASCII
		
		System.out.println(ch +" ASCII code: " + (int)ch);
		
		System.out.println('B');
		System.out.println((int)'b');
		
		System.out.println("----------------------------------------------");
		
		int num = 10;
		int xNum = 0x10; // 0x숫자 : 16진수
		int oNum = 010; // 0숫자 : 8진수
		int bNum = 0b1010; // 0b숫자 : 2진수
		
		System.out.println("2진수: " + bNum);
		
		System.out.println(num);
		System.out.println(xNum);
		System.out.println(oNum);
		
		System.out.println("----------------------------------------------");
		System.out.printf("\n%d %d =", 0xa, 0xA);
		System.out.printf("\n%d = ", 012);
		System.out.printf("\n%d = ",0b1010);	

		System.out.println("----------------------------------------------");
		System.out.printf("\n%x %X =", 10, 10);
		System.out.printf("\n%o = ", 10);
//		System.out.printf("\n%b = ",0b1010);	
		
	}
}
