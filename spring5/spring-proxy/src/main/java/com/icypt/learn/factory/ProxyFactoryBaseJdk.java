package com.icypt.learn.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/2 23:01
 * version：1.0
 * description：动态代理工厂基于JDK
 */
public class ProxyFactoryBaseJdk {
    private Object target;
    public ProxyFactoryBaseJdk(Object target) {
        this.target = target;
    }

    /**
     * 获取代理对象
     * @return
     */
    public Object getProxyInstance() {
        Class clazz = target.getClass();
        Object proxy = Proxy.newProxyInstance(
                clazz.getClassLoader(), //获取目标类的类加载器
                clazz.getInterfaces(), //获取目标类所实现的所有接口
                new InvocationHandler() //执行代理对象方法时触发
                {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //执行结果
                Object result = null;
                //如果是新增需要处理事务
                if(method.getName().equals("insertUser")) {
                    System.out.println("******代理**********开启事务****************");
                    result = method.invoke(target, args);
                    System.out.println("******代理**********提交事务****************");
                } else {
                    //直接执行
                    result = method.invoke(target, args);
                }
                return result;
            }
        });
        return proxy;
    }
}
