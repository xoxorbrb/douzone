package ex04.sort;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = { 7, 3, 5, 2, 8 };
		
		for(int i = 0; i < a.length; i ++) {
			System.out.print(a[i] + "\t");
		}
		
		int temp;
		//sort
		for(int i = 0; i <a.length;  i++) {
			for(int j = i+1; j < a.length; j ++) {
				if(a[i] > a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}
			}
		}
		System.out.println();
		for(int i = 0; i < a.length; i ++) {
			System.out.print(a[i] + "\t");
		}
		
	}
}
