package factory.abstractFactory.dao.impl;

import factory.abstractFactory.bean.Teacher;
import factory.abstractFactory.dao.TeacherDao;

/**
 * @author chenyam
 * @title: TeacherDaoImplDb
 * @projectName DesignMode
 * @description: TODO
 * @date 2019/6/28 10:55
 */
public class TeacherDaoImplDb implements TeacherDao {
    @Override
    public void addTeacher(Teacher teacher) {
        System.out.println("TeacherDaoImplDb--addTeacher");
    }

    @Override
    public void deleteTeacher(int tid) {
        System.out.println("TeacherDaoImplDb--deleteTeacher");
    }
}
