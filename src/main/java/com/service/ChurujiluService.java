package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChurujiluEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 出入记录 服务类
 */
public interface ChurujiluService extends IService<ChurujiluEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}