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


import com.cl.dao.JianshenkechengDao;
import com.cl.entity.JianshenkechengEntity;
import com.cl.service.JianshenkechengService;
import com.cl.entity.view.JianshenkechengView;

@Service("jianshenkechengService")
public class JianshenkechengServiceImpl extends ServiceImpl<JianshenkechengDao, JianshenkechengEntity> implements JianshenkechengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianshenkechengEntity> page = this.selectPage(
                new Query<JianshenkechengEntity>(params).getPage(),
                new EntityWrapper<JianshenkechengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianshenkechengEntity> wrapper) {
		  Page<JianshenkechengView> page =new Query<JianshenkechengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<JianshenkechengView> selectListView(Wrapper<JianshenkechengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianshenkechengView selectView(Wrapper<JianshenkechengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
