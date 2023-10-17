package lamda;

interface LamEx{
	
	String greeting(String str);
}

interface Cals2 {
	
	int add(int a, int b);
}

public class LamdaEx3 {
	public static void main(String[] args) {
		
		LamEx l = (s) -> {
			String str = s + " 입니다.";
			
			return str;
		};
		System.out.println(l.greeting("2023-10-17"));
		
		System.out.println("");
		
		Cals2 c = (a, b) -> {
			
			int sum = (a+b) -2;
			
			return sum;
		};
		System.out.println(c.add(10, 5));
	}
}
