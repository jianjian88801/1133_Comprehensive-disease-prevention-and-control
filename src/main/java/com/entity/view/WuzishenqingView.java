package com.entity.view;

import com.entity.WuzishenqingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 物资申请
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("wuzishenqing")
public class WuzishenqingView extends WuzishenqingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 派发地点的值
		*/
		private String wuzishenqingPaifaValue;
		/**
		* 审核状态的值
		*/
		private String wuzishenqingYesnoValue;



		//级联表 wuzi
			/**
			* 物资名称
			*/
			private String wuziName;
			/**
			* 单位
			*/
			private String wuziDanwei;
			/**
			* 物资照片
			*/
			private String wuziPhoto;
			/**
			* 物资类型
			*/
			private Integer wuziTypes;
				/**
				* 物资类型的值
				*/
				private String wuziValue;
			/**
			* 物资库存
			*/
			private Integer wuziKucunNumber;
			/**
			* 逻辑删除
			*/
			private Integer wuziDelete;
			/**
			* 物资介绍
			*/
			private String wuziContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public WuzishenqingView() {

	}

	public WuzishenqingView(WuzishenqingEntity wuzishenqingEntity) {
		try {
			BeanUtils.copyProperties(this, wuzishenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 派发地点的值
			*/
			public String getWuzishenqingPaifaValue() {
				return wuzishenqingPaifaValue;
			}
			/**
			* 设置： 派发地点的值
			*/
			public void setWuzishenqingPaifaValue(String wuzishenqingPaifaValue) {
				this.wuzishenqingPaifaValue = wuzishenqingPaifaValue;
			}
			/**
			* 获取： 审核状态的值
			*/
			public String getWuzishenqingYesnoValue() {
				return wuzishenqingYesnoValue;
			}
			/**
			* 设置： 审核状态的值
			*/
			public void setWuzishenqingYesnoValue(String wuzishenqingYesnoValue) {
				this.wuzishenqingYesnoValue = wuzishenqingYesnoValue;
			}

























				//级联表的get和set wuzi
					/**
					* 获取： 物资名称
					*/
					public String getWuziName() {
						return wuziName;
					}
					/**
					* 设置： 物资名称
					*/
					public void setWuziName(String wuziName) {
						this.wuziName = wuziName;
					}
					/**
					* 获取： 单位
					*/
					public String getWuziDanwei() {
						return wuziDanwei;
					}
					/**
					* 设置： 单位
					*/
					public void setWuziDanwei(String wuziDanwei) {
						this.wuziDanwei = wuziDanwei;
					}
					/**
					* 获取： 物资照片
					*/
					public String getWuziPhoto() {
						return wuziPhoto;
					}
					/**
					* 设置： 物资照片
					*/
					public void setWuziPhoto(String wuziPhoto) {
						this.wuziPhoto = wuziPhoto;
					}
					/**
					* 获取： 物资类型
					*/
					public Integer getWuziTypes() {
						return wuziTypes;
					}
					/**
					* 设置： 物资类型
					*/
					public void setWuziTypes(Integer wuziTypes) {
						this.wuziTypes = wuziTypes;
					}


						/**
						* 获取： 物资类型的值
						*/
						public String getWuziValue() {
							return wuziValue;
						}
						/**
						* 设置： 物资类型的值
						*/
						public void setWuziValue(String wuziValue) {
							this.wuziValue = wuziValue;
						}
					/**
					* 获取： 物资库存
					*/
					public Integer getWuziKucunNumber() {
						return wuziKucunNumber;
					}
					/**
					* 设置： 物资库存
					*/
					public void setWuziKucunNumber(Integer wuziKucunNumber) {
						this.wuziKucunNumber = wuziKucunNumber;
					}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getWuziDelete() {
						return wuziDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setWuziDelete(Integer wuziDelete) {
						this.wuziDelete = wuziDelete;
					}
					/**
					* 获取： 物资介绍
					*/
					public String getWuziContent() {
						return wuziContent;
					}
					/**
					* 设置： 物资介绍
					*/
					public void setWuziContent(String wuziContent) {
						this.wuziContent = wuziContent;
					}







				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}



}
