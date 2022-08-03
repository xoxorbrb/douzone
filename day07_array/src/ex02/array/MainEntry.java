package ex02.array;

public class MainEntry {
	public static void main(String[] args) {
//		int[][] a = new int[2][3];
//		int[][] a = new int[][] {{1,2,3},{4,5,6}}; //2행 3열
		int[][] a = {{1,2,3,55,3,8} ,{4,5,6,7,8,6}}; //초기화
		
		System.out.println("행 길이: " + a.length);
		System.out.println("열 길이: " + a[0].length);
		
		for(int i = 0; i < a.length; i ++) {
			for(int j = 0; j < a[i].length; j ++) {
				System.out.print("a[" +i + "]["+ j + "]" + " " + a[i][j] + "\t");
			}
		}
	}
}