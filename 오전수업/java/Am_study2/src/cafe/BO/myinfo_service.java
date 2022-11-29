package cafe.BO;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

import cafe.DAO.food_DAO;
import cafe.DAO.member_DAO;
import cafe.VO.member;
import cafe.main.cafe_main;
import cafe.VO.order_list;

public class myinfo_service {
	private member_DAO mdao = new member_DAO();
	private food_DAO fdao = new food_DAO();

	// 내정보
	public void info() {
		DecimalFormat fmt = new DecimalFormat("###,###");
		member my = cafe_main.user;
		System.out.println("아이디 : "+my.getId());
		System.out.println("이름 : "+my.getName());
		System.out.println("연락처 : "+my.getTel());
		System.out.println("이메일 : "+my.getEmail());
		System.out.println("알러지 : "+my.getAllergy());
		System.out.println("잔액 : "+fmt.format(my.getMoney())+"원");
	}
	
	// 내 주문내역
	public void order_list() {
		List<order_list> list = fdao.order_select(cafe_main.user.getId());
		
		Iterator<order_list> it = list.iterator();
		// Iterator - 컬렉션에 사용되는 인터페이스, 컬렉션에 저장된 값을 순차적으로 조회하기 위한 인터페이스,
		// 			  컬렉션을 위해 만들어진 인터페이스이다. 원본데이터 유지와 오류 발생을 최소화하기위해 사용 (일회용)

		while(it.hasNext()) { // hasNext -  다음공간에 데이터가 있느냐 없느냐
			order_list data = it.next(); // 한번만 사용가능 또쓰면 다음데이터로 넘어감
			System.out.println("주문음식 : "+data.getFood_name());
			System.out.println("주문자 : "+data.getAn_order());
			System.out.println("주문금액 : "+data.getPrice());
			
			String state = data.getDelivery_complete()==0?" 배달중 ":"배달완료";
			System.out.println("배달상태 : "+state);
			System.out.println("요청사항 : "+data.getMemo());
		}
	}
	
	// 내 지갑
	public void my_wallet() {
		
	}
}
