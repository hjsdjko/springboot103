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


import com.cl.dao.ChatDao;
import com.cl.entity.ChatEntity;
import com.cl.service.ChatService;
import com.cl.entity.view.ChatView;

@Service("chatService")
public class ChatServiceImpl extends ServiceImpl<ChatDao, ChatEntity> implements ChatService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChatEntity> page = this.selectPage(
                new Query<ChatEntity>(params).getPage(),
                new EntityWrapper<ChatEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChatEntity> wrapper) {
		  Page<ChatView> page =new Query<ChatView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ChatView> selectListView(Wrapper<ChatEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChatView selectView(Wrapper<ChatEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
