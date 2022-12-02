package generic;


// public class seafood_box <T extends seafood & 인터페이스>
// 제네릭에 사용되는 타입종류
//	T - 타입, V - 값, K - 키, N - 숫자
// seafood_box <T(타입), V(값)> - 타입과 값 2개를 지정하겠다는 의미(2개 지정도 가능)
public class seafood_box<T extends seafood> { //seafood를 상속한것들만 담을수 있도록 제한해줌

	T box_item;
	
	public void setBox(T box) {
		this.box_item=box;
	}
	public void sellBox() {
		System.out.println("해산물 박스를 판매했습니다.");
	}
}
