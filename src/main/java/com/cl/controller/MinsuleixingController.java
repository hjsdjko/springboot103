package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.MinsuleixingEntity;
import com.cl.entity.view.MinsuleixingView;

import com.cl.service.MinsuleixingService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.EncryptUtil;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 民宿类型
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-03 00:25:12
 */
@RestController
@RequestMapping("/minsuleixing")
public class MinsuleixingController {
    @Autowired
    private MinsuleixingService minsuleixingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,MinsuleixingEntity minsuleixing,
		HttpServletRequest request){
        EntityWrapper<MinsuleixingEntity> ew = new EntityWrapper<MinsuleixingEntity>();

		PageUtils page = minsuleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, minsuleixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,MinsuleixingEntity minsuleixing, 
		HttpServletRequest request){
        EntityWrapper<MinsuleixingEntity> ew = new EntityWrapper<MinsuleixingEntity>();

		PageUtils page = minsuleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, minsuleixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( MinsuleixingEntity minsuleixing){
       	EntityWrapper<MinsuleixingEntity> ew = new EntityWrapper<MinsuleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( minsuleixing, "minsuleixing")); 
        return R.ok().put("data", minsuleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(MinsuleixingEntity minsuleixing){
        EntityWrapper< MinsuleixingEntity> ew = new EntityWrapper< MinsuleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( minsuleixing, "minsuleixing")); 
		MinsuleixingView minsuleixingView =  minsuleixingService.selectView(ew);
		return R.ok("查询民宿类型成功").put("data", minsuleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        MinsuleixingEntity minsuleixing = minsuleixingService.selectById(id);
		minsuleixing = minsuleixingService.selectView(new EntityWrapper<MinsuleixingEntity>().eq("id", id));
        return R.ok().put("data", minsuleixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        MinsuleixingEntity minsuleixing = minsuleixingService.selectById(id);
		minsuleixing = minsuleixingService.selectView(new EntityWrapper<MinsuleixingEntity>().eq("id", id));
        return R.ok().put("data", minsuleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MinsuleixingEntity minsuleixing, HttpServletRequest request){
    	minsuleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(minsuleixing);
        minsuleixingService.insert(minsuleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody MinsuleixingEntity minsuleixing, HttpServletRequest request){
    	minsuleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(minsuleixing);
        minsuleixingService.insert(minsuleixing);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody MinsuleixingEntity minsuleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(minsuleixing);
        minsuleixingService.updateById(minsuleixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        minsuleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
