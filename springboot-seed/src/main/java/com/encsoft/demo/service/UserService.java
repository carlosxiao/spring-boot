/*
 * Copyright (c) 2015 金联所. All rights reserved.
 *
 * The copyright to the computer software herein is the property of 金联所.
 * The software may be used and/or copied only with the written permission
 * of 金联所, or in accordance with the terms and conditions stipulated in
 * the agreement/contract under which the software has been supplied.
 *
 */

package com.encsoft.demo.service;

import com.encsoft.demo.dao.UserDao;
import com.encsoft.demo.model.User;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author xiaomc 2016年05月17日
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public User getUser(long id) {
        return userDao.get(id);
    }

    public List<User> listAllUser() {
        return userDao.find();
    }
}
