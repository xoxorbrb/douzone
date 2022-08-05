package ex04.arrayMethod;

public class MainEntry {
	public static void main(String[] args) {
		int x = 3, y = 5;
		int sum = 0;
		int result = MethodEx(x,y);
		System.out.println(result);
		int[] arrResult = methodEx2();
		int[][] arrResult2 = methodEx3();
		
		for(int i = 0; i< arrResult.length; i ++) {
			System.out.println(arrResult[i] + " ");
		}
		
		for (int item: arrResult) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		for (int i = 0; i < arrResult2.length; i ++) {
			for(int j = 0; j < arrResult2[0].length; j ++)
			{
				sum += arrResult2[i][j];
				
			}
			
		}
		
		System.out.print(sum + " ");
		
		System.out.println("\n\n\n\n\n");
		
		for(int[] item: arrResult2) {
			for(int arritem: item) 
				System.out.println(arritem + " ");
		}
	}
	
	public static int MethodEx(int x, int y) {
		return x + y;
	}
	
	public static int[] methodEx2() {
		int[] arr = {1,2,3,4,5,6,7,8};
		return arr;
	}
	
	public static int[][] methodEx3() {
		int[][] arr = {{10,20,30},{40,50,60}};
		return arr;
	}
}