package Homework.business;

import Homework.core.logging.Logger;
import Homework.dataAccess.interfaces.CourseDao;
import Homework.entities.Course;

public class CourseManager {

    private CourseDao courseDao;
    private Logger[] loggers;
    Course[] courses = { new Course(101, "C#", 100, "Engin Demiroğ",1), new Course(102, "Java", 125, "Engin Demiroğ",1),
            new Course(103, "HTML", 25, "Mustafa Murat Coşkun",2), new Course(104, "CSS", 40, "Mustafa Murat Coşkun",2),
            new Course(105, "Javascript", 40, "Mustafa Murat Coşkun",2),
            new Course(106, "Android", 75, "Atıl Samancıoğlu",3), new Course(107, "IOS", 95, "Atıl Samancıoğlu",3) };

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        for (Course item : courses) {
            if (item.getCourseName() == course.getCourseName()) {
                throw new Exception("Kurs ismi tekrar edemez");
            } else if (course.getPrice() < 0) {
                throw new Exception("Bir kursun fiyatı 0'dan küçük olamaz");
            }
        }

        courseDao.add(course);
        for (Logger log : loggers) {
            log.add(course.getCourseName());
        }
    }
}
