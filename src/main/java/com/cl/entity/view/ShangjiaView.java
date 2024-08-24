package com.cl.entity.view;

import com.cl.entity.ShangjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 商家
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-03 00:25:12
 */
@TableName("shangjia")
public class ShangjiaView  extends ShangjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangjiaView(){
	}
 
 	public ShangjiaView(ShangjiaEntity shangjiaEntity){
 	try {
			BeanUtils.copyProperties(this, shangjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
