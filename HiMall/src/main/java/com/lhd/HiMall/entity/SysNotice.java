package com.lhd.HiMall.entity;

import java.util.Date;

public class SysNotice {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_notice.id
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_notice.title
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_notice.content
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_notice.createtime
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_notice.opername
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    private String opername;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_notice.id
     *
     * @return the value of sys_notice.id
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_notice.id
     *
     * @param id the value for sys_notice.id
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_notice.title
     *
     * @return the value of sys_notice.title
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_notice.title
     *
     * @param title the value for sys_notice.title
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_notice.content
     *
     * @return the value of sys_notice.content
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_notice.content
     *
     * @param content the value for sys_notice.content
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_notice.createtime
     *
     * @return the value of sys_notice.createtime
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_notice.createtime
     *
     * @param createtime the value for sys_notice.createtime
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_notice.opername
     *
     * @return the value of sys_notice.opername
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    public String getOpername() {
        return opername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_notice.opername
     *
     * @param opername the value for sys_notice.opername
     *
     * @mbg.generated Fri Feb 14 21:10:03 CST 2020
     */
    public void setOpername(String opername) {
        this.opername = opername == null ? null : opername.trim();
    }
}