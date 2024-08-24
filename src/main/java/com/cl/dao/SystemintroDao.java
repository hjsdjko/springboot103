package com.cl.dao;

import com.cl.entity.SystemintroEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.SystemintroView;


/**
 * 网站介绍
 * 
 * @author 
 * @email 
 * @date 2024-03-03 00:25:12
 */
public interface SystemintroDao extends BaseMapper<SystemintroEntity> {
	
	List<SystemintroView> selectListView(@Param("ew") Wrapper<SystemintroEntity> wrapper);

	List<SystemintroView> selectListView(Pagination page,@Param("ew") Wrapper<SystemintroEntity> wrapper);
	
	SystemintroView selectView(@Param("ew") Wrapper<SystemintroEntity> wrapper);
	

}
