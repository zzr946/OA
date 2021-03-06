package com.lsl.manager.mapper;

import com.lsl.manager.model.Salary;
import com.lsl.manager.model.SalaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SalaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaryTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    long countByExample(SalaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaryTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    int deleteByExample(SalaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaryTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaryTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    int insert(Salary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaryTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    int insertSelective(Salary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaryTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    List<Salary> selectByExampleWithRowbounds(SalaryExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaryTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    List<Salary> selectByExample(SalaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaryTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    Salary selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaryTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    int updateByExampleSelective(@Param("record") Salary record, @Param("example") SalaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaryTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    int updateByExample(@Param("record") Salary record, @Param("example") SalaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaryTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(Salary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salaryTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    int updateByPrimaryKey(Salary record);
}