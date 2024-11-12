package com.cl.dao;

import com.cl.entity.JianshenjiaolianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JianshenjiaolianView;


/**
 * 健身教练
 * 
 * @author 
 * @email 
 * @date 2024-03-19 19:05:50
 */
public interface JianshenjiaolianDao extends BaseMapper<JianshenjiaolianEntity> {
	
	List<JianshenjiaolianView> selectListView(@Param("ew") Wrapper<JianshenjiaolianEntity> wrapper);

	List<JianshenjiaolianView> selectListView(Pagination page,@Param("ew") Wrapper<JianshenjiaolianEntity> wrapper);
	
	JianshenjiaolianView selectView(@Param("ew") Wrapper<JianshenjiaolianEntity> wrapper);
	

}
