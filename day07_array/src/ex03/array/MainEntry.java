package ex03.array;

public class MainEntry {
	public static void main(String[] args) {
		//1.
		int [][][] a  = new int[2][2][3];
		//2.
		
		int [][][] a2 = new int[][][]  {{{1,2,3},{4,5,6}}, {{1,2,3},{4,5,6}}};
		//3.
		
		for(int i =0; i< a2.length; i++) {
			for (int j = 0; j <a2[i].length; j ++ ) {
				for(int k = 0; k < a2[i][j].length; k ++) {
					System.out.print("\t" + a2[i][j][k]);
				}System.out.println();
			}System.out.println();
		}
	}
}
