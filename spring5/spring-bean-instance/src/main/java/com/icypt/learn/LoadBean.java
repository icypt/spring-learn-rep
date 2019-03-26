package com.icypt.learn;

import com.icypt.learn.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/1/2 20:51
 * version：1.0
 * description：
 */
public class LoadBean {

    public static Logger logger = LoggerFactory.getLogger(LoadBean.class);

    public static void main(String[] args) {
        //实例化Spring容器
        ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("application.xml");
        //或得Spring实例化好的StudentBean对象
        Student student = applicationContext.getBean("student",Student.class);
        //调用bean方法
        student.sayHello();
    }
}
