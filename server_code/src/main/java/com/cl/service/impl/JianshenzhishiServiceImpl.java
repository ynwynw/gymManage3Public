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


import com.cl.dao.JianshenzhishiDao;
import com.cl.entity.JianshenzhishiEntity;
import com.cl.service.JianshenzhishiService;
import com.cl.entity.view.JianshenzhishiView;

@Service("jianshenzhishiService")
public class JianshenzhishiServiceImpl extends ServiceImpl<JianshenzhishiDao, JianshenzhishiEntity> implements JianshenzhishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianshenzhishiEntity> page = this.selectPage(
                new Query<JianshenzhishiEntity>(params).getPage(),
                new EntityWrapper<JianshenzhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianshenzhishiEntity> wrapper) {
		  Page<JianshenzhishiView> page =new Query<JianshenzhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<JianshenzhishiView> selectListView(Wrapper<JianshenzhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianshenzhishiView selectView(Wrapper<JianshenzhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
