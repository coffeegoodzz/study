package thread;

public class ThreadEx4 {
	public static void main(String[] args) {
		// Thread 익명함수로 처리 - run()메소드를 익명함수로 처리
		
		// 글자 출력
		Thread t1 = new Thread(() -> {
			
			String[] strArr = {"가","나","다","라","마"};
			for(int i = 0; i < strArr.length; i++) {
				System.out.println(strArr[i]);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		// 숫자 출력
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int[] intArr = new int[] {1,2,3,4,5};
				
				for(int i = 0; i < intArr.length; i++) {
					System.out.println(intArr[i]);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		//System.out.println("스레드 이름은 : " + t1.getName());
		// 스레드 우선순위 : 10 <-> 1
		// t1.setPriority(10);
		// System.out.println(t1.getPriority()); 
		t1.start();
		
		// System.out.println("스레드 이름은 : " + t2.getName());
		t2.start();
	}
}
