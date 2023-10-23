package examPractice;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 3의 배수 5의 배수 출력
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		int num2 = sc.nextInt();
		
		for(int i = 1; i <= num2; i++) {
			System.out.print(num1 * i + " ");
		}
	}
}
