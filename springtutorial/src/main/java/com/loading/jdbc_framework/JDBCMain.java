package com.loading.jdbc_framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by wuyuxiang on 2017/2/28.
 */
public class JDBCMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/loading/jdbc_framework/Beans.xml");
        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

        System.out.println("------Records Creation------");
        studentJDBCTemplate.create("Zara", 11);
        studentJDBCTemplate.create("Nuha", 2);
        studentJDBCTemplate.create("Ayan", 15);

        System.out.println("------Listing Multiple Records------");
        List<Student> students=  studentJDBCTemplate.listStudents();
        for(Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println("------Updating Record with id = 2 ------");
        studentJDBCTemplate.update(2, 20);

        System.out.println("------Listing Record with id = 2 ------");
        Student student = studentJDBCTemplate.getStudent(2);
        System.out.println(student.toString());

        System.out.println("------Deleting Record with id = 2 ------");
        studentJDBCTemplate.delete(2);
    }
}
