package examPractice;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 영문자 출력 do while을 이용하여 출력하시오
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		do {
			String str = sc.next();
			System.out.println(str);
			
			if(str.equals("exit")) {
				run = false;
				System.exit(0);
			}
		} while(run);
	}
}
