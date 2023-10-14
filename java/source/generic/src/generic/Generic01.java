package generic;

class Fruit3 {
	
	void fruit3() {
		System.out.println("과일입니다.");
	}
}

class Pencil3 {
	
	void pencil3() {
		System.out.println("연필입니다.");
	}
}

class Box3<T> {
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class Generic01 {

	public static void main(String[] args) {
		Box3<Fruit3> b1 = new Box3<>();
		
		b1.setT(new Fruit3());
		
		Fruit3 f3 = b1.getT();
		System.out.println(f3);
	}
}
