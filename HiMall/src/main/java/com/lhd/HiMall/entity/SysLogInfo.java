package com.lhd.HiMall.entity;

import java.util.Date;

public class SysLogInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log_info.id
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log_info.loginname
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    private String loginname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log_info.loginip
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    private String loginip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log_info.logintime
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    private Date logintime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log_info.id
     *
     * @return the value of sys_log_info.id
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log_info.id
     *
     * @param id the value for sys_log_info.id
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log_info.loginname
     *
     * @return the value of sys_log_info.loginname
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log_info.loginname
     *
     * @param loginname the value for sys_log_info.loginname
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log_info.loginip
     *
     * @return the value of sys_log_info.loginip
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    public String getLoginip() {
        return loginip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log_info.loginip
     *
     * @param loginip the value for sys_log_info.loginip
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log_info.logintime
     *
     * @return the value of sys_log_info.logintime
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    public Date getLogintime() {
        return logintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log_info.logintime
     *
     * @param logintime the value for sys_log_info.logintime
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }
}