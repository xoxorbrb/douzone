package ex03.operator;

public class MainEntry {
	public static void main(String[] args) {
//		int x = 15, y;
//		y = ~x; //비트부정 -(원래값 + 1)
//		System.out.println("x = " + x + "\ty = " + y);
		
		//산술연산자: +, -, *, /, %, ......
		
		int x = 10, y = 20;
		int gob = x * y;
		
		System.out.println(x + " * " + y + " = " + gob);
		
		System.out.println("\n\n3+4*5 = " + (3+4*5));
		
		//정수 연산 --> 정수
		System.out.println(7/3); //정수  2
		
		System.out.println("\n 7/3.0 = " + (7/3.0)); //2.333333333 정수실수연산 --> 실수
		System.out.println("7.0%3.0 = " + (7%3.));
	}
}
/*		//단항연산자: 증강 ==> ++, --, ~, ......
		int x = 10, y;
		
		//y= x++; //후위연산: 대입먼저, 연산나중 x = 11, y = 10
		//y= ++x; //전위연산: 연산먼저, 대입나중 x = 11, y = 11
		//y = x--;//x = 9, y = 10
		
		++x;
		y = x;
		
		System.out.println("x = "+ x +"\ty = " + y);
	}
}
//*/