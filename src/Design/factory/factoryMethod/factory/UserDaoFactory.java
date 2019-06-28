package factory.factoryMethod.factory;

import factory.factoryMethod.dao.UserDao;

/**
 * @author chenyam
 * @title: UserDaoFactory
 * @projectName DesignMode
 * @description: TODO
 * @date 2019/6/27 16:49
 */
public interface UserDaoFactory {
    UserDao getUserDao();
}
