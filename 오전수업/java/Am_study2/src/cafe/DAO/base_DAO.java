package cafe.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class base_DAO {
	protected Connection conn = null;
	protected Statement st = null;
	protected PreparedStatement pt = null;
	protected ResultSet rs = null;
	
	public base_DAO() {
		DriverLoad();
		Connect();
	}
	private void DriverLoad() {
		// 각 데이터베이스마다 경로가 다르다.
				// 예외처리 해줘야 빨간줄이 사라진다.
				try {
					Class.forName("com.mysql.cj.jdbc.Driver"); // 문자열을 클래스화 해준다.
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
					System.out.println("드라이버 로드 실패");
				}
				// Class.forName("Cafe.control.order");
	}
	private void Connect() {
		// DB주소 : jdbc:mysql: // 데이터베이스서버주소 : mysql-port/DB명
				String url = "jdbc:mysql://localhost:3306/dw_501";
				String user = "root"; // mysql 계정명
				String pass = "01037578235"; // mysql 계정 비번
				try {
					conn = DriverManager.getConnection(url,user,pass);			
				} catch(Exception e) {
					e.printStackTrace();
					System.out.println("접속 실패");
				}
	}
}
