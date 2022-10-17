package Homework.dataAccess.jdbc;

import Homework.dataAccess.interfaces.InstructorDao;
import Homework.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Jdbc ile veritabanına eklendi.");

    }
}
