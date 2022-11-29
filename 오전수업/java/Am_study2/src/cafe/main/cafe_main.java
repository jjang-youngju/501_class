package cafe.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import cafe.VO.member;
import cafe.control.event;
import cafe.control.exit;
import cafe.control.login;
import cafe.control.menu_able;
import cafe.control.myinfo;
import cafe.control.order;
import cafe.control.signin;

//import cafe.control.event;
//import cafe.control.login;
//import cafe.control.order;

public class cafe_main {

	static Scanner sc = new Scanner(System.in);
	public static member user = null;
	
	public static void main(String[] args) {
		
		menu_able[] menu = {new order(), new myinfo(), new login(), new event(), new signin(), new exit()};
		
//		order o = new order();
//		login l = new login();
//		event e = new event();

		while(menu[main_menu()-1].menu_active());	
			
//			switch(main_menu()) {
//			case 1:	// 주문
//				//o.메소드();
//				break;
//			case 2:	// 로그인
//				//l.메소드();
//				break;
//			case 3:	// 이벤트확인
//				//e.메소드();
//				break;
//			case 4:	// 회원가입
//				break;
//			case 5:	// 종료
//				return;
//			}

	}
	
	public static int main_menu() {// 클래스 메소드 - 클래스 메소드에서만 사용
		
		int select=0;
		
		String[] menu = {"주문","내정보","로그인","이벤트","회원가입","종료"};
		try {
			for(int i=1;i<=menu.length;i++) {
				if(user!=null &&(i==4||i==5))
					continue;
				System.out.println(i+". "+menu[i-1]);
			}
//		try {
//			System.out.println(" 1. 주문 ");
//			System.out.println(" 2. 로그인 ");
//			System.out.println(" 3. 이벤트 ");
//			System.out.println(" 4. 회원가입 ");
//			System.out.println(" 5. 종료 ");
			System.out.print(" 선택 : ");
			select = sc.nextInt();
			if(select < 1 || select > 5)
//				return select;
			
				throw new InputMismatchException("잘못입력했습니다");
		}catch(Exception e) {
			System.out.println( e.getMessage() );
			sc.nextLine();
			select = main_menu();
		}
		return select;
	}
		
//		int select=0;
//		try {
//			select = select_menu();
//			if(select < 1 || select > 5)
//				return select;
//			else throw new InputMismatchException("잘못입력했습니다");
//		}catch(Exception e) {
//			System.out.println( e.getMessage() );
//			select = select_menu();
//		}
//		return select;
//	}
//	private static int select_menu() {
//	
//		System.out.println(" 1. 주문 ");
//		System.out.println(" 2. 로그인 ");
//		System.out.println(" 3. 이벤트 ");
//		System.out.println(" 4. 회원가입 ");
//		System.out.println(" 5. 종료 ");
//		System.out.print(" 선택 : ");
//		return sc.nextInt();
//	}
		
//		do {
//			try {
//				
//				System.out.println(" 1. 주문 ");
//				System.out.println(" 2. 로그인 ");
//				System.out.println(" 3. 이벤트 ");
//				System.out.println(" 4. 회원가입 ");
//				System.out.println(" 5. 종료 ");
//				System.out.print(" 선택 : ");
//				int select = sc.nextInt();
//				if(select >= 1 && select <= 5)
//					return select;
//				else throw new InputMismatchException("잘못입력했습니다"); //throw 강제로 오류내는
//			}catch(Exception e) {
//				System.out.println( e.getMessage() );
//			}
//		}while();
		
	}


