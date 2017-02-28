package com.loading.jdbc_framework;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by wuyuxiang on 2017/2/28.
 */
public interface StudentDao {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    void setDataSource(DataSource ds);

    /**
     * This is the method to be used to create
     * a record in the student table.
     */
    void create(String name, Integer age);

    /**
     * This is the method to be used to list down
     * a record from the student table corresponding
     * to a passed student id.
     */
    Student getStudent(Integer id);

    /**
     * This is the method to be used to list down
     * all the records from the student table.
     */
    List<Student> listStudents();

    /**
     * This is the method to be used to delete
     * a record from the student table corresponding
     * to a passed student id.
     */
    void delete(Integer id);

    /**
     * This is the method to be used to update
     * a record into the student table.
     */
    void update(Integer id, Integer age);
}
