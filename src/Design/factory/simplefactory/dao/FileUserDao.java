package factory.simplefactory.dao;

/**
 * @author chenyam
 * @title: FileUserDao
 * @projectName DesignMode
 * @description: 用户dao的文件实现
 * @date 2019/6/27 15:51
 */
public class FileUserDao implements UserDao {
    @Override
    public void addUser(){
        System.out.println("FileUserDao--addUser");
    }

    @Override

    public void deleteUser() {
        System.out.println("FileUserDao--deleteUser");
    }
}
