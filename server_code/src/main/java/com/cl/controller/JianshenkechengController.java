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

import com.cl.entity.JianshenkechengEntity;
import com.cl.entity.view.JianshenkechengView;

import com.cl.service.JianshenkechengService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 健身课程
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-19 19:05:50
 */
@RestController
@RequestMapping("/jianshenkecheng")
public class JianshenkechengController {
    @Autowired
    private JianshenkechengService jianshenkechengService;

    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JianshenkechengEntity jianshenkecheng,
		HttpServletRequest request){
        EntityWrapper<JianshenkechengEntity> ew = new EntityWrapper<JianshenkechengEntity>();

		PageUtils page = jianshenkechengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianshenkecheng), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JianshenkechengEntity jianshenkecheng, 
		HttpServletRequest request){
        EntityWrapper<JianshenkechengEntity> ew = new EntityWrapper<JianshenkechengEntity>();

		PageUtils page = jianshenkechengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianshenkecheng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JianshenkechengEntity jianshenkecheng){
       	EntityWrapper<JianshenkechengEntity> ew = new EntityWrapper<JianshenkechengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jianshenkecheng, "jianshenkecheng")); 
        return R.ok().put("data", jianshenkechengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JianshenkechengEntity jianshenkecheng){
        EntityWrapper< JianshenkechengEntity> ew = new EntityWrapper< JianshenkechengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jianshenkecheng, "jianshenkecheng")); 
		JianshenkechengView jianshenkechengView =  jianshenkechengService.selectView(ew);
		return R.ok("查询健身课程成功").put("data", jianshenkechengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JianshenkechengEntity jianshenkecheng = jianshenkechengService.selectById(id);
		jianshenkecheng = jianshenkechengService.selectView(new EntityWrapper<JianshenkechengEntity>().eq("id", id));
        return R.ok().put("data", jianshenkecheng);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JianshenkechengEntity jianshenkecheng = jianshenkechengService.selectById(id);
		jianshenkecheng = jianshenkechengService.selectView(new EntityWrapper<JianshenkechengEntity>().eq("id", id));
        return R.ok().put("data", jianshenkecheng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JianshenkechengEntity jianshenkecheng, HttpServletRequest request){
    	jianshenkecheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianshenkecheng);
        jianshenkechengService.insert(jianshenkecheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JianshenkechengEntity jianshenkecheng, HttpServletRequest request){
    	jianshenkecheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianshenkecheng);
        jianshenkechengService.insert(jianshenkecheng);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JianshenkechengEntity jianshenkecheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jianshenkecheng);
        jianshenkechengService.updateById(jianshenkecheng);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jianshenkechengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
