package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.vo.Movie;

@Service
public class ApiService {
//업무분담시 파트 나눌때 유용
//window -> preference -> code templates -> edit template -> 내용수정 
//	-> 설정완료후 메소드이름 클릭하고 "Alt + shift +j"누르기

   /**
 * @Since : 2022. 11. 28.
 * @Author : jjangyoung
 * @Return : List<Movie>
 * @Comment :
 */
public List<Movie> makeMovie(){
      List<Movie> list = new ArrayList<Movie>();
      
      Movie movie = new Movie();
         movie.setTitle("Just Friends");
         movie.setYear("2005년");
         movie.setRuntime("96 min");
         movie.setGenre("Comedy, Romance");
         
       Movie movie2 = new Movie();
         movie2.setTitle("Nope");
         movie2.setYear("2022년");
         movie2.setRuntime("130min");
         movie2.setGenre("Horror");
       
        Movie movie3 = new Movie();
         movie3.setTitle("Toy Story");
         movie3.setYear("2019년");
         movie3.setRuntime("100 min");
         movie3.setGenre("Animation");
       
         list.add(movie);
         list.add(movie2);
         list.add(movie3);
       
       return list;
      
   }
}