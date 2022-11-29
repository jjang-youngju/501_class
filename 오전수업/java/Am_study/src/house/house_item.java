package house;

public abstract class house_item {
		public String brand;
		public int price;
	
	public house_item() { // 생성자 메소드, 메소드의 실행은 반드시 메소드 명으로 실행이 되어야 한다.
	
	}
	
	public house_item(String brand, int price) {
		this.brand = brand;
		this.price = price; 	//this는 현재 생성되는 객체이다.
	}
	
	@Override
	public String toString() {
		return "브랜드 : "+brand+" 금액 : "+price;
	}
	
	public abstract void buy(); // 추상메소드
	
}


/*
 * 추상클래스는 추상메소드를 가질수 있다.
 * 추상클래스는 객체 생성이 불가능하다.
 */

/*
 * public boolean onoff;
	public String brand;
	public int price;
	
	public house_item() { // 생성자 메소드, 메소드의 실행은 반드시 메소드 명으로 실행이 되어야 한다.
		onoff=false;
	}
	
	public house_item(String brand, int price) {
		this.brand = brand;
		this.price = price; 	//this는 현재 생성되는 객체이다.
	}
	
	@Override
	public String toString() {
		return "브랜드 : "+brand+" 금액 : "+price;
	}
	
	public void power() {
		onoff = !onoff;
		if(onoff)
			System.out.println("전원 on");
		else
			System.out.println("전원 off");
	}
*/
