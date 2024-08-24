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


import com.cl.dao.SystemintroDao;
import com.cl.entity.SystemintroEntity;
import com.cl.service.SystemintroService;
import com.cl.entity.view.SystemintroView;

@Service("systemintroService")
public class SystemintroServiceImpl extends ServiceImpl<SystemintroDao, SystemintroEntity> implements SystemintroService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SystemintroEntity> page = this.selectPage(
                new Query<SystemintroEntity>(params).getPage(),
                new EntityWrapper<SystemintroEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SystemintroEntity> wrapper) {
		  Page<SystemintroView> page =new Query<SystemintroView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<SystemintroView> selectListView(Wrapper<SystemintroEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SystemintroView selectView(Wrapper<SystemintroEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
