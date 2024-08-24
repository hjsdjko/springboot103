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


import com.cl.dao.MinsuleixingDao;
import com.cl.entity.MinsuleixingEntity;
import com.cl.service.MinsuleixingService;
import com.cl.entity.view.MinsuleixingView;

@Service("minsuleixingService")
public class MinsuleixingServiceImpl extends ServiceImpl<MinsuleixingDao, MinsuleixingEntity> implements MinsuleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MinsuleixingEntity> page = this.selectPage(
                new Query<MinsuleixingEntity>(params).getPage(),
                new EntityWrapper<MinsuleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MinsuleixingEntity> wrapper) {
		  Page<MinsuleixingView> page =new Query<MinsuleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<MinsuleixingView> selectListView(Wrapper<MinsuleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MinsuleixingView selectView(Wrapper<MinsuleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
