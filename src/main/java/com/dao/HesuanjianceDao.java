package com.dao;

import com.entity.HesuanjianceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HesuanjianceView;

/**
 * 核酸检测 Dao 接口
 *
 * @author 
 */
public interface HesuanjianceDao extends BaseMapper<HesuanjianceEntity> {

   List<HesuanjianceView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
