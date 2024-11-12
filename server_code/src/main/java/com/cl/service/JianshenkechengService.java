package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.JianshenkechengEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JianshenkechengView;


/**
 * 健身课程
 *
 * @author 
 * @email 
 * @date 2024-03-19 19:05:50
 */
public interface JianshenkechengService extends IService<JianshenkechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianshenkechengView> selectListView(Wrapper<JianshenkechengEntity> wrapper);
   	
   	JianshenkechengView selectView(@Param("ew") Wrapper<JianshenkechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianshenkechengEntity> wrapper);
   	

}

