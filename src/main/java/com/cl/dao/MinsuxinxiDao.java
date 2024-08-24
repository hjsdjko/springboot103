package com.cl.dao;

import com.cl.entity.MinsuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.MinsuxinxiView;


/**
 * 民宿信息
 * 
 * @author 
 * @email 
 * @date 2024-03-03 00:25:12
 */
public interface MinsuxinxiDao extends BaseMapper<MinsuxinxiEntity> {
	
	List<MinsuxinxiView> selectListView(@Param("ew") Wrapper<MinsuxinxiEntity> wrapper);

	List<MinsuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<MinsuxinxiEntity> wrapper);
	
	MinsuxinxiView selectView(@Param("ew") Wrapper<MinsuxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MinsuxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MinsuxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MinsuxinxiEntity> wrapper);



}
