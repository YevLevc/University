package com.solvd.laba.university.dao;


import com.solvd.laba.university.entity.Student;
import com.solvd.laba.university.session.MyBatisFactory;
import org.apache.ibatis.session.SqlSession;

public class MBStudentDAO implements IStudentDAO {
    private IStudentDAO entityDAO;
    private Class<IStudentDAO> DAOClass = IStudentDAO.class;
    @Override
    public void create(Student object) {

        try (SqlSession session = MyBatisFactory.getSqlSessionFactory().openSession()) {
            entityDAO = session.getMapper(DAOClass);
            entityDAO.create(object);
            session.commit();
        }

    }

    @Override
    public Student getById(int id) {
        try (SqlSession session = MyBatisFactory.getSqlSessionFactory().openSession()) {
            entityDAO = session.getMapper(DAOClass);
            Student s = entityDAO.getById(id);
            session.commit();
            return s;
        }
    }

    @Override
    public void update(Student object) {
    }

    @Override
    public void remove(int id) {
        try (SqlSession session = MyBatisFactory.getSqlSessionFactory().openSession()) {
            entityDAO = session.getMapper(DAOClass);
            entityDAO.remove(id);
            session.commit();
        }
    }
}
