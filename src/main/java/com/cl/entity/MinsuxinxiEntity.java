package com.cl.entity;

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
 * 民宿信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-03 00:25:12
 */
@TableName("minsuxinxi")
public class MinsuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MinsuxinxiEntity() {
		
	}
	
	public MinsuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 房间名称
	 */
					
	private String fangjianmingcheng;
	
	/**
	 * 房间图片
	 */
					
	private String fangjiantupian;
	
	/**
	 * 房间类型
	 */
					
	private String fangjianleixing;
	
	/**
	 * 一晚价格
	 */
					
	private Double yiwanjiage;
	
	/**
	 * 服务电话
	 */
					
	private String fuwudianhua;
	
	/**
	 * 房内设施
	 */
					
	private String fangneisheshi;
	
	/**
	 * 收藏数量
	 */
					
	private Integer storeupnum;
	
	/**
	 * 民宿地址
	 */
					
	private String minsudizhi;
	
	/**
	 * 民宿类型
	 */
					
	private String minsuleixing;
	
	/**
	 * 商家账号
	 */
					
	private String shangjiazhanghao;
	
	/**
	 * 商家名称
	 */
					
	private String shangjiamingcheng;
	
	/**
	 * 房源状态
	 */
					
	private String fangyuanzhuangtai;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：房间名称
	 */
	public void setFangjianmingcheng(String fangjianmingcheng) {
		this.fangjianmingcheng = fangjianmingcheng;
	}
	/**
	 * 获取：房间名称
	 */
	public String getFangjianmingcheng() {
		return fangjianmingcheng;
	}
	/**
	 * 设置：房间图片
	 */
	public void setFangjiantupian(String fangjiantupian) {
		this.fangjiantupian = fangjiantupian;
	}
	/**
	 * 获取：房间图片
	 */
	public String getFangjiantupian() {
		return fangjiantupian;
	}
	/**
	 * 设置：房间类型
	 */
	public void setFangjianleixing(String fangjianleixing) {
		this.fangjianleixing = fangjianleixing;
	}
	/**
	 * 获取：房间类型
	 */
	public String getFangjianleixing() {
		return fangjianleixing;
	}
	/**
	 * 设置：一晚价格
	 */
	public void setYiwanjiage(Double yiwanjiage) {
		this.yiwanjiage = yiwanjiage;
	}
	/**
	 * 获取：一晚价格
	 */
	public Double getYiwanjiage() {
		return yiwanjiage;
	}
	/**
	 * 设置：服务电话
	 */
	public void setFuwudianhua(String fuwudianhua) {
		this.fuwudianhua = fuwudianhua;
	}
	/**
	 * 获取：服务电话
	 */
	public String getFuwudianhua() {
		return fuwudianhua;
	}
	/**
	 * 设置：房内设施
	 */
	public void setFangneisheshi(String fangneisheshi) {
		this.fangneisheshi = fangneisheshi;
	}
	/**
	 * 获取：房内设施
	 */
	public String getFangneisheshi() {
		return fangneisheshi;
	}
	/**
	 * 设置：收藏数量
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数量
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}
	/**
	 * 设置：民宿地址
	 */
	public void setMinsudizhi(String minsudizhi) {
		this.minsudizhi = minsudizhi;
	}
	/**
	 * 获取：民宿地址
	 */
	public String getMinsudizhi() {
		return minsudizhi;
	}
	/**
	 * 设置：民宿类型
	 */
	public void setMinsuleixing(String minsuleixing) {
		this.minsuleixing = minsuleixing;
	}
	/**
	 * 获取：民宿类型
	 */
	public String getMinsuleixing() {
		return minsuleixing;
	}
	/**
	 * 设置：商家账号
	 */
	public void setShangjiazhanghao(String shangjiazhanghao) {
		this.shangjiazhanghao = shangjiazhanghao;
	}
	/**
	 * 获取：商家账号
	 */
	public String getShangjiazhanghao() {
		return shangjiazhanghao;
	}
	/**
	 * 设置：商家名称
	 */
	public void setShangjiamingcheng(String shangjiamingcheng) {
		this.shangjiamingcheng = shangjiamingcheng;
	}
	/**
	 * 获取：商家名称
	 */
	public String getShangjiamingcheng() {
		return shangjiamingcheng;
	}
	/**
	 * 设置：房源状态
	 */
	public void setFangyuanzhuangtai(String fangyuanzhuangtai) {
		this.fangyuanzhuangtai = fangyuanzhuangtai;
	}
	/**
	 * 获取：房源状态
	 */
	public String getFangyuanzhuangtai() {
		return fangyuanzhuangtai;
	}

}
