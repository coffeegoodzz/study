package examPractice;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// 주민번호를 입력받아 1이면 남자 2이면 여자를 출력
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String str2 = str.substring(7, 8);
		
		int num = Integer.parseInt(str2);
		
		if(num == 1) {
			System.out.println("남자");
		}else if(num == 2) {
			System.out.println("여자");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
	}
}
