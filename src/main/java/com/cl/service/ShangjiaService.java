package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShangjiaEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShangjiaView;


/**
 * 商家
 *
 * @author 
 * @email 
 * @date 2024-03-03 00:25:12
 */
public interface ShangjiaService extends IService<ShangjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangjiaView> selectListView(Wrapper<ShangjiaEntity> wrapper);
   	
   	ShangjiaView selectView(@Param("ew") Wrapper<ShangjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangjiaEntity> wrapper);
   	

}

