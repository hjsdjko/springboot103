package com.cl.dao;

import com.cl.entity.MinsuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.MinsuleixingView;


/**
 * 民宿类型
 * 
 * @author 
 * @email 
 * @date 2024-03-03 00:25:12
 */
public interface MinsuleixingDao extends BaseMapper<MinsuleixingEntity> {
	
	List<MinsuleixingView> selectListView(@Param("ew") Wrapper<MinsuleixingEntity> wrapper);

	List<MinsuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<MinsuleixingEntity> wrapper);
	
	MinsuleixingView selectView(@Param("ew") Wrapper<MinsuleixingEntity> wrapper);
	

}
