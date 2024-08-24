package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.DiscussminsuxinxiDao;
import com.cl.entity.DiscussminsuxinxiEntity;
import com.cl.service.DiscussminsuxinxiService;
import com.cl.entity.view.DiscussminsuxinxiView;

@Service("discussminsuxinxiService")
public class DiscussminsuxinxiServiceImpl extends ServiceImpl<DiscussminsuxinxiDao, DiscussminsuxinxiEntity> implements DiscussminsuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussminsuxinxiEntity> page = this.selectPage(
                new Query<DiscussminsuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussminsuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussminsuxinxiEntity> wrapper) {
		  Page<DiscussminsuxinxiView> page =new Query<DiscussminsuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscussminsuxinxiView> selectListView(Wrapper<DiscussminsuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussminsuxinxiView selectView(Wrapper<DiscussminsuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
