package factory.abstractFactory.dao.impl;

import factory.abstractFactory.bean.Student;
import factory.abstractFactory.dao.StudentDao;

/**
 * @author chenyam
 * @title: StudentDaoImplDb
 * @projectName DesignMode
 * @description: TODO
 * @date 2019/6/28 11:29
 */
public class StudentDaoImplDb implements StudentDao {
    @Override
    public void addStudent(Student student) {
        System.out.println("StudentDaoImplDb--addStudent");
    }

    @Override
    public void deleteStudent(int sid) {
        System.out.println("StudentDaoImplDb--deleteStudent");
    }
}
