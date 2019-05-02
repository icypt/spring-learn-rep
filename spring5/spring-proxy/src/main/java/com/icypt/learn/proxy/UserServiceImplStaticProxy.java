package com.icypt.learn.proxy;

import com.icypt.learn.service.UserService;
import com.icypt.learn.service.UserServiceImpl;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/2 22:44
 * version：1.0
 * description：用户实现类的代理
 */
public class UserServiceImplStaticProxy implements UserService {
    private UserServiceImpl targetObj = new UserServiceImpl();
    @Override
    public Boolean insertUser() {
        System.out.println("******代理**********开启事务****************");
        boolean flag = targetObj.insertUser();
        System.out.println("******代理**********提交事务****************");
        return flag;
    }

    @Override
    public String queryUserNameById(Long id) {
        return targetObj.queryUserNameById(id);
    }

}
