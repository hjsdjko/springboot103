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


import com.cl.dao.MinsuyudingDao;
import com.cl.entity.MinsuyudingEntity;
import com.cl.service.MinsuyudingService;
import com.cl.entity.view.MinsuyudingView;

@Service("minsuyudingService")
public class MinsuyudingServiceImpl extends ServiceImpl<MinsuyudingDao, MinsuyudingEntity> implements MinsuyudingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MinsuyudingEntity> page = this.selectPage(
                new Query<MinsuyudingEntity>(params).getPage(),
                new EntityWrapper<MinsuyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MinsuyudingEntity> wrapper) {
		  Page<MinsuyudingView> page =new Query<MinsuyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<MinsuyudingView> selectListView(Wrapper<MinsuyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MinsuyudingView selectView(Wrapper<MinsuyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<MinsuyudingEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<MinsuyudingEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<MinsuyudingEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
