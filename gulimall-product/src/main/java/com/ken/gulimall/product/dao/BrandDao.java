package com.ken.gulimall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ken.gulimall.product.entity.BrandEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author ken
 * @email gken_1028@gmail.com
 * @date 2020-08-06 19:42:27
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
