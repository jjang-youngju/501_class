package generic;

public class 구매 {
	
	public void buy(seafood_box<? extends seafood> item) {
		System.out.println( "해산물 구매함" );
	}

//	public void buy(seafood_box<새우> item) { //매개변수가 같기때문에 오버로딩 사용할수 없음
//		System.out.println( "해산물 구매함" );
//	}
}
