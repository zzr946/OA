package com.lsl.manager.mapper;

import com.lsl.manager.model.Record;
import com.lsl.manager.model.RecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recordTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    long countByExample(RecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recordTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    int deleteByExample(RecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recordTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recordTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    int insert(Record record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recordTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    int insertSelective(Record record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recordTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    List<Record> selectByExampleWithRowbounds(RecordExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recordTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    List<Record> selectByExample(RecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recordTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    Record selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recordTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    int updateByExampleSelective(@Param("record") Record record, @Param("example") RecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recordTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    int updateByExample(@Param("record") Record record, @Param("example") RecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recordTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(Record record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recordTb
     *
     * @mbg.generated Fri Jan 17 22:18:01 GMT+08:00 2020
     */
    int updateByPrimaryKey(Record record);
}