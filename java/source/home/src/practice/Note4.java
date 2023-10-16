package practice;

import java.util.*;

public class Note4 {

	public static void main(String[] args) {
		/*
		 *문자열 중괄호를 입력 받아 이때 짝이 맞는 중괄호의 쌍이 존재한다면 true를 반환 하는 코드를 작성하시오 
		 *올바른 순서로 여는 중괄호에 닫는 중괄호가 있다면 알맞는 짝이라고 할 수 있다 stack 사용하세요
		 * ex) {{}{}{{}}} -> true {{}}}{} -> false
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("입력하세요 >> ");
		String str = sc.next();

		char[] ch = str.toCharArray();
		Stack<Character> stack = new Stack<>();

		for (char c : ch) {
			if (c == ('{')) {
				stack.push(c);
			}else if(c == ('}')) {
				stack.pop();
			}else {
				throw new EmptyStackException();
			}
		}
		System.out.println(stack.isEmpty());
	}
}
