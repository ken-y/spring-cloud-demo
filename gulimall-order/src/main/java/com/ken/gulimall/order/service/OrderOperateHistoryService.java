package com.ken.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ken.common.utils.PageUtils;
import com.ken.gulimall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author ken
 * @email gken_1028@gmail.com
 * @date 2020-08-07 18:50:30
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

