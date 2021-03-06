package com.ken.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ken.common.utils.PageUtils;
import com.ken.gulimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author ken
 * @email gken_1028@gmail.com
 * @date 2020-08-07 18:52:13
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

