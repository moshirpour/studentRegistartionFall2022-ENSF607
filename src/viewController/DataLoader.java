package viewController;

import model.*;

import java.util.ArrayList;

public class DataLoader {

    //Helper method
    public static ArrayList<Course> loadCoursesFromDataBase (){
        //Simulating a database!
        Course c1 = new Course ("ENSF", 609);
        Course c2 = new Course ("ENSF", 610);
        Course c3 = new Course ("ENSF", 611);

        ArrayList<Offering> tempOfferingList = new ArrayList<Offering>();
        tempOfferingList.add(new Offering(1));
        tempOfferingList.add(new Offering(2));
        ArrayList <Course> tempCourseList = new ArrayList<>();
        tempCourseList.add(c1);
        tempCourseList.get(0).setOfferingList(tempOfferingList);
        tempCourseList.add(c2);
        tempCourseList.add(c3);

        return tempCourseList;
    }
}
