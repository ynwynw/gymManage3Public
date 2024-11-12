package com.cl.dao;

import com.cl.entity.JianshenqicaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JianshenqicaiView;


/**
 * 健身器材
 * 
 * @author 
 * @email 
 * @date 2024-03-19 19:05:50
 */
public interface JianshenqicaiDao extends BaseMapper<JianshenqicaiEntity> {
	
	List<JianshenqicaiView> selectListView(@Param("ew") Wrapper<JianshenqicaiEntity> wrapper);

	List<JianshenqicaiView> selectListView(Pagination page,@Param("ew") Wrapper<JianshenqicaiEntity> wrapper);
	
	JianshenqicaiView selectView(@Param("ew") Wrapper<JianshenqicaiEntity> wrapper);
	

}
