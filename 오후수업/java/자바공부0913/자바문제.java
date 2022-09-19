package 자바공부0913;

public class 자바문제 {

	public static void main(String[] args) {
		
		String name[] = {"brian","Kim"};
		/*
		 * 문제) 배열 name에 있는 원소(element)중 "Kim"의 위치를 찾아
		 * "Kim"은 x에 있습니다." 출력나오게 로직 구현하기.
		 * 정답) Kim은 배열 1번 째에 있으므로 "Kim은 1번에 있습니다." 정답입니다.
		 * hint) 오늘배운 equals와 for문을 이용해서 풀것!
		 */
		
		//방법1.
		for(int i=0;i<name.length;i++) {
			boolean isCheck = name[i].equals("Kim");
			if(isCheck == true) {
				System.out.println("Kim은"+i+"번에 있습니다.");
				break;
			}
		}
		
		// 방법2.( 쌤이 선호하는 방법)
		for(int i=0;i<name.length;i++) {
			if(name[i].equals("Kim")) {
			System.out.println("Kim은"+i+"번에 있습니다.");
			break;
			}
		}
		
		
		/*
		 * 문제2) 홍길동 번호는 010-3333-9999입니다. 길동이는 개인정보 유출을 생각해
		 * 핸드폰 번호를 010-****-****로 보이게 하고 싶습니다.
		 * 010-3333-9999 -> 010-****-**** 변경하고 출력하시오
		 * hint) 오늘배운 split과 for문을 이용해서 풀것!
		 */
		
		//방법1.
		String 핸드폰번호 = "010-3333-9999"; //010=>0번째, 3333=>1번째, 9999=>2번째
		String array[] = 핸드폰번호.split("-"); //-를 기준으로 나눔
		for(int i=1;i<3;i++) { 
			array[i] = "****";
			System.out.println(array[i]);
		}
		String 결과 = array[0]+"-"+array[1]+"-"+array[2];
		System.out.println(결과);
		
	}
}
