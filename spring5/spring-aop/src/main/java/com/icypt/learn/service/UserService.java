package com.icypt.learn.service;

import com.icypt.learn.entity.User;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/2 18:04
 * version：1.0
 * description：
 */
public interface UserService {
    public boolean saveUser(User user, String userName);
}
