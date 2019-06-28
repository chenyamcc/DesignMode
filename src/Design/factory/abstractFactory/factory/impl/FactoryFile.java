package factory.abstractFactory.factory.impl;

import factory.abstractFactory.dao.StudentDao;
import factory.abstractFactory.dao.TeacherDao;
import factory.abstractFactory.dao.impl.StudentDaoImplFIle;
import factory.abstractFactory.dao.impl.TeacherDaoImplFile;
import factory.abstractFactory.factory.Factory;

/**
 * @author chenyam
 * @title: FactoryFile
 * @projectName DesignMode
 * @description: TODO
 * @date 2019/6/28 11:35
 */
public class FactoryFile implements Factory {
    @Override
    public StudentDao createStudentDao() {
        return new StudentDaoImplFIle();
    }

    @Override
    public TeacherDao createTeacherDao() {
        return new TeacherDaoImplFile();
    }
}
