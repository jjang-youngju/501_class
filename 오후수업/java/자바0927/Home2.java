package 자바0927;

public class Home2 {

	public static void main(String[] args) {
		
		영화관 a영화관 = new 영화관();
		a영화관.직원수 = 20;
		a영화관.영화관위치 = "대전 둔산동";
		a영화관.영화관이름 = "CGV 둔산점";
		a영화관.개봉영화종류 = 
				new String[] {"늑대사냥","공조2: 인터네셔날", "아바타 리마스터링"};
		System.out.println("직원 수 : "+a영화관.직원수);
		System.out.println("영화관 위치 : "+a영화관.영화관위치);
		System.out.println("영화관 이름 : "+a영화관.영화관이름);
		System.out.println("개봉영화 종류 : "+a영화관.개봉영화종류[0]);
		
		영화관 b영화관 = new 영화관();
		b영화관.직원수 = 300;
		b영화관.영화관위치 = "대전 용전동";
		b영화관.영화관이름 = "CGV 대전터미널점";
		b영화관.개봉영화종류 = 
				new String[] {"헤어질결심","한산", "토이스토리버즈"};
		System.out.println("직원 수 : "+b영화관.직원수);
		System.out.println("영화관 위치 : "+b영화관.영화관위치);
		System.out.println("영화관 이름 : "+b영화관.영화관이름);
		System.out.println("개봉영화 종류 : "+b영화관.개봉영화종류[0]);
	}	
}
	
