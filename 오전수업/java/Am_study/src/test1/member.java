package test1;

public class member {
	
	public static int count;
	
	public String 아이디;
	public String 이름;
	public String 주소;
	public String 성별;
	
	public member() {}	// 생성자 메서드
	public member(String 아이디, String 이름, String 주소, String 성별) {
		this.성별=성별;
		this.아이디=아이디;
		this.이름=이름;
		this.주소=주소;
	}

	public void output() {
		System.out.println("아이디 : "+아이디+" 이름 : "+이름+" 성별 : "+성별+" 주소 : "+주소);
	}
}
	
/*
 * 자바 변수
 * 지역 변수 - 생성 : 선언{ 시작시 생성
 * 			 종료 : }종료시 종료
 * 인스턴스 변수 - 생성 : 클래스 객체 생성시
 * 				종료 : 클래스 객체 종료시
 * 클래스 변수 - 생성 : 프로그램 로드
 * 			   종료 : 프로그램 종료
*/
