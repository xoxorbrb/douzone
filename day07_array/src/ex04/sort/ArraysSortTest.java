package ex04.sort;

import java.util.Arrays;

public class ArraysSortTest {
	public static void main(String[] args) {
		int[] a = { 7, 3, 5, 2, 8 };
		
		for(int i = 0; i < a.length; i ++) {
			System.out.print(a[i] + "\t");
		}
		
		int temp;
		System.out.println();
		System.out.println("오름차순");
		
		Arrays.sort(a); // 정렬 알고리즘이 이미 내부적으로 처리 되어 있는 메소드
		for(int i = 0; i < a.length; i ++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println("\n내림차순\n");
		
		for(int i = a.length-1; i >=0; i--) {
			System.out.print(a[i] + "\t");
		}
	}
}
