package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.JianshenqicaiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JianshenqicaiView;


/**
 * 健身器材
 *
 * @author 
 * @email 
 * @date 2024-03-19 19:05:50
 */
public interface JianshenqicaiService extends IService<JianshenqicaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianshenqicaiView> selectListView(Wrapper<JianshenqicaiEntity> wrapper);
   	
   	JianshenqicaiView selectView(@Param("ew") Wrapper<JianshenqicaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianshenqicaiEntity> wrapper);
   	

}

