package 자바0927;

class A{//	A클래스 시작
	int value = 100; // value 탄생
	/*필드 변수 특징
	 * 1. 전역(전체)으로 활용 가능
	 * 2. 초기값을 지정하지 않아도 된다. 기본 값(default 값)이 존재
	 */
	
	public void 확인하기() {
		int x =50; // x라는 이름을 가진 변수 탄생
		int y; //	y에 값이 없어서 y를 출력 혹은 사용 시 오류 발생.
		System.out.println("A클래스에 있는 메소드 입니다.");
		System.out.println(value);
	}//x 생을 마감
	
}//	A클래스 끝 value 생을 마감

class B{
	public void 확인하기2() {
		
	}
}

class C{
	// 필드변수
	String str;
	int value;
	// **리턴타입이 있으면 리턴을 꼭 써주자**
	public boolean 메소드만들기() {
		//true or false를 리턴
		return true;
	}
	public int 메소드만들기(double x, double y) {
		return 0;
	}
}

public class Home {
	
	public static void main(String[] args) {
		A a클래스 = new A(); // new A() => A클래스를 호출하다.
		a클래스.확인하기(); //a클래스에 있는 확인하기 메소드(==함수) 사용

		B b클래스 = new B();
		b클래스.확인하기2();
	}

}
