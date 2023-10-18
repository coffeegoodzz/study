package thread;

class NumCount1 extends Thread {
	
	int[] intArr = {1,2,3,4,5};
	
	public void run() {
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
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

class HanCount1 extends Thread {
	String[] strArr = {"하나", "둘", "셋", "넷", "다섯"};
	
	public void run() {
		
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

public class ThreadEx2 {
	public static void main(String[] args) {
		NumCount1 nc = new NumCount1();
		HanCount hc = new HanCount();
		
		nc.start();
		hc.start();
	}
}
