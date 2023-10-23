package examPractice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	
	DBCon db = DBCon.getInstance();
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	int insertInfo() throws Exception {
		
		con = db.getConnection();
		
		String sql = "insert into member values(null,?,?,?,now());";
		
		Member m = new Member();
		m.setName("손흥민");
		m.setPasswd("4567");
		m.setEmail("qwas@gmail.com");
		
		pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, m.getName());
		pstmt.setString(2, m.getPasswd());
		pstmt.setString(3, m.getEmail());
		
		int result = pstmt.executeUpdate();
		
		return result;
	}
	
	List<Member> getMember()throws Exception{
		List<Member> list = new ArrayList<>();
		
		con = db.getConnection();
		
		String sql = "select * from member order by id desc;";
		
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Member m = new Member();
			m.setId(rs.getInt(1));
			m.setName(rs.getString(2));
			m.setPasswd(rs.getString(3));
			m.setEmail(rs.getString(4));
			m.setStartDate(rs.getString(5));
			
			list.add(m);
		}
		return list;
	}
}
