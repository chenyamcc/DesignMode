package factory.factoryMethod.test;

import factory.factoryMethod.dao.UserDao;
import factory.factoryMethod.factory.DbUserDaoFacory;
import factory.factoryMethod.factory.UserDaoFactory;

/**
 * @author chenyam
 * @title: Test
 * @projectName DesignMode
 * @description: TODO
 * @date 2019/6/27 16:54
 */
public class test {
    public static void main(String[] args) {
        UserDaoFactory factory = new DbUserDaoFacory();
        UserDao userDao = factory.getUserDao();
        userDao.addUser();
    }
}
