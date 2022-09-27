package model;

import java.util.ArrayList;

public class CourseCat {

    ArrayList <Course> courseList;

    public CourseCat (ArrayList <Course> courseList){
        this.courseList = courseList;
    }
    public ArrayList <Course> getCourseList (){
        return courseList;
    }

    @Override
    public String toString() {
        return "CourseCat{" +
                "courseList=" + courseList +
                '}';
    }
}
