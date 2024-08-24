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

import com.cl.entity.SystemintroEntity;
import com.cl.entity.view.SystemintroView;

import com.cl.service.SystemintroService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.EncryptUtil;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 网站介绍
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-03 00:25:12
 */
@RestController
@RequestMapping("/systemintro")
public class SystemintroController {
    @Autowired
    private SystemintroService systemintroService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SystemintroEntity systemintro,
		HttpServletRequest request){
        EntityWrapper<SystemintroEntity> ew = new EntityWrapper<SystemintroEntity>();

		PageUtils page = systemintroService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, systemintro), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SystemintroEntity systemintro, 
		HttpServletRequest request){
        EntityWrapper<SystemintroEntity> ew = new EntityWrapper<SystemintroEntity>();

		PageUtils page = systemintroService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, systemintro), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SystemintroEntity systemintro){
       	EntityWrapper<SystemintroEntity> ew = new EntityWrapper<SystemintroEntity>();
      	ew.allEq(MPUtil.allEQMapPre( systemintro, "systemintro")); 
        return R.ok().put("data", systemintroService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SystemintroEntity systemintro){
        EntityWrapper< SystemintroEntity> ew = new EntityWrapper< SystemintroEntity>();
 		ew.allEq(MPUtil.allEQMapPre( systemintro, "systemintro")); 
		SystemintroView systemintroView =  systemintroService.selectView(ew);
		return R.ok("查询网站介绍成功").put("data", systemintroView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        SystemintroEntity systemintro = systemintroService.selectById(id);
		systemintro = systemintroService.selectView(new EntityWrapper<SystemintroEntity>().eq("id", id));
        return R.ok().put("data", systemintro);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        SystemintroEntity systemintro = systemintroService.selectById(id);
		systemintro = systemintroService.selectView(new EntityWrapper<SystemintroEntity>().eq("id", id));
        return R.ok().put("data", systemintro);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SystemintroEntity systemintro, HttpServletRequest request){
    	systemintro.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(systemintro);
        systemintroService.insert(systemintro);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SystemintroEntity systemintro, HttpServletRequest request){
    	systemintro.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(systemintro);
        systemintroService.insert(systemintro);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody SystemintroEntity systemintro, HttpServletRequest request){
        //ValidatorUtils.validateEntity(systemintro);
        systemintroService.updateById(systemintro);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        systemintroService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
