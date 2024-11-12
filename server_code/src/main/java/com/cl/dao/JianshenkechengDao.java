package com.cl.dao;

import com.cl.entity.JianshenkechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JianshenkechengView;


/**
 * 健身课程
 * 
 * @author 
 * @email 
 * @date 2024-03-19 19:05:50
 */
public interface JianshenkechengDao extends BaseMapper<JianshenkechengEntity> {
	
	List<JianshenkechengView> selectListView(@Param("ew") Wrapper<JianshenkechengEntity> wrapper);

	List<JianshenkechengView> selectListView(Pagination page,@Param("ew") Wrapper<JianshenkechengEntity> wrapper);
	
	JianshenkechengView selectView(@Param("ew") Wrapper<JianshenkechengEntity> wrapper);
	

}
