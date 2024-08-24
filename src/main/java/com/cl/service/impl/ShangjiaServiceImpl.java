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


import com.cl.dao.ShangjiaDao;
import com.cl.entity.ShangjiaEntity;
import com.cl.service.ShangjiaService;
import com.cl.entity.view.ShangjiaView;

@Service("shangjiaService")
public class ShangjiaServiceImpl extends ServiceImpl<ShangjiaDao, ShangjiaEntity> implements ShangjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangjiaEntity> page = this.selectPage(
                new Query<ShangjiaEntity>(params).getPage(),
                new EntityWrapper<ShangjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangjiaEntity> wrapper) {
		  Page<ShangjiaView> page =new Query<ShangjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ShangjiaView> selectListView(Wrapper<ShangjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangjiaView selectView(Wrapper<ShangjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
