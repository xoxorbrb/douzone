package ex01.scanner;

public class InputType {
	public static void main(String[] args) {
		
		if (args.length <= 0) {
			System.out.println("데이터 입력 하세요.");
			return ;
		}
		
		String str = args[0];
		String strSu = args[1];
		int num = Integer.parseInt(strSu);
		
		System.out.println(str);
		System.out.println(num + 33);
	}
}
