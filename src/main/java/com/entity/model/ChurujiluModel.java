package com.entity.model;

import com.entity.ChurujiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 出入记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChurujiluModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 类型
     */
    private Integer churujiluTypes;


    /**
     * 健康码
     */
    private String churujiluPhoto;


    /**
     * 备注
     */
    private String churujiluContent;


    /**
     * 出入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date churuTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：类型
	 */
    public Integer getChurujiluTypes() {
        return churujiluTypes;
    }


    /**
	 * 设置：类型
	 */
    public void setChurujiluTypes(Integer churujiluTypes) {
        this.churujiluTypes = churujiluTypes;
    }
    /**
	 * 获取：健康码
	 */
    public String getChurujiluPhoto() {
        return churujiluPhoto;
    }


    /**
	 * 设置：健康码
	 */
    public void setChurujiluPhoto(String churujiluPhoto) {
        this.churujiluPhoto = churujiluPhoto;
    }
    /**
	 * 获取：备注
	 */
    public String getChurujiluContent() {
        return churujiluContent;
    }


    /**
	 * 设置：备注
	 */
    public void setChurujiluContent(String churujiluContent) {
        this.churujiluContent = churujiluContent;
    }
    /**
	 * 获取：出入时间
	 */
    public Date getChuruTime() {
        return churuTime;
    }


    /**
	 * 设置：出入时间
	 */
    public void setChuruTime(Date churuTime) {
        this.churuTime = churuTime;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
