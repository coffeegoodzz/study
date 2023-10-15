package algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Exam101502 {
	public static void main(String[] args) {
		/*
		 * 중괄호를 입력 받아 중괄호가 짝수이면 true 그게 아니라면 false를 반환
		 * ex) {{}{}{{}}} -> true  {{}}}{} -> false
		 */
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		
		Stack<Character> stack =  new Stack<>();
		
		for(char c : ch) {
			if(Character.toString(c).equals("{")) {
				stack.push(c);
			}else {
				stack.pop();
			}
		}
		System.out.println(stack.isEmpty());
	}
}
