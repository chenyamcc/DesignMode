package factory.abstractFactory.dao;

import factory.abstractFactory.bean.Student;

/**
 * @author chenyam
 * @title: StudentDao
 * @projectName DesignMode
 * @description: TODO
 * @date 2019/6/28 11:28
 */
public interface StudentDao {
    void addStudent(Student student);

    void deleteStudent(int sid);
}
