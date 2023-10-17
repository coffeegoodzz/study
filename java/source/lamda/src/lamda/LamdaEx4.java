package lamda;

interface MaxNum {
	int getMaxNum(int x, int y);
}

public class LamdaEx4 {
	public static void main(String[] args) {
		
		/* MaxNum m = (x, y) -> {
			
			if( x > y) {
				return x;
			}else {
				return y;
			}
		};
		System.out.println(m.getMaxNum(1, 2)); */
		
		MaxNum m = (a, b) -> {
			
			return (a > b) ? a : b;
		};
		System.out.println(m.getMaxNum(5, 8)); 
	}
}
