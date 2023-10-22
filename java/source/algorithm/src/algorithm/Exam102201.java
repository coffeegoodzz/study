package algorithm;

class Stack{
	private int top;
	private int[] stackArr;
	private int size;
	
	public Stack(int size) {
		// 스택 생성
		this.size = size;
		top = -1;
		this.stackArr = new int[size];
	}
	
	public void push(int val) {
		// 데이터 삽입
		if(isFull()) {
			return;
		}else {
			stackArr[++top] = val;
		}
	}
	
	public int pop() {
		// 데이터 삭제
		if(isEmpty()) {
			return 0;
		}
		return stackArr[top--];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == size -1);
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
		}else {
			for(int i = 0; i <= top; i++) {
				System.out.println(stackArr[i] + "");
			}
		}
		System.out.println("");
	}
	
}

public class Exam102201 {
	
	public static void main(String[] args) {
		int size = 5;
		Stack stack = new Stack(size);
		
		stack.push(1);
		stack.printStack();
		
		stack.push(2);
		stack.printStack();
		
		stack.push(3);
		stack.printStack();
		
		stack.pop();
		stack.printStack();
	}
}
