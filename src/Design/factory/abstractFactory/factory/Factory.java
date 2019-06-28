package factory.abstractFactory.factory;

import factory.abstractFactory.dao.StudentDao;
import factory.abstractFactory.dao.TeacherDao;

/**
 * @author chenyam
 * @title: Factory
 * @projectName DesignMode
 * @description: TODO
 * @date 2019/6/28 11:31
 */
public interface Factory {
    StudentDao createStudentDao();

    TeacherDao createTeacherDao();
}
