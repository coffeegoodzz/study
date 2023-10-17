package lamda;

interface ConcatStr {
	
	void makeConcat(String s1, String s2);
}

class ConcatStrImpl implements ConcatStr {
	
	@Override
	public void makeConcat(String s1, String s2) {
		System.out.println(s1 + " 입니다.");
		System.out.println(s2 + " 입니다.");
	}
}

public class LamdaEx5 {
	public static void main(String[] args) {
		
		ConcatStrImpl csi = new ConcatStrImpl();
		
		ConcatStr cs = (s1, s2) -> {
			csi.makeConcat(s1, s2);
		};
		cs.makeConcat("토트넘", "맨시티");
	}
}
