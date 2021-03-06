package com.ken.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ken.common.utils.PageUtils;
import com.ken.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author ken
 * @email gken_1028@gmail.com
 * @date 2020-08-07 19:05:47
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

