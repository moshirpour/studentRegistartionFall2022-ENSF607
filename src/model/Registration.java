package model;

public class Registration {

    private Offering theOffering;
    private Student theStudent;

    private char theGrade;



    public void register (Student theStudent, Offering theOffering){
        this.theStudent = theStudent;
        this.theOffering = theOffering;
        theOffering.addStudent(this);
        theStudent.addCourse(this);
    }

    public void setTheGrade (char theGrade){
        this.theGrade = theGrade;
    }
    public char getTheGrade (){
        return theGrade;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "theGrade=" + theGrade +
                '}';
    }
}
