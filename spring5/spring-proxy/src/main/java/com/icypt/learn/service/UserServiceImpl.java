package com.icypt.learn.service;

import java.util.HashMap;
import java.util.Map;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/2 22:40
 * version：1.0
 * description：用户的实现类
 */
public class UserServiceImpl implements UserService{
    @Override
    public Boolean insertUser() {
        return true;
    }

    @Override
    public String queryUserNameById(Long id) {
        //用户数据模拟
        Map<Long, String> userNameMap = new HashMap<>();
        userNameMap.put(1l, "张三");
        userNameMap.put(2l, "李四");
        userNameMap.put(3l, "王五");
        return userNameMap.get(id);
    }
}
