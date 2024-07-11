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
 * 物资
 *
 * @author 
 * @email
 */
@TableName("wuzi")
public class WuziEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public WuziEntity() {

	}

	public WuziEntity(T t) {
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
     * 物资名称
     */
    @TableField(value = "wuzi_name")

    private String wuziName;


    /**
     * 单位
     */
    @TableField(value = "wuzi_danwei")

    private String wuziDanwei;


    /**
     * 物资照片
     */
    @TableField(value = "wuzi_photo")

    private String wuziPhoto;


    /**
     * 物资类型
     */
    @TableField(value = "wuzi_types")

    private Integer wuziTypes;


    /**
     * 物资库存
     */
    @TableField(value = "wuzi_kucun_number")

    private Integer wuziKucunNumber;


    /**
     * 逻辑删除
     */
    @TableField(value = "wuzi_delete")

    private Integer wuziDelete;


    /**
     * 物资介绍
     */
    @TableField(value = "wuzi_content")

    private String wuziContent;


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
	 * 设置：物资名称
	 */
    public String getWuziName() {
        return wuziName;
    }


    /**
	 * 获取：物资名称
	 */

    public void setWuziName(String wuziName) {
        this.wuziName = wuziName;
    }
    /**
	 * 设置：单位
	 */
    public String getWuziDanwei() {
        return wuziDanwei;
    }


    /**
	 * 获取：单位
	 */

    public void setWuziDanwei(String wuziDanwei) {
        this.wuziDanwei = wuziDanwei;
    }
    /**
	 * 设置：物资照片
	 */
    public String getWuziPhoto() {
        return wuziPhoto;
    }


    /**
	 * 获取：物资照片
	 */

    public void setWuziPhoto(String wuziPhoto) {
        this.wuziPhoto = wuziPhoto;
    }
    /**
	 * 设置：物资类型
	 */
    public Integer getWuziTypes() {
        return wuziTypes;
    }


    /**
	 * 获取：物资类型
	 */

    public void setWuziTypes(Integer wuziTypes) {
        this.wuziTypes = wuziTypes;
    }
    /**
	 * 设置：物资库存
	 */
    public Integer getWuziKucunNumber() {
        return wuziKucunNumber;
    }


    /**
	 * 获取：物资库存
	 */

    public void setWuziKucunNumber(Integer wuziKucunNumber) {
        this.wuziKucunNumber = wuziKucunNumber;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getWuziDelete() {
        return wuziDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setWuziDelete(Integer wuziDelete) {
        this.wuziDelete = wuziDelete;
    }
    /**
	 * 设置：物资介绍
	 */
    public String getWuziContent() {
        return wuziContent;
    }


    /**
	 * 获取：物资介绍
	 */

    public void setWuziContent(String wuziContent) {
        this.wuziContent = wuziContent;
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
        return "Wuzi{" +
            "id=" + id +
            ", wuziName=" + wuziName +
            ", wuziDanwei=" + wuziDanwei +
            ", wuziPhoto=" + wuziPhoto +
            ", wuziTypes=" + wuziTypes +
            ", wuziKucunNumber=" + wuziKucunNumber +
            ", wuziDelete=" + wuziDelete +
            ", wuziContent=" + wuziContent +
            ", createTime=" + createTime +
        "}";
    }
}
