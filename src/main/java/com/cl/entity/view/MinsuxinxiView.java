package com.cl.entity.view;

import com.cl.entity.MinsuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 民宿信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-03 00:25:12
 */
@TableName("minsuxinxi")
public class MinsuxinxiView  extends MinsuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MinsuxinxiView(){
	}
 
 	public MinsuxinxiView(MinsuxinxiEntity minsuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, minsuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
