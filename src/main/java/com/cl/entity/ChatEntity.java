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
 * 客服聊天
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-03 00:25:12
 */
@TableName("chat")
public class ChatEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChatEntity() {
		
	}
	
	public ChatEntity(T t) {
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
	 * 管理员id
	 */
					
	private Long adminid;
	
	/**
	 * 提问内容
	 */
					
	private String ask;
	
	/**
	 * 回复内容
	 */
					
	private String reply;
	
	/**
	 * 是否回复
	 */
					
	private Integer isreply;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
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
	 * 设置：管理员id
	 */
	public void setAdminid(Long adminid) {
		this.adminid = adminid;
	}
	/**
	 * 获取：管理员id
	 */
	public Long getAdminid() {
		return adminid;
	}
	/**
	 * 设置：提问内容
	 */
	public void setAsk(String ask) {
		this.ask = ask;
	}
	/**
	 * 获取：提问内容
	 */
	public String getAsk() {
		return ask;
	}
	/**
	 * 设置：回复内容
	 */
	public void setReply(String reply) {
		this.reply = reply;
	}
	/**
	 * 获取：回复内容
	 */
	public String getReply() {
		return reply;
	}
	/**
	 * 设置：是否回复
	 */
	public void setIsreply(Integer isreply) {
		this.isreply = isreply;
	}
	/**
	 * 获取：是否回复
	 */
	public Integer getIsreply() {
		return isreply;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
