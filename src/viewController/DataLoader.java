package viewController;

import model.Course;

import java.util.ArrayList;

public class DataLoader {

    //Helper method
    public static ArrayList<Course> loadCoursesFromDataBase (){
        //Simulating a database!
        Course c1 = new Course ("ENSF", 609);
        Course c2 = new Course ("ENSF", 610);
        Course c3 = new Course ("ENSF", 611);

        ArrayList <Course> tempCourseList = new ArrayList<>();
        tempCourseList.add(c1);
        tempCourseList.add(c2);
        tempCourseList.add(c3);

        return tempCourseList;
    }
}
