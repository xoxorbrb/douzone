package ex06.instanceMethod;
/*
 *  instancemethod : 객체 생성하고 사용해야함 ( 메모리 상에 할당 되어서 )
 */

class B{
	int x, y;
	// instancemethod
	public void setData(int xx, int yy) {
//		xx = 50; yy = 70;
		System.out.println(xx + ", " + yy);
	}
	
} // B class end
public class InstanceMethod {
	public static void main(String[] args) {
		B b = new B(); // 객체 생성, 메모리에 할당, 생성자함수 자동 호출
		b.setData(100, 200);
	}
}
