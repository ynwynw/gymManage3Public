package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.JianshenzhishiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JianshenzhishiView;


/**
 * 健身知识
 *
 * @author 
 * @email 
 * @date 2024-03-19 19:05:50
 */
public interface JianshenzhishiService extends IService<JianshenzhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianshenzhishiView> selectListView(Wrapper<JianshenzhishiEntity> wrapper);
   	
   	JianshenzhishiView selectView(@Param("ew") Wrapper<JianshenzhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianshenzhishiEntity> wrapper);
   	

}

