package com.icypt.learn.factory;


import com.icypt.learn.interceptor.ArticleServiceMethodInterceptor;
import org.springframework.cglib.proxy.Enhancer;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/2 23:01
 * version：1.0
 * description：动态代理工厂基于CGLIB
 */
public class ProxyFactoryBaseCGLIB {
    private Object target;
    public ProxyFactoryBaseCGLIB(Object target) {
        this.target = target;
    }

    /**
     * 获取代理对象
     * @return
     */
    public Object getProxyInstance() {
        Class clazz = target.getClass();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new ArticleServiceMethodInterceptor());
        return enhancer.create();
    }

}
