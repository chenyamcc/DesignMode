package factory.factoryMethod.factory;

import factory.factoryMethod.dao.FileUserDao;
import factory.factoryMethod.dao.UserDao;

/**
 * @author chenyam
 * @title: FileUserDaoFactory
 * @projectName DesignMode
 * @description: TODO
 * @date 2019/6/27 16:52
 */
public class FileUserDaoFactory implements UserDaoFactory {
    @Override
    public UserDao getUserDao() {
        return new FileUserDao();
    }
}
