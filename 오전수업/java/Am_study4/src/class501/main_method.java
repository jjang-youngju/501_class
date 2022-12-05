package class501;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Scanner;

public class main_method {
	
	public static Map<String,ban_active> map = new HashMap<>();
	public static void init() {
//		ResourceBundle rb = ResourceBundle.getBundle("ban");
		//ResourceBundle은 prop 파일 읽어들일때 주로 사용
		// 웹에서 bundle의 사용처는 접속한 local(국가)에 따라 언어별 페이지 보여줄때 사용되기도 함.
		// collection을 순차적으로 접근하며 사용하기위한 인터페이스 iterator
		// prop은 컬렉션 이전에 나온 녀석이라서 iterator 사용불가
		// prop은 enumeration 사용
//		Enumeration key = rb.getKeys(); // prop파일에서 key만 가져온다.
		
		Properties prop = new Properties();
		try(FileReader fr = new FileReader("C:\\JAVA\\Am_study4\\src\\class501\\ban.properties")) {
			prop.load(fr);
		}catch(Exception e) {
			e.printStackTrace();
		}
		Iterator key = prop.keySet().iterator();
		
		while(key.hasNext()) {
			String cmd = (String)key.next(); // prop파일의 key 하나씩 cmd에 저장
			String val = prop.getProperty(cmd); // 키를 입력하여 value 구하여 val에 저장
			// 문자열을 클래스화 시키기
			System.out.println(val);
			try {
				Class<?> hclass = Class.forName(val); // Class.forName("class501.computer"); 
				ban_active ban = (ban_active)hclass.newInstance();
				map.put(cmd, ban);// prop의 키를 map의 키로 저장, prop의 value로 저장
			}catch(ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		init();
		System.out.println("이동할 페이지 입력 : ");
		System.out.println("computer  chair  desk  people  moniter  ");
		String page = new Scanner(System.in).nextLine();
		page += ".html";	// map의 키로 구성하기
		
		ban_active pg = map.get(page);	// 키를 입력하여 해당 value 구하기
		
		pg.action(page);
		
	}

}

// 서로 다른 클래스의 객체를 실행하기 위해 인터페이스로 배열로 만들어 실행 시켰다. ( 주문 하는 거 만들때 )
//