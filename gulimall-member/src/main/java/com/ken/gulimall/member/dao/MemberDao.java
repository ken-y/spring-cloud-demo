package com.ken.gulimall.member.dao;

import com.ken.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ken
 * @email gken_1028@gmail.com
 * @date 2020-08-07 19:00:39
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
