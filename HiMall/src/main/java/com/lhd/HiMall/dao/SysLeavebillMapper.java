package com.lhd.HiMall.dao;

import com.lhd.HiMall.entity.SysLeavebill;
import com.lhd.HiMall.entity.SysLeavebillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLeavebillMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_leavebill
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    long countByExample(SysLeavebillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_leavebill
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    int deleteByExample(SysLeavebillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_leavebill
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_leavebill
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    int insert(SysLeavebill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_leavebill
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    int insertSelective(SysLeavebill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_leavebill
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    List<SysLeavebill> selectByExample(SysLeavebillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_leavebill
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    SysLeavebill selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_leavebill
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    int updateByExampleSelective(@Param("record") SysLeavebill record, @Param("example") SysLeavebillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_leavebill
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    int updateByExample(@Param("record") SysLeavebill record, @Param("example") SysLeavebillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_leavebill
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    int updateByPrimaryKeySelective(SysLeavebill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_leavebill
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    int updateByPrimaryKey(SysLeavebill record);
}