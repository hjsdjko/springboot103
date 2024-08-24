package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussminsuxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussminsuxinxiView;


/**
 * 民宿信息评论表
 *
 * @author 
 * @email 
 * @date 2024-03-03 00:25:12
 */
public interface DiscussminsuxinxiService extends IService<DiscussminsuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussminsuxinxiView> selectListView(Wrapper<DiscussminsuxinxiEntity> wrapper);
   	
   	DiscussminsuxinxiView selectView(@Param("ew") Wrapper<DiscussminsuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussminsuxinxiEntity> wrapper);
   	

}

