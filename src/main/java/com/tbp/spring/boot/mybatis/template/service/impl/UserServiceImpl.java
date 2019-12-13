package com.tbp.spring.boot.mybatis.template.service.impl;

import com.tbp.spring.boot.mybatis.template.entity.UserEntity;
import com.tbp.spring.boot.mybatis.template.mapper.UserEntityMapper;
import com.tbp.spring.boot.mybatis.template.service.UserService;
import com.tbp.spring.boot.mybatis.template.vo.UserReq;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * describe:
 *
 * @author mac 田北平
 * @date 2019/12/11 12:10
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityMapper userEntityMapper;

    @Override
//    @Transactional
    public void addUser(UserReq req) {
        UserEntity entity = new UserEntity();
        BeanUtils.copyProperties(req, entity);
        userEntityMapper.insert(entity);
    }

    @Override
    public UserEntity queryUser(Long id) {
        return userEntityMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public UserEntity updateUserById(UserReq req) {
        UserEntity entity = userEntityMapper.selectByPrimaryKey(req.getId());
        entity.setAddress(req.getAddress());
        entity.setName(req.getName());
        userEntityMapper.updateByPrimaryKey(entity);
        return entity;
    }
}
