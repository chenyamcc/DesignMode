package factory.simplefactory.test;

import factory.simplefactory.dao.UserDao;
import factory.simplefactory.factory.UserDaoFactory;

/**
 * @author chenyam
 * @title: Test
 * @projectName DesignMode
 * @description: TODO
 * @date 2019/6/27 16:01
 */
public class test {
    public static void main(String[] args) {
        UserDao userDao = UserDaoFactory.getUserDao();
        userDao.addUser();
        userDao.deleteUser();
    }
}
