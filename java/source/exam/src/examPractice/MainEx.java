package examPractice;

import java.util.List;

public class MainEx {

	public static void main(String[] args) throws Exception {
		
		MemberDao dao = new MemberDao();
		
		//dao.insertInfo();
		List<Member> list = dao.getMember();
		
		for(Member m : list) {
			System.out.println(m.toString());
		}
	}
}
