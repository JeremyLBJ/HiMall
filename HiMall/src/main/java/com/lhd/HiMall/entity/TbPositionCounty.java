package com.lhd.HiMall.entity;

public class TbPositionCounty {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_position_county.id
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_position_county.city_id
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    private Long cityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_position_county.county_id
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    private Long countyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_position_county.county_name
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    private String countyName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_position_county.short_county_id
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    private Long shortCountyId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_position_county.id
     *
     * @return the value of tb_position_county.id
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_position_county.id
     *
     * @param id the value for tb_position_county.id
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_position_county.city_id
     *
     * @return the value of tb_position_county.city_id
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public Long getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_position_county.city_id
     *
     * @param cityId the value for tb_position_county.city_id
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_position_county.county_id
     *
     * @return the value of tb_position_county.county_id
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public Long getCountyId() {
        return countyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_position_county.county_id
     *
     * @param countyId the value for tb_position_county.county_id
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_position_county.county_name
     *
     * @return the value of tb_position_county.county_name
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_position_county.county_name
     *
     * @param countyName the value for tb_position_county.county_name
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public void setCountyName(String countyName) {
        this.countyName = countyName == null ? null : countyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_position_county.short_county_id
     *
     * @return the value of tb_position_county.short_county_id
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public Long getShortCountyId() {
        return shortCountyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_position_county.short_county_id
     *
     * @param shortCountyId the value for tb_position_county.short_county_id
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public void setShortCountyId(Long shortCountyId) {
        this.shortCountyId = shortCountyId;
    }
}