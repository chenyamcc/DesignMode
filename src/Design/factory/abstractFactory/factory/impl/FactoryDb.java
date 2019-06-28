package factory.abstractFactory.factory.impl;

import factory.abstractFactory.dao.StudentDao;
import factory.abstractFactory.dao.TeacherDao;
import factory.abstractFactory.dao.impl.StudentDaoImplDb;
import factory.abstractFactory.dao.impl.TeacherDaoImplDb;
import factory.abstractFactory.factory.Factory;

/**
 * @author chenyam
 * @title: FactoryDb
 * @projectName DesignMode
 * @description: TODO
 * @date 2019/6/28 11:33
 */
public class FactoryDb implements Factory {
    @Override
    public StudentDao createStudentDao() {
        return new StudentDaoImplDb();
    }

    @Override
    public TeacherDao createTeacherDao() {
        return new TeacherDaoImplDb();
    }
}
