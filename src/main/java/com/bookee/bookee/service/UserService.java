package com.bookee.bookee.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.bookee.bookee.entity.UserEo;
import com.bookee.bookee.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends ServiceImpl<UserMapper, UserEo> {

    public List<UserEo> selectOne(UserEo userEo) {
        return baseMapper.selectList(new EntityWrapper<>());
    }

    public static void main(String[] args) {
        org.apache.commons.lang3.StringUtils.stripEnd
    }
}
