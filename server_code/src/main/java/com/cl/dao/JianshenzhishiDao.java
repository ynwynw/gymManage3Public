package com.cl.dao;

import com.cl.entity.JianshenzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JianshenzhishiView;


/**
 * 健身知识
 * 
 * @author 
 * @email 
 * @date 2024-03-19 19:05:50
 */
public interface JianshenzhishiDao extends BaseMapper<JianshenzhishiEntity> {
	
	List<JianshenzhishiView> selectListView(@Param("ew") Wrapper<JianshenzhishiEntity> wrapper);

	List<JianshenzhishiView> selectListView(Pagination page,@Param("ew") Wrapper<JianshenzhishiEntity> wrapper);
	
	JianshenzhishiView selectView(@Param("ew") Wrapper<JianshenzhishiEntity> wrapper);
	

}
