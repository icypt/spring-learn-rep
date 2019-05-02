package com.icypt.learn.interceptor;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/2 23:41
 * version：1.0
 * description：
 */
public class ArticleServiceMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //执行结果
        Object result = null;
        //如果是新增需要处理事务
        if(method.getName().equals("insertArticle")) {
            System.out.println("******代理**********开启事务****************");
            result = methodProxy.invokeSuper(o, objects);
            System.out.println("******代理**********提交事务****************");
        } else {
            //直接执行
            result = methodProxy.invokeSuper(o, objects);
        }
        return result;
    }
}
