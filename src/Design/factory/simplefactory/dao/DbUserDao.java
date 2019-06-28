package factory.simplefactory.dao;

/**
 * @author chenyam
 * @title: DbUserDao
 * @projectName DesignMode
 * @description: 用户dao的数据库实现
 * @date 2019/6/27 15:49
 */
public class DbUserDao implements UserDao {
    @Override
    public void addUser(){
        System.out.println("DbUserDao--addUser");
    }
    @Override
    public void deleteUser(){
        System.out.println("DbUserDao--deleteUser");
    }
}
