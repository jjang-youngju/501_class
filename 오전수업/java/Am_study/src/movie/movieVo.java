package movie;

public class movieVo {

	private String title;
	private int year;
	private int grade;
	
	//movieVo(){}
	public movieVo(String title, int year, int grade){
		this.title = title;
		this.year = year;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "영화제목 :"+title+", 개봉년도 : "+year+", 관람등급 : "+grade+"세이상";
	}
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public int getGrade() {
		return grade;
	}



	public void setGrade(int grade) {
		this.grade = grade;
	}



	public void output() {
		System.out.println("영화제목 : "+title+", 개봉년도 : "+year+", 관람등급 : "+grade);
	}
}
/*
 * 	영화제목, 개봉년도, 관람등급
 * 	
 * 생성자 메소드를 통해 데이터 저장가능하게 만들기
 * 	출력 메소드 (제목, 년도, 등급 출력되어야함)
 */