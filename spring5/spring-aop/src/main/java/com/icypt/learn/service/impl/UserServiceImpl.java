package com.icypt.learn.service.impl;

import com.icypt.learn.annotation.LogAnnotationParam;
import com.icypt.learn.entity.User;
import com.icypt.learn.service.UserService;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/2 18:15
 * version：1.0
 * description：
 */
@LogAnnotationParam
public class UserServiceImpl implements UserService {
    @Override
    public boolean saveUser(User user, String userName) {
        return false;
    }
}
