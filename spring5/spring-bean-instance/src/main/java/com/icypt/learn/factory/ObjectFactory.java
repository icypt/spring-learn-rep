package com.icypt.learn.factory;


import com.icypt.learn.entity.Class;
import com.icypt.learn.entity.School;
import com.icypt.learn.entity.Student;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/1/2 22:12
 * version：1.0
 * description：
 */
public class ObjectFactory {
    //手动实例对象
    public static Student student = new Student();
    public static School school = new School();
    public static Class cla = new Class();

    public ObjectFactory() {

    }

//    //获得Student对象实例
//    public static Student createStudentObj() {
//        System.out.println("Student对象实例来自静态工厂方法获取...");
//        return  student;
//    }
//
//    //获得School对象实例
//    public static School createSchoolObj() {
//        System.out.println("School对象实例来自静态工厂方法获取...");
//        return  school;
//    }
//
//    //获得Class对象实例
//    public static Class createClassObj() {
//        System.out.println("Class对象实例来自静态工厂方法获取...");
//        return  cla;
//    }

    //获得Student对象实例
    public  Student createStudentObj() {
        System.out.println("Student对象实例来自实例化工厂...");
        return  student;
    }

    //获得School对象实例
    public  School createSchoolObj() {
        System.out.println("School对象实例来自实例化工厂...");
        return  school;
    }

    //获得Class对象实例
    public  Class createClassObj() {
        System.out.println("Class对象实例来自实例化工厂...");
        return  cla;
    }
}
