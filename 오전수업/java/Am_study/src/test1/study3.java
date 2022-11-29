package test1;

public class study3 {

	public static void main(String[] args) {
		// 이름, 연락처, 주소, 생년월일, 성별, 아이디
		// 회원정보 저장하기
		
		member m1= new member(); // new 연산자를 통해 member클래스의 공간을 메모리에 생성
		//m1은 참조변수라고 한다. 참조변수는 메모리 주소를 저장할수 있는 변수를 참조변수라고 한다.
		
		System.out.println(m1);
		
		m1.성별="여자";
		m1.아이디="limit";
		m1.이름="이순자";
		m1.주소="대전 중구 선화동";
		
		//System.out.println("아이디 : "+m1.아이디+" 이름 : "+m1.이름+" 성별 : "+m1.성별+" 주소 : "+m1.주소);
		//output(m1);
		m1.output();
		
		member m2 = new member();
		
		m2.성별="남자";
		m2.아이디="eternal";
		m2.이름="장보고";
		m2.주소="대전 동구 가양동";
		
		m2.output();
		//output(m2);
		//System.out.println("아이디 : "+m2.아이디+" 이름 : "+m2.이름+" 성별 : "+m2.성별+" 주소 : "+m2.주소);
	}
	
	static void output(member m) {
		System.out.println("아이디 : "+m.아이디+" 이름 : "+m.이름+" 성별 : "+m.성별+" 주소 : "+m.주소);
	}

}

/*
 * member 클래스는 지금 study3 클래스와 같은 패키지안에 있는 클래스이기 때문에 import 안해도 된다.
 * 만약 member클래스가 study3 클래스와 다른 패키지에 있다면 import 해야한다.
 */

/*
struct member{
	String 이름;
	String 연락처;
	String 주소;
	String 성별;
	String id;
	int 생년월일;
	int age;
	
	void getAge() {
		age = 생년월일 계산하여 나이 구하기;
	}
}

member m1;
m1.age = getAge(m1.생년월일);

int getAge(int birth) {
	생년월일 계산하여 나이구하기
	return 계산결과
}

m1.getAge();
*/
