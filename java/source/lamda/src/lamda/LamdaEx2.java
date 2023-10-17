package lamda;

interface Cals {
	// 람다식은 일반적으로 인터페이스 안에 메소드 1개만 생성 후 사용
	void dispNum(int num);
}


public class LamdaEx2 {
	public static void main(String[] args) {
		
		Cals c;
		
		c = (num) -> {
			System.out.println(num);
		};
		c.dispNum(10);
		
		System.out.println("");
		
		c = (x) -> {
			System.out.println(x * 10);
		};
		c.dispNum(5);
		
		System.out.println("");
		
		c = (y) -> {
			int sum = (y + 10) /4 ;
			System.out.println(sum);
		};
		c.dispNum(6);
	}
}
