package ex01_array;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		//1.
		char[] ch;   // 배열 선언
		ch = new char[4]; // 배열생성, 메모리에 할당
		
		//2.
		//char[] ch2 = new char[4]; // 배열 선언 및 생성
		int NUM = 4;
		//int NUM = new Scanner(System.in).nextInt();
		char[] ch2 = new char[NUM];
		//배열 초기화
		ch2[0] = 'J';
		ch2[1] = 'A';
		ch2[2] = 'V';
		ch2[3] = 'A';
		
		System.out.println(ch2[1]);
		
		System.out.println("====================");
		
		for(int i=0; i<4; i++) System.out.println(ch2[i]);
		
		
		//3.
		char[] ch3 = {'J', 'A','V','A','a','b','c'};
		for (int i = 0; i < ch3.length; i ++) { //for (int i = 0; i < 8; i ++) {
			System.out.println("ch3["+ i + "] = " + ch3[i]);
		}
		
		System.out.println("====================");
		
		String[] str = { "a", "kbs", "str"," 123a", "sa1","asdja"};
		for(int i=0; i<str.length; i ++) {
			System.out.println(str[i]);
		}
		
		System.out.println("====================");
		
		String[] str2 = new String[] { "a", "kbs", "sastr"," 123a", "sa1", " asd", "adif","ehf","eoe"};
		for(int i=0; i<str2.length; i ++) {
			System.out.println(str2[i]);
		}
		
		System.out.println("str2[2]" + str2[2]);
	}
}
