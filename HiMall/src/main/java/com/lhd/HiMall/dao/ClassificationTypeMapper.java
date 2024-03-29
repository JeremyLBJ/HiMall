package com.lhd.HiMall.dao;

import com.lhd.HiMall.entity.ClassificationType;
import com.lhd.HiMall.entity.ClassificationTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassificationTypeMapper {
	
	ClassificationType queryByCid ( @Param("cid") Integer cid ) ;
	
	List<Integer> queryIds ( @Param("id") Integer id ) ;
	
	List<ClassificationType> queryDate ( @Param("id") Integer id , @Param("name") String name ) ;
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification_type
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    long countByExample(ClassificationTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification_type
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int deleteByExample(ClassificationTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification_type
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification_type
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int insert(ClassificationType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification_type
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int insertSelective(ClassificationType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification_type
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    List<ClassificationType> selectByExample(ClassificationTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification_type
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    ClassificationType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification_type
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByExampleSelective(@Param("record") ClassificationType record, @Param("example") ClassificationTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification_type
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByExample(@Param("record") ClassificationType record, @Param("example") ClassificationTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification_type
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByPrimaryKeySelective(ClassificationType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table classification_type
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByPrimaryKey(ClassificationType record);
}