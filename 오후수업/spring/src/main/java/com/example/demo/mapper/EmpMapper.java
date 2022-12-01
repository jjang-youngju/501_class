package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.DeptVO;
import com.example.demo.vo.EmpVO;

/*
 * 추상클래스와 인터페이스의 차이점
 * 인터페이스 : 메소드 정의
 * 추상클래스 : 정의, 구현 가능
 */

@Mapper
public interface EmpMapper {

	/**
	 * @Since : 2022. 11. 28.
	 * @Author : jjangyoung
	 * @Return : List<EmpVo>
	 * @Comment : EMP 테이블 전체 조회
	 */
	List<EmpVO> selectEmp(); //메소드 정의
	
	/**
	 * @Since : 2022. 11. 29.
	 * @Author : jjangyoung
	 * @Return : List<DeptVO>
	 * @Comment : Dept 테이블 전체 조회
	 */
	List<DeptVO> selectDept();
	
	int insertEmp(EmpVO vo);
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : jjangyoung
	 * @Return : int
	 * @Comment : 사원 삭제
	 */
	int deleteEmp(int empno); // 하나만 필요할때는 객체를 넘겨줄 필요가 없다.
	
	int insertDept(DeptVO vo);
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : jjangyoung
	 * @Return : int
	 * @Comment : 부서 삭제
	 */
	int deleteDept(int deptno);
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : jjangyoung
	 * @Return : int
	 * @Comment : 사원정보수정
	 */
	int updateEmp(EmpVO vo);
	
	/**
	 * @Since : 2022. 12. 1.
	 * @Author : jjangyoung
	 * @Return : int
	 * @Comment : 부서정보수정
	 */
	int updateDept(DeptVO vo);
}
