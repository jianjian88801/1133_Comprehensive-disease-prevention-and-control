package com.entity.model;

import com.entity.JiezhongjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 接种记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiezhongjiluModel implements Serializable {
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
     * 接种编号
     */
    private String jiezhongjiluUuidNumber;


    /**
     * 接种时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jiezhongTime;


    /**
     * 接种类型
     */
    private Integer jiezhongTypes;


    /**
     * 备注
     */
    private String jiezhongjiluContent;


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
	 * 获取：接种编号
	 */
    public String getJiezhongjiluUuidNumber() {
        return jiezhongjiluUuidNumber;
    }


    /**
	 * 设置：接种编号
	 */
    public void setJiezhongjiluUuidNumber(String jiezhongjiluUuidNumber) {
        this.jiezhongjiluUuidNumber = jiezhongjiluUuidNumber;
    }
    /**
	 * 获取：接种时间
	 */
    public Date getJiezhongTime() {
        return jiezhongTime;
    }


    /**
	 * 设置：接种时间
	 */
    public void setJiezhongTime(Date jiezhongTime) {
        this.jiezhongTime = jiezhongTime;
    }
    /**
	 * 获取：接种类型
	 */
    public Integer getJiezhongTypes() {
        return jiezhongTypes;
    }


    /**
	 * 设置：接种类型
	 */
    public void setJiezhongTypes(Integer jiezhongTypes) {
        this.jiezhongTypes = jiezhongTypes;
    }
    /**
	 * 获取：备注
	 */
    public String getJiezhongjiluContent() {
        return jiezhongjiluContent;
    }


    /**
	 * 设置：备注
	 */
    public void setJiezhongjiluContent(String jiezhongjiluContent) {
        this.jiezhongjiluContent = jiezhongjiluContent;
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
