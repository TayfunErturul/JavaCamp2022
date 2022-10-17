package Homework.entities;

public class Course {

    private int id;
    private String courseName;
    private double price;
    private String instructorName;
    private int categoryId;

    public Course() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Course(int id, String courseName, double price, String instructorName,int categoryId) {
        this.id = id;
        this.courseName = courseName;
        this.price = price;
        this.instructorName = instructorName;
        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
