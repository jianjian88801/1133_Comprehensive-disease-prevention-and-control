package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 接种记录
 *
 * @author 
 * @email
 */
@TableName("jiezhongjilu")
public class JiezhongjiluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiezhongjiluEntity() {

	}

	public JiezhongjiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 接种编号
     */
    @TableField(value = "jiezhongjilu_uuid_number")

    private String jiezhongjiluUuidNumber;


    /**
     * 接种时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "jiezhong_time")

    private Date jiezhongTime;


    /**
     * 接种类型
     */
    @TableField(value = "jiezhong_types")

    private Integer jiezhongTypes;


    /**
     * 备注
     */
    @TableField(value = "jiezhongjilu_content")

    private String jiezhongjiluContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：接种编号
	 */
    public String getJiezhongjiluUuidNumber() {
        return jiezhongjiluUuidNumber;
    }


    /**
	 * 获取：接种编号
	 */

    public void setJiezhongjiluUuidNumber(String jiezhongjiluUuidNumber) {
        this.jiezhongjiluUuidNumber = jiezhongjiluUuidNumber;
    }
    /**
	 * 设置：接种时间
	 */
    public Date getJiezhongTime() {
        return jiezhongTime;
    }


    /**
	 * 获取：接种时间
	 */

    public void setJiezhongTime(Date jiezhongTime) {
        this.jiezhongTime = jiezhongTime;
    }
    /**
	 * 设置：接种类型
	 */
    public Integer getJiezhongTypes() {
        return jiezhongTypes;
    }


    /**
	 * 获取：接种类型
	 */

    public void setJiezhongTypes(Integer jiezhongTypes) {
        this.jiezhongTypes = jiezhongTypes;
    }
    /**
	 * 设置：备注
	 */
    public String getJiezhongjiluContent() {
        return jiezhongjiluContent;
    }


    /**
	 * 获取：备注
	 */

    public void setJiezhongjiluContent(String jiezhongjiluContent) {
        this.jiezhongjiluContent = jiezhongjiluContent;
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

    @Override
    public String toString() {
        return "Jiezhongjilu{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", jiezhongjiluUuidNumber=" + jiezhongjiluUuidNumber +
            ", jiezhongTime=" + jiezhongTime +
            ", jiezhongTypes=" + jiezhongTypes +
            ", jiezhongjiluContent=" + jiezhongjiluContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
