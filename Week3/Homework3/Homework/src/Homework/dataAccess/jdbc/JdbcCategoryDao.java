package Homework.dataAccess.jdbc;

import Homework.dataAccess.interfaces.CategoryDao;
import Homework.entities.Category;

public class JdbcCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Jdbc ile veritabanına eklendi.");

    }
}
