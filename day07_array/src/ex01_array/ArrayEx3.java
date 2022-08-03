package ex01_array;

public class ArrayEx3 {
	public static void main(String[] args) {
		// 확장(개선된) for문
		int[] arr = {1, 7, 3, 7, 999, 7, 8, 55, 7, 90, 7};
		
		for(int i = 0; i < arr.length;  i ++) {
			if(arr[i] >= 99) break;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("============================");
		//for(자료형 변수명: 컬렉션명 or 배열명) { }
		
		for(int item: arr) {
			System.out.print(item + "\t");  
		}
		System.out.println("\n\n============================");
		
		int[] score = {78, 70, 88, 99, 58};
		int hap = 0;
		for(int item: score) {
			hap += item;
		}
		System.out.println("\n\n점수 합계:" + hap);
	}
}

