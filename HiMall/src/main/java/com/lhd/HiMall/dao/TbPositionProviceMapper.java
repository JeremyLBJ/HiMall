package com.lhd.HiMall.dao;

import com.lhd.HiMall.entity.TbPositionProvice;
import com.lhd.HiMall.entity.TbPositionProviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPositionProviceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_provice
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    long countByExample(TbPositionProviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_provice
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int deleteByExample(TbPositionProviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_provice
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_provice
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int insert(TbPositionProvice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_provice
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int insertSelective(TbPositionProvice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_provice
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    List<TbPositionProvice> selectByExample(TbPositionProviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_provice
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    TbPositionProvice selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_provice
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbPositionProvice record, @Param("example") TbPositionProviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_provice
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByExample(@Param("record") TbPositionProvice record, @Param("example") TbPositionProviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_provice
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByPrimaryKeySelective(TbPositionProvice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_provice
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByPrimaryKey(TbPositionProvice record);
}