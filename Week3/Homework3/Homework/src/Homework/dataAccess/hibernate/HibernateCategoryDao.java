package Homework.dataAccess.hibernate;

import Homework.dataAccess.interfaces.CategoryDao;
import Homework.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi.");

    }
}
