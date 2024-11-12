package com.cl.dao;

import com.cl.entity.KechenggoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KechenggoumaiView;


/**
 * 课程购买
 * 
 * @author 
 * @email 
 * @date 2024-03-19 19:05:50
 */
public interface KechenggoumaiDao extends BaseMapper<KechenggoumaiEntity> {
	
	List<KechenggoumaiView> selectListView(@Param("ew") Wrapper<KechenggoumaiEntity> wrapper);

	List<KechenggoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<KechenggoumaiEntity> wrapper);
	
	KechenggoumaiView selectView(@Param("ew") Wrapper<KechenggoumaiEntity> wrapper);
	

}
