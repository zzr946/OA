package com.lsl.manager.mapper;

import com.lsl.manager.model.Department;
import com.lsl.manager.model.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DepartmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbg.generated Tue Jan 28 17:05:47 GMT+08:00 2020
     */
    long countByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbg.generated Tue Jan 28 17:05:47 GMT+08:00 2020
     */
    int deleteByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbg.generated Tue Jan 28 17:05:47 GMT+08:00 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbg.generated Tue Jan 28 17:05:47 GMT+08:00 2020
     */
    int insert(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbg.generated Tue Jan 28 17:05:47 GMT+08:00 2020
     */
    int insertSelective(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbg.generated Tue Jan 28 17:05:47 GMT+08:00 2020
     */
    List<Department> selectByExampleWithRowbounds(DepartmentExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbg.generated Tue Jan 28 17:05:47 GMT+08:00 2020
     */
    List<Department> selectByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbg.generated Tue Jan 28 17:05:47 GMT+08:00 2020
     */
    Department selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbg.generated Tue Jan 28 17:05:47 GMT+08:00 2020
     */
    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbg.generated Tue Jan 28 17:05:47 GMT+08:00 2020
     */
    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbg.generated Tue Jan 28 17:05:47 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table department
     *
     * @mbg.generated Tue Jan 28 17:05:47 GMT+08:00 2020
     */
    int updateByPrimaryKey(Department record);
}