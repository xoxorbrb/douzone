package Quiz;

public class quiz1 {
	public static void main(String[] args) {
		
		int [] arr = new int[6];
		int num;
		
		for(int i = 0;  i < arr.length; i ++) {
			num = (int)(Math.random()*45) +1;
			if ( i == 0) {
				arr[i] = num;
			}
			else {
				for(int j = 0;  j < arr.length; j ++) {
					if (arr[i] != arr[j]) {
						arr[i] = num;
					}
				}
			}
		}
		
		System.out.println("===========로또번호=============");
		for(int i =0; i < arr.length; i ++) {
			System.out.print(arr[i] + " ");
		}
		 
		
	}
}
