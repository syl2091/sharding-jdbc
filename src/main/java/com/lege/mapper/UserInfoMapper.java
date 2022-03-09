package com.lege.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lege.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author lege
 * @Description
 * @create 2022-03-09 15:52
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {
}
