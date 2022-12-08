package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.EmpVO;

@Mapper
public interface EmpMapper {

	/**
	 * @Since : 2022. 12. 7.
	 * @Author : jjangyoung
	 * @Return : List<EmpVO>
	 * @Comment : EMP,DEPT 테이블 조회
	 */
	List<EmpVO> selectEmp();
	
	public EmpVO selectEmpFindByEmpno(int empno);
	
	/**
	 * @Since : 2022. 12. 8.
	 * @Author : jjangyoung
	 * @Return : int
	 * @Comment : 사원정보추가
	 */
	int insertEmp(EmpVO vo);
	
	/**
	 * @Since : 2022. 12. 8.
	 * @Author : jjangyoung
	 * @Return : int
	 * @Comment : 사원정보수정
	 */
	int updateEmp(EmpVO vo);
	
	/**
	 * @Since : 2022. 12. 8.
	 * @Author : jjangyoung
	 * @Return : int
	 * @Comment : 사원삭제
	 */
	int deleteEmp(int empno);
}
