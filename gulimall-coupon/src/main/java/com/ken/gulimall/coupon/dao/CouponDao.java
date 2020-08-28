package com.ken.gulimall.coupon.dao;

import com.ken.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ken
 * @email gken_1028@gmail.com
 * @date 2020-08-07 18:52:13
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
