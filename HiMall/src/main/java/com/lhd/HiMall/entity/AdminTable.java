package com.lhd.HiMall.entity;

public class AdminTable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_table.id
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_table.username
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_table.password
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_table.tel
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin_table.orderNo
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    private String orderno;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_table.id
     *
     * @return the value of admin_table.id
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_table.id
     *
     * @param id the value for admin_table.id
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_table.username
     *
     * @return the value of admin_table.username
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_table.username
     *
     * @param username the value for admin_table.username
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_table.password
     *
     * @return the value of admin_table.password
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_table.password
     *
     * @param password the value for admin_table.password
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_table.tel
     *
     * @return the value of admin_table.tel
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_table.tel
     *
     * @param tel the value for admin_table.tel
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin_table.orderNo
     *
     * @return the value of admin_table.orderNo
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public String getOrderno() {
        return orderno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin_table.orderNo
     *
     * @param orderno the value for admin_table.orderNo
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }
}