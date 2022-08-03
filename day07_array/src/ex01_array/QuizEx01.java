package ex01_array;

public class QuizEx01 {
	public static void main(String[] args) {
		//문제 1 int[] a= {1,.7,3,7,99,7,8,55,7,90,7} --7의 개수
		
		int[] a= {1,7,3,7,99,7,8,55,7,90,7};
		int count = 0;
		
		for (int i = 0; i < a.length; i ++) {
			if (a [i] == 7) count ++;
		}
		System.out.println(count);
 	}
}
