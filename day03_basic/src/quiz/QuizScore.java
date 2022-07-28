package quiz;
//import java.lang.* //자동으로 임포트해줌

public class QuizScore {
	public static void main(String args[]) {
		int kor = 90, eng = 88, com = 100, total;
		String name = "xorb";
		double avg = 0;
		
		total = kor + eng + com;
		avg = total /3.0;
		
		System.out.println(name + "님의 성적표 ****");
		System.out.println("국어: " + kor + ", 영어: " + eng + ", 전산: " + com);
		System.out.printf("총점: %d , 평균: %.2f" , total, avg );
	}
}

/*
	result: 
	xorb님의 성적표 ***
	국어 : 90, 영어 : 88, 전산: 100
	총점 : 278, 평균 : 92.67
*/