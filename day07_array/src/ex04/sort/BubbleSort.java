package ex04.sort;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = { 7, 3, 5, 2, 8 };
		
		for(int i = 0; i < a.length; i ++) {
			System.out.print(a[i] + "\t");
		}
		int temp;
		for(int i = 0; i < a.length; i ++) {
			for(int j = 0; j < a.length-i-1; j++) {
				
				if(a[j] < a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < a.length; i ++) {
			System.out.print(a[i] + "\t");
		}
		
	}
}
