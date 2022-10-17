package Homework.business;

import Homework.core.logging.Logger;
import Homework.dataAccess.interfaces.CategoryDao;
import Homework.entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    Category[] categories = { new Category(1, "Backend", 2), new Category(2, "Frontend", 3), new Category(3, "Mobile", 2) };

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception  {
        for (Category item : categories) {
            if (item.getCategoryName() == category.getCategoryName()) {
                throw new Exception("Kategori ismi tekrar edemez");
            }
        }

        categoryDao.add(category);

        for (Logger log : loggers) {
            log.add(category.getCategoryName());
        }

    }
}
