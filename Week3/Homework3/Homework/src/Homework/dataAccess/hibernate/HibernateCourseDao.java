package Homework.dataAccess.hibernate;

import Homework.dataAccess.interfaces.CourseDao;
import Homework.entities.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi.");

    }
}
