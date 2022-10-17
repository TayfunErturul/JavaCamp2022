package Homework.business;

import Homework.core.logging.Logger;
import Homework.dataAccess.interfaces.InstructorDao;
import Homework.entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {
        instructorDao.add(instructor);
        for (Logger logger : loggers) {
            logger.add(instructor.getFirstName() + " " + instructor.getLastName());
        }
    }
}
