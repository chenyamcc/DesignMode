package factory.abstractFactory.test;

import factory.abstractFactory.dao.StudentDao;
import factory.abstractFactory.factory.Factory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.regex.Pattern;

/**
 * @author chenyam
 * @title: Test
 * @projectName DesignMode
 * @description: TODO
 * @date 2019/6/28 11:36
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("UserDao.properties"));
        String type = properties.getProperty("abstracttype");
        Class aClass = Class.forName(type);
        Factory factory = (Factory) aClass.newInstance();
        StudentDao dao = factory.createStudentDao();
        dao.addStudent(null);
        dao.deleteStudent(1);

    }
}
