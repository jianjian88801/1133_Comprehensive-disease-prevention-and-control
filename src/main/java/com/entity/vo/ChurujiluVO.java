package com.entity.vo;

import com.entity.ChurujiluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 出入记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("churujilu")
public class ChurujiluVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 类型
     */

    @TableField(value = "churujilu_types")
    private Integer churujiluTypes;


    /**
     * 健康码
     */

    @TableField(value = "churujilu_photo")
    private String churujiluPhoto;


    /**
     * 备注
     */

    @TableField(value = "churujilu_content")
    private String churujiluContent;


    /**
     * 出入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "churu_time")
    private Date churuTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：类型
	 */
    public Integer getChurujiluTypes() {
        return churujiluTypes;
    }


    /**
	 * 获取：类型
	 */

    public void setChurujiluTypes(Integer churujiluTypes) {
        this.churujiluTypes = churujiluTypes;
    }
    /**
	 * 设置：健康码
	 */
    public String getChurujiluPhoto() {
        return churujiluPhoto;
    }


    /**
	 * 获取：健康码
	 */

    public void setChurujiluPhoto(String churujiluPhoto) {
        this.churujiluPhoto = churujiluPhoto;
    }
    /**
	 * 设置：备注
	 */
    public String getChurujiluContent() {
        return churujiluContent;
    }


    /**
	 * 获取：备注
	 */

    public void setChurujiluContent(String churujiluContent) {
        this.churujiluContent = churujiluContent;
    }
    /**
	 * 设置：出入时间
	 */
    public Date getChuruTime() {
        return churuTime;
    }


    /**
	 * 获取：出入时间
	 */

    public void setChuruTime(Date churuTime) {
        this.churuTime = churuTime;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
