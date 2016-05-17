/*
 * Copyright (c) 2015 金联所. All rights reserved.
 *
 * The copyright to the computer software herein is the property of 金联所.
 * The software may be used and/or copied only with the written permission
 * of 金联所, or in accordance with the terms and conditions stipulated in
 * the agreement/contract under which the software has been supplied.
 *
 */

package com.encsoft.demo.model;

/**
 * @author xiaomc 2016年05月17日
 */
public class User extends BaseModel{

    private String username;

    private String password;

    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
