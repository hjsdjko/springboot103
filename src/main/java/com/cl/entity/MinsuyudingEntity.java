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
 * 民宿预订
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-03 00:25:12
 */
@TableName("minsuyuding")
public class MinsuyudingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MinsuyudingEntity() {
		
	}
	
	public MinsuyudingEntity(T t) {
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
	 * 房间类型
	 */
					
	private String fangjianleixing;
	
	/**
	 * 一晚价格
	 */
					
	private Double yiwanjiage;
	
	/**
	 * 民宿地址
	 */
					
	private String minsudizhi;
	
	/**
	 * 民宿类型
	 */
					
	private String minsuleixing;
	
	/**
	 * 入住日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date ruzhuriqi;
	
	/**
	 * 入住天数
	 */
					
	private Integer ruzhutianshu;
	
	/**
	 * 入住金额
	 */
					
	private Double ruzhujine;
	
	/**
	 * 预订时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date yudingshijian;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 手机号码
	 */
					
	private String shoujihaoma;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 回复内容
	 */
					
	private String shhf;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	/**
	 * 商家账号
	 */
					
	private String shangjiazhanghao;
	
	/**
	 * 商家名称
	 */
					
	private String shangjiamingcheng;
	
	
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
	 * 设置：入住日期
	 */
	public void setRuzhuriqi(Date ruzhuriqi) {
		this.ruzhuriqi = ruzhuriqi;
	}
	/**
	 * 获取：入住日期
	 */
	public Date getRuzhuriqi() {
		return ruzhuriqi;
	}
	/**
	 * 设置：入住天数
	 */
	public void setRuzhutianshu(Integer ruzhutianshu) {
		this.ruzhutianshu = ruzhutianshu;
	}
	/**
	 * 获取：入住天数
	 */
	public Integer getRuzhutianshu() {
		return ruzhutianshu;
	}
	/**
	 * 设置：入住金额
	 */
	public void setRuzhujine(Double ruzhujine) {
		this.ruzhujine = ruzhujine;
	}
	/**
	 * 获取：入住金额
	 */
	public Double getRuzhujine() {
		return ruzhujine;
	}
	/**
	 * 设置：预订时间
	 */
	public void setYudingshijian(Date yudingshijian) {
		this.yudingshijian = yudingshijian;
	}
	/**
	 * 获取：预订时间
	 */
	public Date getYudingshijian() {
		return yudingshijian;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：手机号码
	 */
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：回复内容
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：回复内容
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
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

}
