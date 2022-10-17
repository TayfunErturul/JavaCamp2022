package Homework.dataAccess.hibernate;

import Homework.dataAccess.interfaces.InstructorDao;
import Homework.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına eklendi.");

    }
}
