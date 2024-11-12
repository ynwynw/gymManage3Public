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


import com.cl.dao.JianshenjiaolianDao;
import com.cl.entity.JianshenjiaolianEntity;
import com.cl.service.JianshenjiaolianService;
import com.cl.entity.view.JianshenjiaolianView;

@Service("jianshenjiaolianService")
public class JianshenjiaolianServiceImpl extends ServiceImpl<JianshenjiaolianDao, JianshenjiaolianEntity> implements JianshenjiaolianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianshenjiaolianEntity> page = this.selectPage(
                new Query<JianshenjiaolianEntity>(params).getPage(),
                new EntityWrapper<JianshenjiaolianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianshenjiaolianEntity> wrapper) {
		  Page<JianshenjiaolianView> page =new Query<JianshenjiaolianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<JianshenjiaolianView> selectListView(Wrapper<JianshenjiaolianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianshenjiaolianView selectView(Wrapper<JianshenjiaolianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
