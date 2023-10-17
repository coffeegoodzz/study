package lamda;

interface MyLamda{
	
	void disp();
}

public class LamdaEx {
	public static void main(String[] args) {
		// 화살표 함수 뒤에 중괄호는 출력 내용이 한줄일 때는 생략이 가능
		// MyLamda m = () -> {작업내용};
		MyLamda m = () -> {
			System.out.println("123asdf");
		};
		m.disp();
		
		System.out.println("");
		
		MyLamda m2 = () -> {
			System.out.println("2023-10-17");
		};
		m2.disp();
		
		System.out.println("");
	}
}
