package com.entity.vo;

import com.entity.JiezhongjiluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 接种记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiezhongjilu")
public class JiezhongjiluVO implements Serializable {
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

}
