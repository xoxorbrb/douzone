package ex02.dataType;

public class DataType {
	public static void main(String[] args) {
		short sh = +32767; // -32768 ~ 32767
		int su = 32769;
		
		su = sh; //묵시적(자동) 형변환
		sh = (short)su; // 명시적 형변환
		
		System.out.println(sh + ", " + sh);
		
		boolean flag = true;
		System.out.println(flag);
		System.out.println(!flag);
		
		flag = false;
		System.out.println(!flag);
	}
}