package examPractice;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.xdevapi.DbDoc;

public class DBCon {
	
	private static DBCon dc = new DBCon();
	
	private DBCon() {}
	
	public static DBCon getInstance() {
		return dc;
	}
	
	Connection getConnection() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/mydb";
		String id = "root";
		String pwd = "1234";
		
		Connection conn = DriverManager.getConnection(url, id, pwd);
		System.out.println("연결완료");
		
		return conn;
	}
	
}
