package factory.factoryMethod.factory;

import factory.factoryMethod.dao.DbUserDao;
import factory.factoryMethod.dao.UserDao;

/**
 * @author chenyam
 * @title: DbUserDaoFacory
 * @projectName DesignMode
 * @description: TODO
 * @date 2019/6/27 16:51
 */
public class DbUserDaoFacory implements UserDaoFactory {
    @Override
    public UserDao getUserDao() {
        return new DbUserDao();
    }
}
