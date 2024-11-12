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


import com.cl.dao.JianshenqicaiDao;
import com.cl.entity.JianshenqicaiEntity;
import com.cl.service.JianshenqicaiService;
import com.cl.entity.view.JianshenqicaiView;

@Service("jianshenqicaiService")
public class JianshenqicaiServiceImpl extends ServiceImpl<JianshenqicaiDao, JianshenqicaiEntity> implements JianshenqicaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianshenqicaiEntity> page = this.selectPage(
                new Query<JianshenqicaiEntity>(params).getPage(),
                new EntityWrapper<JianshenqicaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianshenqicaiEntity> wrapper) {
		  Page<JianshenqicaiView> page =new Query<JianshenqicaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<JianshenqicaiView> selectListView(Wrapper<JianshenqicaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianshenqicaiView selectView(Wrapper<JianshenqicaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
