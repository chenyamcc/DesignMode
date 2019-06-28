package factory.simplefactory.factory;

import factory.simplefactory.dao.UserDao;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author chenyam
 * @title: UserDaoFactory
 * @projectName DesignMode
 * @description: 简单工厂的userdao工厂
 * @date 2019/6/27 15:52
 */
public class UserDaoFactory {

    public static UserDao getUserDao(){
        UserDao dao = null;
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("UserDao.properties"));
            String type = properties.getProperty("simpletype");
            Class aClass = Class.forName(type);
            dao = (UserDao) aClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dao;
    }
}
