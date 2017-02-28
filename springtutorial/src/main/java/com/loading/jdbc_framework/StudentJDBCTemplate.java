package com.loading.jdbc_framework;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by wuyuxiang on 2017/2/28.
 */
public class StudentJDBCTemplate implements StudentDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String name, Integer age) {
        String sql = "insert into student(name, age) values(?,?)";
        int result = jdbcTemplateObject.update(sql, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age + " result = " + result);
    }

    @Override
    public Student getStudent(Integer id) {
        String sql = "select id,name,age from student where id=?";
        Student student = jdbcTemplateObject.queryForObject(sql, new Object[] { id }, new StudentMapper());
        return student;
    }

    @Override
    public List<Student> listStudents() {
        String sql = "select id,name,age from student";
        List<Student> students = jdbcTemplateObject.query(sql, new StudentMapper());
        return students;
    }

    @Override
    public void delete(Integer id) {
        String sql = "delete from student where id=?";
        int result = jdbcTemplateObject.update(sql, id);
        System.out.println("Deleted Record with id = " + id + " result = " + result);
    }

    @Override
    public void update(Integer id, Integer age) {
        String sql = "update student set age=? where id=?";
        int result = jdbcTemplateObject.update(sql, age, id);
        System.out.println("Updated Record with id = " + id + " result = " + result);
    }
}
