package model;

import java.util.ArrayList;

public class Student {

    private String name;
    private int id;

    private ArrayList<Registration> courseList;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        courseList = new ArrayList<>();
    }

    public void addCourse (Registration r){
        courseList.add(r);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void registerForCourse (CourseCat cat, String courseName, int courseId, int secNumber) {

        Course myCourse = cat.searchCat(courseName, courseId);

        if (myCourse == null)
            return;
        //if the course exists, then we can look at the section
        Offering theOffering = myCourse.getOffering(secNumber);
        Registration reg = new Registration ();
        reg.register(this, theOffering);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", courseList=" + courseList +
                '}';
    }
}
