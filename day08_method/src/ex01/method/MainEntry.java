package ex01.method;

public class MainEntry {
	
	// 1) 매개변수 없고, 리턴타입 없는 경우
	// public returnType methodName() { }
	public static void line() {
		System.out.println("-----------------------------");
	}
	public static void display() { //함수 정의부
		System.out.println("happy xoxorbrb");
	}
	
	// 2) 매개변수 있고, 리턴 타입 없는 경우
	// public returnType methodName(parameter var1, parameter var2 ,...) {   }
	public static void showName(String name , int age) {
		System.out.println("당신의 이름은 " + name);
		System.out.println("당신의 나이는 " + age + "세");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main Start");
		line();
		display(); // 함수 호출
		line();
		System.out.println("Main End");
		line();
		
		showName("김연아", 25);
		showName("박태환", 26);
		showName("이순신", 100);
	}
	
}