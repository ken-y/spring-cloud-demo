package com.ken.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ken.common.utils.PageUtils;
import com.ken.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author ken
 * @email gken_1028@gmail.com
 * @date 2020-08-07 19:00:39
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

