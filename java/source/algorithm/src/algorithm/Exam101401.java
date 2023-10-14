package algorithm;

import java.util.Scanner;

public class Exam101401 {

	public static void main(String[] args) {
		
		/*
		 * N개의 숫자가 공백 없이 써 있다 이 숫자를 모두 합하여 결과를 출력하는 프로그램을 작성
		 * 1번째 줄에 숫자의 개수 N(1 <= N <= 100).
		 * 2번째 줄에는 숫자 N개가 공백없이 주어진다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 숫자 갯수 입력 > ");
		int N = sc.nextInt();
		
		String str = sc.next();
		char[] ch = str.toCharArray();
		
		int sum = 0;
		
		for(int i = 0; i < ch.length; i++) {
			sum += Integer.parseInt(String.valueOf(ch[i]));
		}
		System.out.println(sum);
	}
}
