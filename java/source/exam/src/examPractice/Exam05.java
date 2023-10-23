package examPractice;

import java.util.Random;
import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// 무작위 값을 배열에 저장 후 짝수만 출력하는 프로그램을 작성하시오
		
		Scanner sc = new Scanner(System.in);
		
		int max = sc.nextInt();
		int size = sc.nextInt();
		int num[] = new int[size];
		
		for(int i = 0; i < num.length; i++) {
			int random = (int)(Math.random() * max) + 1;
			num[i] = random;
			
			if(num[i] %2 == 0) {
				System.out.println("짝수 : " + num[i]);
			}
		}
	}
}
