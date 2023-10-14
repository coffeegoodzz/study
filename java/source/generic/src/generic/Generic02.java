package generic;

class Item<K, V> {
	private K k;
	private V v;
	
	public K getK() {
		return k;
	}
	public void setK(K k) {
		this.k = k;
	}
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
}

public class Generic02 {

	public static void main(String[] args) {
		// 1. 문자열 숫자
		Item<String, Integer> item1 = new Item<>();
		
		item1.setK("의류");
		item1.setV(100000);
		
		System.out.println(item1.getK() + "의 가격은 " + item1.getV() + " 입니다.");
		
		// 웹 -> 404, 요청하신 주소를 찾을 수 없습니다
		Item<Integer, String> item2 = new Item<>();
		
		item2.setK(404);
		item2.setV("요청하신 주소를 찾을 수 없습니다.");
		
		System.out.println(item2.getK() + "에러 입니다. " + item2.getV());
	}
}
