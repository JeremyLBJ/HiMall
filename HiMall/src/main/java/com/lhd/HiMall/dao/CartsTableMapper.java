package com.lhd.HiMall.dao;

import com.lhd.HiMall.entity.CartsTable;
import com.lhd.HiMall.entity.CartsTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartsTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carts_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    long countByExample(CartsTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carts_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int deleteByExample(CartsTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carts_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carts_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int insert(CartsTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carts_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int insertSelective(CartsTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carts_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    List<CartsTable> selectByExample(CartsTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carts_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    CartsTable selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carts_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByExampleSelective(@Param("record") CartsTable record, @Param("example") CartsTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carts_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByExample(@Param("record") CartsTable record, @Param("example") CartsTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carts_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByPrimaryKeySelective(CartsTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carts_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByPrimaryKey(CartsTable record);
}