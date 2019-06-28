package factory.abstractFactory.dao.impl;

import factory.abstractFactory.bean.Student;
import factory.abstractFactory.dao.StudentDao;

/**
 * @author chenyam
 * @title: StudentDaoImplFIle
 * @projectName DesignMode
 * @description: TODO
 * @date 2019/6/28 11:30
 */
public class StudentDaoImplFIle implements StudentDao {
    @Override
    public void addStudent(Student student) {
        System.out.println("StudentDaoImplFIle--addStudent");
    }

    @Override
    public void deleteStudent(int sid) {
        System.out.println("StudentDaoImplFIle--deleteStudent");
    }
}
