/*
 * Copyright (c) 2015 金联所. All rights reserved.
 *
 * The copyright to the computer software herein is the property of 金联所.
 * The software may be used and/or copied only with the written permission
 * of 金联所, or in accordance with the terms and conditions stipulated in
 * the agreement/contract under which the software has been supplied.
 *
 */

package com.encsoft.demo.dao;

import com.encsoft.demo.dao.mapper.BaseMapper;
import com.encsoft.demo.dao.mapper.UserMapper;
import com.encsoft.demo.model.User;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;

/**
 * @author xiaomc 2016年05月17日
 */

@Repository
public class UserDao extends BaseDao<User> {

    @Resource
    private UserMapper userMapper;

    @Override
    protected BaseMapper<User> getMapper() {
        return userMapper;
    }
}
