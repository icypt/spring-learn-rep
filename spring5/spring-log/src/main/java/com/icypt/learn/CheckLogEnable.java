package com.icypt.learn;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/1/1 0:20
 * version：1.0
 * description：验证Spring日志配置程序
 */

public class CheckLogEnable {


    //取得日志实例
//    public static Logger logger = LoggerFactory.getLogger(CheckLogEnable.class);
      public  static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(CheckLogEnable.class);
    public static void main(String[] args){
        //加载Spring源数据配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"application.xml"});
        logger.info( context.getDisplayName());

    }
}
