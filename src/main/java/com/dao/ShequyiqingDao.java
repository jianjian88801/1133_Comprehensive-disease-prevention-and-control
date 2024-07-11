package com.dao;

import com.entity.ShequyiqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShequyiqingView;

/**
 * 社区疫情情况 Dao 接口
 *
 * @author 
 */
public interface ShequyiqingDao extends BaseMapper<ShequyiqingEntity> {

   List<ShequyiqingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
