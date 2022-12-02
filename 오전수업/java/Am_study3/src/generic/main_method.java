package generic;

public class main_method {

	public static void main(String[] args) {
		
		seafood_box<seafood> 해산물박스 = new seafood_box<>();
		해산물박스.setBox( new seafood() );
		해산물박스.setBox( new 오징어() );
		해산물박스.setBox( new 새우() );
		해산물박스.setBox( new 참치() );
		
//		해산물박스 = new seafood_box<새우>();
		
		seafood_box<새우> 새우박스 = new seafood_box<>();
		새우박스.setBox( new 새우() );
		
		seafood_box<오징어> 오징어박스 = new seafood_box();
		오징어박스.setBox( new 오징어() );
		
		구매 구매자 = new 구매();
		구매자.buy( 오징어박스 );
		구매자.buy( 새우박스 );
		
//		해산물박스.setBox( new 소고기() ); // 소고기는 해산물이 아니라서 들어올수 없음.
	
//		seafood_box<소고기> 소고기박스 = new seafood_box<>();//제네릭타입을 소고기로 하면 불러올수는 있다
//		소고기박스.setBox( new 소고기() ); // seafood_box에 제한을 걸어두면 이렇게 해도 불러올수 없음.
	
//		seafood_box<오징어> 오징어박스 = new seafood_box<>();
//		
//		오징어박스.setBox(new 오징어());
//		오징어박스.sellBox();
//		
//		seafood_box<새우> 새우박스 = new seafood_box<>();
//		새우박스.setBox(new 새우());
		
//		오징어박스.setBox(new 참치()); // 오징어박스는 오징어 객체만
		
//		seafood<String> sea = new seafood<String>();
//		sea.store("김기원주율");
//		System.out.println(sea.판매());
//		
//		sea.store(1200);
		
//		ArrayList<Integer> list = new ArrayList<>();
//		
//		list.add(100);
//		list.add(200);
//		list.add(342);
//		list.add(3.14);
//		list.add("박영주 목발");
//		
//		System.out.println(list);
	}

}
