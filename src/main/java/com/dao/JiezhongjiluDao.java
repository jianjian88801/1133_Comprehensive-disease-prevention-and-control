package com.dao;

import com.entity.JiezhongjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiezhongjiluView;

/**
 * 接种记录 Dao 接口
 *
 * @author 
 */
public interface JiezhongjiluDao extends BaseMapper<JiezhongjiluEntity> {

   List<JiezhongjiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
