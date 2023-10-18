package thread;

class NumCount2 implements Runnable {

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
	
}

class HanCount2 implements Runnable {

	@Override
	public void run() {
		String[] strArr = new String[] {"가","나","다","라","마"};
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadEx3 {
	public static void main(String[] args) {
		NumCount2 nc = new NumCount2();
		// Thread 객체에 주입해서 사용
		Thread thread1 = new Thread(nc);
		
		thread1.start();
		
		HanCount2 hc = new HanCount2();
		// Thread 객체에 주입해서 사용
		Thread thread2 = new Thread(hc);
		
		thread2.start();

	}
}
