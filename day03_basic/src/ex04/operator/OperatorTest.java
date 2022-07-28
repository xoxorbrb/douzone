/*
package ex04.operator;

public class OperatorTest {
	public static void main(String[] args) {
		//관계연산자: > , <, => , <=, ==, !=
		int x = 3, y = 4;
		
		if(x != y) {
			System.out.println("max x: " + x);
			System.out.println("not same");
		}
		else {
			System.out.println("max y: " + y);
			System.out.println("same");
		}
	}
}
//*/


/*/package ex04.operator;

public class OperatorTest {
	public static void main(String[] args) {
		
		int x = 3, y = 5;
		
		boolean flag = true;
		flag = x > y;
		
		System.out.println(flag);
		
		System.out.println();
	}
}
//*/

/*/package ex04.operator;

public class OperatorTest {
	public static void main(String[] args) {
		
		int x = 4, y = 7;
		System.out.println(x & y);
		System.out.println(x | y);
		System.out.println(x ^ y);
		System.out.println();
		System.out.println(4 & 7);
	}
}
//*/

/*/package ex04.operator;

public class OperatorTest {
	public static void main(String[] args) {
		//논리연산자: &&, ||, !, 10진 논리 ==> 결과: 참, 거짓
		int x = 10, y = 20, z = 30;
		boolean result = true;
		
		result = (x > y) && (y > z);
		System.out.println(result);
		
		result = (x < y) && (y > z);
		System.out.println(result);
		
		result = (x > y) || (y < z);
		System.out.println(result);
	}
}
//*/

/*/package ex04.operator;

public class OperatorTest {
	public static void main(String[] args) {
		//삼항(조건) 연산자: (조건)? 참:거짓;
		int x = 20, y = 10;
		String msg = null; // msg =="";
		
		msg = (x != y)? "not same" : "same";
		System.out.println(msg);
		
		int a = 10, b = 20, c = 30 , result;
		result = (a > b) ? a : (b > c) ? b : c;
		
		System.out.println(result);
	}
}
//*/

package ex04.operator;

public class OperatorTest {
	public static void main(String[] args) {
		//대입 연산자: =, +=, -=, >>=, <<=, /=, %=, *=, .....
		int x = 3, y = 5, result;
		
		result = x + y;
		System.out.println(result);
		
		x += y;
		System.out.println(x);
	}
}