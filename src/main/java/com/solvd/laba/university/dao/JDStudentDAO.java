package com.solvd.laba.university.dao;

import com.solvd.laba.university.connection.BasicConnectionPool;
import com.solvd.laba.university.connection.ConnectionPool;
import com.solvd.laba.university.connection.Credentials;
import com.solvd.laba.university.entity.Student;

import java.sql.*;

public class StudentDAO implements IStudentDAO, Credentials {
    private static final ConnectionPool connectionPool;

    static {
        try {
            connectionPool = BasicConnectionPool.create(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void create(Student object) {

    }

    @Override
    public Student getById(int id) {
        try (Connection connection = connectionPool.getConnection()) {
            PreparedStatement ps = connection.prepareStatement("SELECT * from mydb.students where id = "+id+"");
            ps.execute();
            ResultSet rs = ps.getResultSet();

            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setSurname(rs.getString("surname"));
                student.setBirthDate(rs.getString("birth_date"));
                student.setAddress(rs.getString("address"));
                return student;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void update(Student object) {
        try (Statement statement = connectionPool.getConnection().createStatement()) {
            statement.execute("UPDATE `mydb`.`students` SET " +
                    "`name` = '"+object.getName()+"', `surname` = '"+object.getSurname()+"', " +
                    "`birth_date` = '"+object.getBirthDate()+"', `address` = '"+object.getAddress()+"' " +
                    "WHERE (`id` = '"+object.getId()+"');");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void remove(int id) {
        try (Statement statement = connectionPool.getConnection().createStatement()) {
                statement.execute("DELETE FROM `mydb`.`students` WHERE (`id` = '"+id+"');");
            } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
