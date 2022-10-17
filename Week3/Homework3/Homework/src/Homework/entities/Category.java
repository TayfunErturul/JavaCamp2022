package Homework.entities;

public class Category {
    private int id;
    private String categoryName;
    private int count;

    public Category() {

    }

    public Category(int id, String categoryName, int count) {
        this.id = id;
        this.categoryName = categoryName;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
