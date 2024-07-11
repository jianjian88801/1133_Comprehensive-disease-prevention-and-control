package com.dao;

import com.entity.ChurujiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChurujiluView;

/**
 * 出入记录 Dao 接口
 *
 * @author 
 */
public interface ChurujiluDao extends BaseMapper<ChurujiluEntity> {

   List<ChurujiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
