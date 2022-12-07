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
}
