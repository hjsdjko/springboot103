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


import com.cl.dao.MinsuxinxiDao;
import com.cl.entity.MinsuxinxiEntity;
import com.cl.service.MinsuxinxiService;
import com.cl.entity.view.MinsuxinxiView;

@Service("minsuxinxiService")
public class MinsuxinxiServiceImpl extends ServiceImpl<MinsuxinxiDao, MinsuxinxiEntity> implements MinsuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MinsuxinxiEntity> page = this.selectPage(
                new Query<MinsuxinxiEntity>(params).getPage(),
                new EntityWrapper<MinsuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MinsuxinxiEntity> wrapper) {
		  Page<MinsuxinxiView> page =new Query<MinsuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<MinsuxinxiView> selectListView(Wrapper<MinsuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MinsuxinxiView selectView(Wrapper<MinsuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<MinsuxinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<MinsuxinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<MinsuxinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
