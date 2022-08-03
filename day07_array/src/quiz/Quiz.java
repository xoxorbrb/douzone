package quiz;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 입력해주세요: ");
		int subject = 3;
		int person = sc.nextInt(); // 인원 수
		int kor, eng, com, total;           // 국어, 영어, 전산 점수 
		double avg;
		String[] Stuname = new String[person];                  // 이름
		String name;
		int[][] arr = new int[person][5];
			for(int x = 0; x < arr.length; x ++) {
				for(int y=0; y <subject; y++) {
					System.out.print("이름을 입력하세요: ");
					name = sc.next();
					Stuname[x] = name;
					System.out.print("국어 점수 입력하세요: ");
					kor = sc.nextInt();
					System.out.print("영어 점수 입력하세요: ");
					eng = sc.nextInt();
					System.out.print("전산 점수 입력하세요: ");
					com = sc.nextInt();
					if(kor >= 0 && kor <= 100 && eng >= 0 && eng <= 100 && com >= 0 && com <= 100) {
						switch(y) {
						case 0: arr[x][y] = kor; break;
						case 1: arr[x][y] = eng; break;
						case 2: arr[x][y] = com; total = kor + eng + com; avg = total /(double)subject; break;
						default: break;
						}//switch end
					} // if end
					
					System.out.println(y);
				} // y end
			}  // x end		
			
		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j ++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		
	}
}

