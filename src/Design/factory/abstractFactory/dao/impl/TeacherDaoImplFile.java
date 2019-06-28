package factory.abstractFactory.dao.impl;

import factory.abstractFactory.bean.Teacher;
import factory.abstractFactory.dao.TeacherDao;

/**
 * @author chenyam
 * @title: TeacherDaoImplFile
 * @projectName DesignMode
 * @description: TODO
 * @date 2019/6/28 11:20
 */
public class TeacherDaoImplFile implements TeacherDao {
    @Override
    public void addTeacher(Teacher teacher) {
        System.out.println("TeacherDaoImplFile--addTeacher");
    }

    @Override
    public void deleteTeacher(int tid) {
        System.out.println("TeacherDaoImplFile--deleteTeacher");
    }
}
