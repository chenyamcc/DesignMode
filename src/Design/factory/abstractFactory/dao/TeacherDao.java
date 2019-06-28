package factory.abstractFactory.dao;

import factory.abstractFactory.bean.Teacher;

/**
 * @author chenyam
 * @title: TeacherDao
 * @projectName DesignMode
 * @description: TODO
 * @date 2019/6/28 10:54
 */
public interface TeacherDao {
    void addTeacher(Teacher teacher);

    void deleteTeacher(int tid);
}
