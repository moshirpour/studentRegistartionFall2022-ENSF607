package viewController;

import model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CourseCat cat = new CourseCat(DataLoader.loadCoursesFromDataBase());

        System.out.println(cat);

        ArrayList<Course> tempCourses = cat.getCourseList();

        tempCourses.get(1).setCourseName("CHEM");

        System.out.println(cat);

    }

}