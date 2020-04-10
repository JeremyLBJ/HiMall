package com.lhd.HiMall.dao;

import com.lhd.HiMall.entity.Clothessize;
import com.lhd.HiMall.entity.ClothessizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClothessizeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clothessize
     *
     * @mbg.generated Mon Apr 06 10:14:03 CST 2020
     */
    long countByExample(ClothessizeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clothessize
     *
     * @mbg.generated Mon Apr 06 10:14:03 CST 2020
     */
    int deleteByExample(ClothessizeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clothessize
     *
     * @mbg.generated Mon Apr 06 10:14:03 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clothessize
     *
     * @mbg.generated Mon Apr 06 10:14:03 CST 2020
     */
    int insert(Clothessize record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clothessize
     *
     * @mbg.generated Mon Apr 06 10:14:03 CST 2020
     */
    int insertSelective(Clothessize record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clothessize
     *
     * @mbg.generated Mon Apr 06 10:14:03 CST 2020
     */
    List<Clothessize> selectByExample(ClothessizeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clothessize
     *
     * @mbg.generated Mon Apr 06 10:14:03 CST 2020
     */
    Clothessize selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clothessize
     *
     * @mbg.generated Mon Apr 06 10:14:03 CST 2020
     */
    int updateByExampleSelective(@Param("record") Clothessize record, @Param("example") ClothessizeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clothessize
     *
     * @mbg.generated Mon Apr 06 10:14:03 CST 2020
     */
    int updateByExample(@Param("record") Clothessize record, @Param("example") ClothessizeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clothessize
     *
     * @mbg.generated Mon Apr 06 10:14:03 CST 2020
     */
    int updateByPrimaryKeySelective(Clothessize record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clothessize
     *
     * @mbg.generated Mon Apr 06 10:14:03 CST 2020
     */
    int updateByPrimaryKey(Clothessize record);
}