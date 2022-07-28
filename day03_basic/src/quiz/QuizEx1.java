package quiz;

public class QuizEx1 {
	public static void main(String[] args) {
		
		int pay = 567890;
		
		//만원 56장 천원 7장 백원 8개 10원 9개
		
//		System.out.println("만원: " + pay/10000 + "장");
//		pay = pay - pay/10000 * 10000;
//		
//		System.out.println("천원: " + pay/1000 + "장");
//		pay = pay - pay/1000 * 1000;
//		
//		System.out.println("백원: " + pay/100 + "개");
//		pay = pay - pay/100 * 100;
//		
//		System.out.println("십원: " + pay/10 + "개");
		
		System.out.println("만원: " + pay/10000);
		System.out.println("천원: " + pay/1000%10);
		System.out.println("백원: " + pay/100%10);
		System.out.println("십원: " + pay/10%10);
	}
}
