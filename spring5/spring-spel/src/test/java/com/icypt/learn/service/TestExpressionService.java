package com.icypt.learn.service;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/5/1 16:04
 * version：1.0
 * description：
 */
public class TestExpressionService {
    public static final Logger logger = LoggerFactory.getLogger(TestExpressionService.class);
    public static ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("application.xml");

    @Test
    public void TestToString() {
        ExpressionService expressionService = cpxac.getBean("expressionService", ExpressionService.class);
        logger.info("当前时间毫秒数：" + expressionService.getCurrentTimeMilis().toString());
        logger.info("获取对象属性,appId：" + expressionService.getAppId());
        logger.info("获取系统属性，java.version：" + expressionService.getJavaVersion());
        logger.info("转换科学计数法所得到的值，salary：" + expressionService.getSalary());
        logger.info("根据BeanID引入Bean：" + expressionService.getUserService().toString());
        logger.info("注入对象为空判断，appName：" + expressionService.getAppName());
        logger.info("指定返回结果类型，randomNum：" + expressionService.getRandomNum());
        logger.info("基本运算符的使用，baseOperator：" + expressionService.getBaseOperator());
        logger.info("三目运算符使用以及验证空，trinocular：" + expressionService.getTrinocular());
        logger.info("正则表达式使用，regex：" + expressionService.getRegex());
        logger.info("数组使用，arrayFirst：" + expressionService.getArrayFirst());
        logger.info("查询运算符,获得第一个值，queryFirst：" + expressionService.getQueryFirst());
        logger.info("查询运算符,获得最后一个值，queryLast：" + expressionService.getQueryLast());
        logger.info("投影运算符，projection：" + expressionService.getProjection());

    }
}
