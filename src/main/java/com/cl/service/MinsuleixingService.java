package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.MinsuleixingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.MinsuleixingView;


/**
 * 民宿类型
 *
 * @author 
 * @email 
 * @date 2024-03-03 00:25:12
 */
public interface MinsuleixingService extends IService<MinsuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MinsuleixingView> selectListView(Wrapper<MinsuleixingEntity> wrapper);
   	
   	MinsuleixingView selectView(@Param("ew") Wrapper<MinsuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MinsuleixingEntity> wrapper);
   	

}

