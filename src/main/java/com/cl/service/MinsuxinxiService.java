package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.MinsuxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.MinsuxinxiView;


/**
 * 民宿信息
 *
 * @author 
 * @email 
 * @date 2024-03-03 00:25:12
 */
public interface MinsuxinxiService extends IService<MinsuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MinsuxinxiView> selectListView(Wrapper<MinsuxinxiEntity> wrapper);
   	
   	MinsuxinxiView selectView(@Param("ew") Wrapper<MinsuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MinsuxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<MinsuxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<MinsuxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<MinsuxinxiEntity> wrapper);



}

