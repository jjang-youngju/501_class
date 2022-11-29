package cafe.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cafe.VO.food;
import cafe.VO.order_list;

public class food_DAO extends base_DAO{

	//주문내역
	public List<order_list> order_select(String id){
		List<order_list> list = new ArrayList<>();
		// 주문내역이 여러개 존재할 수 있기에 배열형태로 저장하기 위해 ArrayList 사용
		
		String sql = "select * from order_list where an_order=?";
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, id);
			rs = pt.executeQuery();
			while(rs.next()) {
				order_list data = new order_list(rs.getInt("order_seq"),rs.getString("food_name"),rs.getString("an_order"),
						rs.getInt("order_price"),rs.getInt("delivery_complete"),rs.getString("memo"));
				//DB에서 가져온 데이터들을 order_list객체로 하나씩 하나씩 생성해주고  ArrayList에 저장하기
				list.add(data);
			}
			//반복문 종료 되면 DB에서 가져온 모든 데이터를 저장해주었다는 것
			return list;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public Map<Integer,food> food_list() {
		
		Map<Integer,food> food_map = new HashMap<>();
		
		String sql = "select * from food";
		
		try {
			pt = conn.prepareStatement(sql);
			rs = pt.executeQuery();
			while(rs.next()) {// 여러 레코드를 조회 했다면 반복문 처리
				food data = new food(rs.getInt("food_seq"),rs.getString("f_name"),
						rs.getInt("cost"),rs.getInt("f_time"),rs.getInt("cal"),rs.getString("allergy"),
						rs.getInt("order_quan"));
				
				food_map.put(data.getFood_seq(), data);
			}
			return food_map;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean order_insert(order_list cont) {
		//매개변수를 order_list한 이유는  food_service에서 주문 내용들을 order_list의 객체에 저장하였기에 DB에 저장하려면 order_list객체의 값을 가져와서 저장해야 한다.
		//DB 저장하기
		//1. SQL문 작성하기
		//2. 자바에서 DB에 전달하기 위한 statement나 preparedstatement에 sql문 넣어주기
		//3. DB에 전달
		String sql="insert into order_list(food_name, an_order, order_price, memo) values(?,?,?,?) ";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1,  cont.getFood_name()); //음식이름
			pt.setString(2, cont.getAn_order()); //주문자
			pt.setInt(3, cont.getPrice()); //가격
			pt.setString(4, cont.getMemo()); //메모
			pt.executeUpdate(); //query - select, 조회,	 update - 변경, 추가, 삭제
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}



/*
 * 	자바 컬렉션
 * 
 * 	Collection (인터페이스)
 * 		1. List (인페이스)
 * 			1) ArrayList (클래스)
 * 			2) LinkedList (클래스)
 * 			3) vector
 * 			4)stack
 * 			5)queue
 * 
 * 		2. Set (인터페이스)
 * 			1) HashSet
 * 			2) TreeSet
 * 
 * 
 *  Map (인터페이스)
 *  	1. HashMap
 *  	2. HashTable
 *  	3. TreeMap
 *  	4. Properties
 *  
 *  
 *  map 인터페이스는 키와 값의 쌍을 하나의 데이터로 저장한다.
 *  데이터 접근은 키를 찾아 데이터를 리턴한다.
 *  그래서 키는 중복으로 사용하지 않는 데이터로 지정해야 한다.( 회원의 고유번호, 도서관의 책번호, 주민번호 등등)
 *  
 *  map 인터페이스의 메소드
 *  V put(k key, V value)  - k,v는 제네릭 타입이고 <키,값>으로 저장된다.
 *  boolean containsKey(Object k) 맵에 키가 있다면  true 없다면 false
 *  boolean containsValue(Object v) 맵에 value가 있다면 true 없다면 false
 *  V get(Object k) - 키에 대칭되는 값을 리턴
 *  
 *  
 *  예시)
 *  Map<String,member> m = new HashMap<String, member>();
 *  
 *  m.put("10가1234", new member("김유신") );
 *  	V put(k key, V value)
 *  	k- String, V - member
 *  
 *  m.containsKey("20사1234");
 *  	boolean containsKEy(Object k)
 *  	Object - String
 */
