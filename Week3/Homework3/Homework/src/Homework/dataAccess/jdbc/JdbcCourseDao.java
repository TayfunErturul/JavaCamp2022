package Homework.dataAccess.jdbc;

import Homework.dataAccess.interfaces.CourseDao;
import Homework.entities.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Jdbc ile veritabanına eklendi.");

    }
}
