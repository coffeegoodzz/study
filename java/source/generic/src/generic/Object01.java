package generic;

class Fruit2 {
	
	void fruit2() {
		System.out.println("과일입니다");
	}
}

class Pencil2 {
	void pencil2() {
		System.out.println("연필입니다");
	}
}

class Box {
	
	private Object obj; // 어떤 객체가 들어오든지 다 저장

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}

public class Object01 {

	public static void main(String[] args) {
		Box b = new Box();
		
		b.setObj(new Fruit2());
		Fruit2 f2 = (Fruit2) b.getObj();
		System.out.println(f2);
		
		System.out.println("");
		
		Box b2 = new Box();
		
		b.setObj(new Pencil2());
		Pencil2 p2 = (Pencil2) b2.getObj();
		
		Object str = "koreait";
		
		String s = (String) str;
		System.out.println(s);
		
		Object i = 1234;
		Integer num = (Integer) i;
		
		System.out.println(num);
	}
}
