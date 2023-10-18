package thread;

public class ThreadEx {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Runtime.getRuntime().availableProcessors());
		// Single Thread : 순서대로 처리
		
		// 1,2,3,4,5
		// A,B,C,D,E
		
		// Thread를 이용해서 0.5초의 간격을 두고 실행
		// 프로그래밍은 1초 = 1000
//		for(int i = 1; i < 6; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		System.out.println("");
//		
//		for(int i = 65; i < (65+5); i++) {
//			System.out.println((char)i);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println("");
		// 1,2,3,4,5
		// 하나, 둘, 셋, 넷, 다섯
		
		
		int[] intArr = new int[] {1,2,3,4,5};
		String[] strArr = new String[] {"하나","둘","셋","넷","다섯"};
		
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
			Thread.sleep(1000);
		}
		
		System.out.println("");
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
			Thread.sleep(1000);
		}
	}
}
