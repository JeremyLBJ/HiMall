package com.lhd.HiMall.dao;

import com.lhd.HiMall.entity.Classificationofgoods;
import com.lhd.HiMall.entity.ClassificationofgoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassificationofgoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classificationofgoods
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    long countByExample(ClassificationofgoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classificationofgoods
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int deleteByExample(ClassificationofgoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classificationofgoods
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classificationofgoods
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int insert(Classificationofgoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classificationofgoods
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int insertSelective(Classificationofgoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classificationofgoods
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    List<Classificationofgoods> selectByExample(ClassificationofgoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classificationofgoods
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    Classificationofgoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classificationofgoods
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByExampleSelective(@Param("record") Classificationofgoods record, @Param("example") ClassificationofgoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classificationofgoods
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByExample(@Param("record") Classificationofgoods record, @Param("example") ClassificationofgoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classificationofgoods
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByPrimaryKeySelective(Classificationofgoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classificationofgoods
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByPrimaryKey(Classificationofgoods record);
}