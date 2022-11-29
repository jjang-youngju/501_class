package movie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import test1.member;

public class movie_main {

	public static void main(String[] args) {
		
		List<movieVo> list = new ArrayList<>();
		
		String path = "c:/test/movie.txt";
		
		try {			
			BufferedReader file = new BufferedReader(new FileReader(path));
			
			while(true) {
				String line = file.readLine();
				if(line == null) break;
				System.out.println(line);
				String[] temp = line.split(" ");
				movieVo data = new movieVo(temp[0],
						Integer.parseInt(temp[1]),Integer.parseInt(temp[2]));
				list.add(data);
			}
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println("파일없다");
		}
		
		for(movieVo data : list)
			System.out.println( data.toString() );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		movieVo mv1 = new movieVo(null, 0, null);
		
		mv1.title="데시벨";
		mv1.year=2022;
		mv1.grade="12세관람가";
		
		mv1.output();
		
		movieVo mv2 = new movieVo(null, 0, null);
		
		mv2.title="블랙 팬서: 와칸다 포에버";
		mv2.year=2022;
		mv2.grade="12세관람가";
		
		mv2.output();
		
		movieVo mv3 = new movieVo(null, 0, null);
		
		mv3.title="자백";
		mv3.year=2022;
		mv3.grade="15세관람가";
		
		mv3.output();
		
		movieVo mv4 = new movieVo(null, 0, null);
		
		mv4.title="극장판 짱구는 못말려:수수께끼! 꽃피는 천하 떡잎학교";
		mv4.year=2022;
		mv4.grade="전체관람가";
		
		mv4.output();
	}
	static void output(movieVo mv) {
		System.out.println("영화제목 : "+mv.title+" 개봉년도 : "+mv.year+" 관람등급 : "+mv.grade);
	}
	
		movieVo[] arr = new movieVo[4];
		arr[0] = new movieVo("한산",2022,"15세이상관람가");
		arr[1] = new movieVo("한산",2022,"15세이상관람가");
		arr[2] = new movieVo("한산",2022,"15세이상관람가");
		arr[3] = new movieVo("한산",2022,"15세이상관람가");
		
		for(movieVo data : arr)
			data.output();
			*/
	}
}
/*
 * 	영화 총 4개 입력하여 출력까지
 */
