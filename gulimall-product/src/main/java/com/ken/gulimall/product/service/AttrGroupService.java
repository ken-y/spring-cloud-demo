package com.ken.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ken.common.utils.PageUtils;
import com.ken.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author ken
 * @email gken_1028@gmail.com
 * @date 2020-08-06 19:42:27
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

