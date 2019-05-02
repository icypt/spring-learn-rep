package com.icypt.learn.service;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/2 22:38
 * version：1.0
 * description：用户服务接口
 */
public interface UserService {
    /**
     * 保存用户信息
     * @return
     */
    public Boolean insertUser();

    /**
     * 根据id查询用户名
     * @param id
     * @return
     */
    public String queryUserNameById(Long id);
}
