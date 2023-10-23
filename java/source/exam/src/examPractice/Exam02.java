package examPractice;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 영문자를 입력받아서 해당 문자를 대문자로 변경하여 출력
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(str.toUpperCase());
	}
}
