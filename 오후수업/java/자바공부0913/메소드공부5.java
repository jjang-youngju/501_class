package 자바공부0913;

public class 메소드공부5 {
	/*
	 * public static :접근 지정자
	 * int : 리턴타입
	 * getSum :  메소드 이름
	 * int x, int y: 파라미터 값, 매개 변수, 인수 값 ...
	 */

	public static int getSum(int x,int y) {
		return x+y;
	}
	
	/*
	 * public static : 접근지정자
	 * boolean : 리턴타입
	 * isLogin : 메소드 이름
	 * boolean isLogin : 파라미터 값
	 */
	public static boolean isLogin(boolean isLogin) {
		return isLogin;
	}
	
	public static String getWord(String word) {
		return word;
	}
	
	public static void main(String[] args) {
		String word = getWord("치즈돈까스");
		//문제3) 예상되는 word의 값은?치즈돈까스
		int result = getSum(10,10);
		//문제 1)예상되는 result값은? 20
		System.out.println("결과 :"+result);
		//
		boolean isResult = isLogin(true);
		//문제 2) 예상되는 isResult 값은?true
		System.out.println(isResult);
		//
		
	}

}
