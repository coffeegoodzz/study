package examPractice;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// 점수를 입력받아 점수가 60점 이상이면 합격 미만이면 불합격
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score >= 60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
	}
}
