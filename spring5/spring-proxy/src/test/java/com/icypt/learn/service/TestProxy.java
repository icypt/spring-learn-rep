package com.icypt.learn.service;

import com.icypt.learn.factory.ProxyFactoryBaseCGLIB;
import com.icypt.learn.factory.ProxyFactoryBaseJdk;
import com.icypt.learn.proxy.UserServiceImplStaticProxy;
import org.junit.Test;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/2 22:52
 * version：1.0
 * description：代理设计模式测试类
 */
public class TestProxy {
    /**
     * 测试静态代理
     */
    @Test
    public void testStaticProxy() {
        UserServiceImplStaticProxy userServiceImplStaticProxy = new UserServiceImplStaticProxy();
        Boolean flag = userServiceImplStaticProxy.insertUser();
        if(flag) {
            System.out.println("用户新增成功！");
        } else {
            System.out.println("用户新增失败！");
        }
        System.out.println("*************************静态代理分割线*******************************");
        String userName = userServiceImplStaticProxy.queryUserNameById(1l);
        System.out.println("id为1的用户名称为:" + userName);
    }

    @Test
    public void testJdkAutoProxy() {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        ProxyFactoryBaseJdk factoryBaseJdk = new ProxyFactoryBaseJdk(userServiceImpl);
        UserService userServiceProxy = (UserService)factoryBaseJdk.getProxyInstance();
        Boolean flag = userServiceProxy.insertUser();
        if(flag) {
            System.out.println("用户新增成功！");
        } else {
            System.out.println("用户新增失败！");
        }
        System.out.println("*************************Jdk动态代理分割线*******************************");
        String userName = userServiceProxy.queryUserNameById(1l);
        System.out.println("id为1的用户名称为:" + userName);


    }

    @Test
    public void testCGLIBAutoProxy() {
        ArticleService articleService = new ArticleService();
        ProxyFactoryBaseCGLIB proxyFactoryBaseCGLIB = new ProxyFactoryBaseCGLIB(articleService);
        ArticleService ArticleServiceProxy = (ArticleService)proxyFactoryBaseCGLIB.getProxyInstance();
        Boolean flag = ArticleServiceProxy.insertArticle();
        if(flag) {
            System.out.println("文章新增成功！");
        } else {
            System.out.println("文章新增失败！");
        }
        System.out.println("*************************CGLIB动态代理分割线*******************************");
        String articleName = ArticleServiceProxy.queryArticleNameById(1l);
        System.out.println("id为1的文章名称为:" + articleName);
    }
}
