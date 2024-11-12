package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.JianshenjiaolianEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JianshenjiaolianView;


/**
 * 健身教练
 *
 * @author 
 * @email 
 * @date 2024-03-19 19:05:50
 */
public interface JianshenjiaolianService extends IService<JianshenjiaolianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianshenjiaolianView> selectListView(Wrapper<JianshenjiaolianEntity> wrapper);
   	
   	JianshenjiaolianView selectView(@Param("ew") Wrapper<JianshenjiaolianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianshenjiaolianEntity> wrapper);
   	

}

