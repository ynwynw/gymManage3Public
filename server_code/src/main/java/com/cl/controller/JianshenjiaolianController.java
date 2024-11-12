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

import com.cl.entity.JianshenjiaolianEntity;
import com.cl.entity.view.JianshenjiaolianView;

import com.cl.service.JianshenjiaolianService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 健身教练
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-19 19:05:50
 */
@RestController
@RequestMapping("/jianshenjiaolian")
public class JianshenjiaolianController {
    @Autowired
    private JianshenjiaolianService jianshenjiaolianService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JianshenjiaolianEntity jianshenjiaolian,
		HttpServletRequest request){
        EntityWrapper<JianshenjiaolianEntity> ew = new EntityWrapper<JianshenjiaolianEntity>();

		PageUtils page = jianshenjiaolianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianshenjiaolian), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JianshenjiaolianEntity jianshenjiaolian, 
		HttpServletRequest request){
        EntityWrapper<JianshenjiaolianEntity> ew = new EntityWrapper<JianshenjiaolianEntity>();

		PageUtils page = jianshenjiaolianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianshenjiaolian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JianshenjiaolianEntity jianshenjiaolian){
       	EntityWrapper<JianshenjiaolianEntity> ew = new EntityWrapper<JianshenjiaolianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jianshenjiaolian, "jianshenjiaolian")); 
        return R.ok().put("data", jianshenjiaolianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JianshenjiaolianEntity jianshenjiaolian){
        EntityWrapper< JianshenjiaolianEntity> ew = new EntityWrapper< JianshenjiaolianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jianshenjiaolian, "jianshenjiaolian")); 
		JianshenjiaolianView jianshenjiaolianView =  jianshenjiaolianService.selectView(ew);
		return R.ok("查询健身教练成功").put("data", jianshenjiaolianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JianshenjiaolianEntity jianshenjiaolian = jianshenjiaolianService.selectById(id);
		jianshenjiaolian = jianshenjiaolianService.selectView(new EntityWrapper<JianshenjiaolianEntity>().eq("id", id));
        return R.ok().put("data", jianshenjiaolian);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JianshenjiaolianEntity jianshenjiaolian = jianshenjiaolianService.selectById(id);
		jianshenjiaolian = jianshenjiaolianService.selectView(new EntityWrapper<JianshenjiaolianEntity>().eq("id", id));
        return R.ok().put("data", jianshenjiaolian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JianshenjiaolianEntity jianshenjiaolian, HttpServletRequest request){
    	jianshenjiaolian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianshenjiaolian);
        jianshenjiaolianService.insert(jianshenjiaolian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JianshenjiaolianEntity jianshenjiaolian, HttpServletRequest request){
    	jianshenjiaolian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianshenjiaolian);
        jianshenjiaolianService.insert(jianshenjiaolian);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JianshenjiaolianEntity jianshenjiaolian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jianshenjiaolian);
        jianshenjiaolianService.updateById(jianshenjiaolian);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jianshenjiaolianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
