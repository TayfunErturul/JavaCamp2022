package Homework;

import Homework.business.CategoryManager;
import Homework.business.CourseManager;
import Homework.business.InstructorManager;
import Homework.core.logging.DatabaseLogger;
import Homework.core.logging.FileLogger;
import Homework.core.logging.Logger;
import Homework.core.logging.MailLogger;
import Homework.dataAccess.hibernate.HibernateCategoryDao;
import Homework.dataAccess.hibernate.HibernateInstructorDao;
import Homework.dataAccess.jdbc.JdbcCourseDao;
import Homework.entities.Category;
import Homework.entities.Course;
import Homework.entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception{
        Logger[] loggers= {new DatabaseLogger(),new FileLogger(),new MailLogger()};


        Category category = new Category(4, "Algoritma ve Veri Yapılari", 1);
        Course course = new Course(108, "Pyhton", 90, "Engin Demiroğ", 1);
        Instructor instructor = new Instructor(1, "Engin", "Demiroğ");

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
        categoryManager.add(category);

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
        courseManager.add(course);

        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
        instructorManager.add(instructor);
    }
}