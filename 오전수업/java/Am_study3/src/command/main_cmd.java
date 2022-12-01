package command;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import DAO.venture_DAO;
import VO.venture;

public class main_cmd {

	public static void main(String[] args) {
		
		venture_DAO vdao = new venture_DAO();
		List<venture> list = vdao.Select_all();
		
		TreeSet<venture> sw = new TreeSet<>();
		TreeSet<venture> build = new TreeSet<>();
		
		Iterator<venture> it = list.iterator();
		while(it.hasNext()) {
			venture temp = it.next();
			if(temp.getCategory().contains("정보처리"))
				sw.add(temp);
			if(temp.getCategory().contains("건설"))
				build.add(temp);
		}
		String s = "정보처리기사";
		if(s.contains("정보처리")) {
			System.out.println("Ture");
		}
		else {
			System.out.println("False");
		}
		
//		System.out.println(sw);
		
		// TreeSet 메소드(검색)
		// floor(객체) - 지정된 객체와 같은 객체를 찾아서 반환 하거나, 없으면 작은값 중에서 가까운 객체 반환
		// headSet(객체) - 지정된 객체보다 작은 객체 모두 반환
		// tailSet(객체) - 지정된 객체보다 큰 객체 모두 반환
		// higher(객체) - 지정된 객체보다 큰 값을 가진 객체중에서 가장 가까운 객체, 없으면 null
		// lower(객체) - 지정된 객체보다 작은값을 가진 객체중에서 가장 가까운 객체, 없으면 null
		// subSet(객체1, 객체2) - 범위 검색, 객체1 부터 객체2 전까지 객체들 반환
		
		List<venture> sw_list = new ArrayList<>(sw);
		System.out.println( sw.floor(sw_list.get(5)));
		
		System.out.println( sw.headSet(sw_list.get(3)));
		System.out.println( sw.lower(sw_list.get(10)));
		
		System.out.println(sw.subSet(sw_list.get(2), sw_list.get(4)));
		
		venture srh = new venture();
		srh.setCompany("(주)고");
		sw.add(srh);
		System.out.println( sw.headSet(srh));
		// TreeSet 검색방법 - 이진트리 안에 저장되어있는 값 기준으로 검색
		// 이진트리 안에 저장되어있는 값은 객체의 주소 값이 저장 되어있다.
		// 검색시에 저장되어있는 순서에 의해서 결과값이 나온다.
		// 그러므로 위와 같이 검색하고자하는 회사이름을 따로 입력해서 객체를 생성하여 검색에 사용하는 방식은
		// TreeSet 안에 없는 값이기 때문에 검색이 이루어 지지않는다.
		
		
//		String a= "hot";
//		String b ="apple";
//		System.out.println(a.compareTo(b));
//		System.out.println(b.compareTo(a));
		
		
//		Set<String> category = new HashSet();
//		//set - 중복허용X
//		
//		Iterator<venture> it = list.iterator();
//		while(it.hasNext()) {
//			category.add(it.next().getCategory());
//		}
//		
//		Set<venture> retail = new HashSet<>();	// 도소매업
//		Set<venture> sw = new HashSet<>();	// 정보처리,SW
//		Set<venture> build = new HashSet<>();	//건설,운수
//		
//		it = list.iterator();
//		while(it.hasNext()) {
//			venture data = it.next();	// 벤처데이터들을 하나씩 data에 저장하기
//			if(data.getCategory().contains("도소매업"))
//				retail.add(data);
//			if(data.getCategory().contains("정보처리"))
//				sw.add(data);
//			if(data.getCategory().contains("건설"))
//				build.add(data);
//		}
//		System.out.println(sw.size());
//		
//		
//		
//		venture a = new venture(list.get(0).getNum(),list.get(0).getCompany(),list.get(0).getAddr(),
//				list.get(0).getCategory(),list.get(0).getBusiness_name(),list.get(0).getProduct());
//		
//		venture b = new venture(list.get(0).getNum(),list.get(0).getCompany(),list.get(0).getAddr(),
//				list.get(0).getCategory(),list.get(0).getBusiness_name(),list.get(0).getProduct());
//		
//		// 정보처리 집합과 도소매 집합의 차집합 구하기(주소 - addr 기준으로)
//		// 정보처리 집합과 도소매 집합의 교집합 구하기(주소 - addr 기준으로)
//		
//		Set<venture> cha = new HashSet<>();
//		Set<venture> gyo = new HashSet<>();
//		
//		Iterator<venture> gp = sw.iterator();
//		while(gp.hasNext()) { // 차집합
//			venture temp = gp.next();
//			if(retail.contains(temp))
//				continue;
//			cha.add(temp);
//		}
//		List<venture> cha_list = new ArrayList<>(cha);
//		System.out.println(cha_list.size());
//		for(venture tmp : cha_list)
//			System.out.println(tmp);
//		
//		gp = sw.iterator(); // 교집합
//		while(gp.hasNext()) {
//			venture temp = gp.next();
//			if(retail.contains(temp))
//				gyo.add(temp);
//		}
//		
//		
//		if(list.contains(b))
//			System.out.println("있다.");
//		else
//			System.out.println("없다.");
//		if(list.contains(a))
//			System.out.println("있다");
//		else
//			System.out.println("없다");
		
//		if(a.equals(b))
//			System.out.println("같다");
//		else
//			System.out.println("다르다");
		
		//차집합,교집합,합집합
		// 주소를 기준으로 ...
		
//		Set<String> name1 = new HashSet<>();
//		Set<String> name2 = new HashSet<>();
//		
//		name1.add("김유신"); name1.add("이순신"); name1.add("김춘추");
//		name1.add("장영주"); name1.add("김기원"); name1.add("윤재영");
//		name1.add("이지현"); name1.add("미지연"); name1.add("최윤도");
//		
//		name2.add("김민정"); name2.add("김미넛"); name2.add("김춘추");
//		name2.add("장영주"); name2.add("이종빈"); name2.add("윤재영");
//		name2.add("이지현"); name2.add("변크리스탈"); name2.add("하정수");
//		
//		HashSet<String> hab = new HashSet<>();
//		HashSet<String> cha = new HashSet<>();
//		HashSet<String> gyo = new HashSet<>();
//
//		Iterator<String> test = name1.iterator();
//		while(test.hasNext()) {	// name1의 데이터를 hab에 저장
//			hab.add(test.next());
//		}
//		test = name2.iterator();
//		while(test.hasNext()) {	// name2의 데이터를 hab에 있는지 비교하여 없으면 저장
//			String name = test.next();
//			if(hab.contains(name))	// hab 내부에 name 값이 있는가?
//				continue;
//			hab.add(name);
//		}
//		
//		System.out.println(hab);
//		
//		test = name2.iterator();
//		while(test.hasNext()) {
//			String name = test.next();
//			if(name1.contains(name))
//				gyo.add(name);
//		}
//		System.out.println(gyo);
//		
//		test = name2.iterator();
//		while(test.hasNext()) {	//name2의 데이터를 name1에 있는지 비교하여 없으면 저장
//			String name = test.next();
//			if(name1.contains(name))
//				continue;	// name1 내부에 name2를 제외한 나머지
//				cha.add(name);
//		}
//		System.out.println(cha);
	}
}


//package command;
//
//import java.util.List;
//
//import DAO.venture_DAO;
//import VO.venture;
//
//public class main_cmd {
//	private static venture_DAO vdao = new venture_DAO();
//
//	public static void main(String[] args) {
//		
//		List<venture> list = vdao.Select_all();
//		for( int i=0;i<list.size(); i++) {
//			System.out.println(list.get(i).getNum()+list.get(i).getCompany()+
//					list.get(i).getAddr()+list.get(i).getCategory()+list.get(i).getBusiness_name()+
//					list.get(i).getProduct());
//		}
//	}
//}
