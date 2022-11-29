package cafe.DAO;

//import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

import cafe.VO.member;
import cafe.main.cafe_main;

public class member_DAO extends base_DAO{

//	private Connection conn=null; // 데이터베이스 연결정보를 저장
//	private Statement st=null; // sql 질의문을 데이터베이스에 전달 // Statement : 문자열 그대로 전달
//	private PreparedStatement pt=null; // sql 질의문을 데이터베이스에 전달
//	private ResultSet rs=null; // sql 질의문 조회 결과를 저장
	
	public member_DAO() { //기본 생성자 메서드
//		DriverLoad();
//		connect();
		table_check();
	}
	
	//로그인
	public boolean login(String id, String pw) {
		String sql = "select * from member where id=? and tel=?";
		//member 테이블에서  id와  tel이 일치 하는가 확인
		
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, pw);
			rs = pt.executeQuery();
			if(rs.next()) { // id와 tel이 일치하는 정보라면 로그인 성공
				cafe_main.user = new member(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7));
				//rs.getString("컬럼명") 이런식으로 적어도 됨. 숫자로 하려면 순서대로 해야함
				return false;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return true; // 아이디 비번이 잘못되어서 로그인 실패
		
	}
	
	//아이디, 이메일 중복확인
	public boolean id_check(String id, String email) {
		String sql = "select * from member where id=? or email=?";
		
		try {
			pt =conn.prepareStatement(sql);
			pt.setString(1, id);
			pt.setString(2, email);
			rs = pt.executeQuery();
			if(rs.next()) {
				
				return true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// 어디서든 사용할 수 있는 메서드, 저장하는 메서드 만들기
	public boolean member_insert(String id, String name, String tel, String email,String allergy) {
		String sql="insert into member(id, name, tel, email,allergy) values(?,?,?,?,?) ";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1,  id);
			pt.setString(2, name);
			pt.setString(3, tel);
			pt.setString(4, email);
			pt.setString(5, allergy);
			pt.executeUpdate(); //query - select, 조회,	 update - 변경, 추가, 삭제
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	// 테이블 생성하기
	private void tablemake() {
		String sql="create table member(member_seq int auto_increment primary key , "
				+ "id varchar(50) not null, name varchar(20) not null, "
				+ "tel varchar(20) not null, email varchar(255) not null)";
		
		try {
			st = conn.createStatement();
			int result = st.executeUpdate(sql);
			System.out.println("member 테이블 생성");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	private void table_check() {
		String sql="select COUNT(*) as cnt from information_schema.tables ";
		sql += "where table_schema='dw_501' and table_name='member'";
		
		// createStatement - 객체만들기
		try {
			st = conn.createStatement(); // 접속정보로 질의문 저장할 수 있는 객체 생성
			rs = st.executeQuery(sql); // 만들어 놓은 질의문을 저장해서 연결된 데이터베이스에 전달하고 결과받기
			if(rs.next()) { //rs.next() : rs에 결과값이 있는가? 없는가? 확인하고 rs에서 값 가져오기 해야한다.
				int cnt = rs.getInt("cnt");
				if(cnt==0)
					tablemake();
			}
			rs.close();
			st.close();
			// conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
//	private void connect() {
//		// DB주소 : jdbc:mysql: // 데이터베이스서버주소 : mysql-port/DB명
//		String url = "jdbc:mysql://localhost:3306/dw_501";
//		String user = "root"; // mysql 계정명
//		String pass = "01037578235"; // mysql 계정 비번
//		try {
//			conn = DriverManager.getConnection(url,user,pass);			
//		} catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("접속 실패");
//		}
//	}

	// 드라이버 로드라는 작업은 해당 데이터베이스와 연결해주는 
	// 클래스를 컴퓨터 메모리에 로드(적재, 올린다.) 해주는 작업이다.
	
//	private void DriverLoad() {
//		// 각 데이터베이스마다 경로가 다르다.
//		// 예외처리 해줘야 빨간줄이 사라진다.
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver"); // 문자열을 클래스화 해준다.
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("드라이버 로드 실패");
//		}
//		// Class.forName("Cafe.control.order");
//	}
}
