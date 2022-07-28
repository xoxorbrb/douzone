package quiz;

public class QuizEx2 {
	public static void main(String[] args) {
		int su = 12345;
		
		int hour, minute, second;

		hour = 12345 / 3600;
		su = su - hour * 3600;
		minute = su / 60;
		second = su - minute * 60;
		
		
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
		
	}
}
