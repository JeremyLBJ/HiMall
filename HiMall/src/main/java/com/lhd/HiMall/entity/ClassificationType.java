package com.lhd.HiMall.entity;

import java.util.List;


public class ClassificationType {
	
	
	/**
	 * 商品详情
	 */
	private List<ClassificationofGoodsItem> classificationofGoodsItem ;
	
   
    private Integer id;

   
    private Integer ctionfId;

    
    private String name;

    
    public List<ClassificationofGoodsItem> getClassificationofGoodsItem() {
		return classificationofGoodsItem;
	}

	public void setClassificationofGoodsItem(List<ClassificationofGoodsItem> classificationofGoodsItem) {
		this.classificationofGoodsItem = classificationofGoodsItem;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_type.id
     *
     * @return the value of classification_type.id
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_type.id
     *
     * @param id the value for classification_type.id
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_type.cTionf_id
     *
     * @return the value of classification_type.cTionf_id
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public Integer getCtionfId() {
        return ctionfId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_type.cTionf_id
     *
     * @param ctionfId the value for classification_type.cTionf_id
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public void setCtionfId(Integer ctionfId) {
        this.ctionfId = ctionfId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classification_type.name
     *
     * @return the value of classification_type.name
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classification_type.name
     *
     * @param name the value for classification_type.name
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

	@Override
	public String toString() {
		return "ClassificationType [classificationofGoodsItem=" + classificationofGoodsItem + ", id=" + id
				+ ", ctionfId=" + ctionfId + ", name=" + name + "]";
	}
    
    
}