package ex09.break_continue;

public class MultiBreak {
	public static void main(String[] args) {
		
		boolean flag = true;
		
		firust: { //식별자
			second: {
					third: {
						int k  = 100;
						System.out.println("Before the break");
						if(flag) break second; //(second 블럭까지 바로 빠져나감)
						System.out.println("This won't execute");
					}// end third
		
			System.out.println("우리반 홧팅 !!!");
				}// end second
		
		System.out.println("This is after second block");
			}// end firust
	}
}