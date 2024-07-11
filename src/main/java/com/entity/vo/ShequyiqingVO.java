package com.entity.vo;

import com.entity.ShequyiqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 社区疫情情况
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shequyiqing")
public class ShequyiqingVO implements Serializable {
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
     * 标题
     */

    @TableField(value = "shequyiqing_name")
    private String shequyiqingName;


    /**
     * 照片
     */

    @TableField(value = "gonggao_photo")
    private String gonggaoPhoto;


    /**
     * 内容
     */

    @TableField(value = "shequyiqing_content")
    private String shequyiqingContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 nameShow
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
	 * 设置：标题
	 */
    public String getShequyiqingName() {
        return shequyiqingName;
    }


    /**
	 * 获取：标题
	 */

    public void setShequyiqingName(String shequyiqingName) {
        this.shequyiqingName = shequyiqingName;
    }
    /**
	 * 设置：照片
	 */
    public String getGonggaoPhoto() {
        return gonggaoPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setGonggaoPhoto(String gonggaoPhoto) {
        this.gonggaoPhoto = gonggaoPhoto;
    }
    /**
	 * 设置：内容
	 */
    public String getShequyiqingContent() {
        return shequyiqingContent;
    }


    /**
	 * 获取：内容
	 */

    public void setShequyiqingContent(String shequyiqingContent) {
        this.shequyiqingContent = shequyiqingContent;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
