package org.example.model;

public class Course {
    private int courseID;
    private String courseName;
    private String program;

    public Course (){

    }
    public Course (String courseName, int courseID, String program){
        this.courseName = courseName;
        this.courseID = courseID;
        this.program = program;
    }
    //    Name
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    //    ID
    public int getcourseID (){
        return courseID;
    }
    public void setCourseID(int courseID){
        this.courseID = courseID;
    }
    //   Program
    public String getProgram (){
        return program;
    }
    public void setProgram (String program){
        this.program = program;
    }
    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", courseName='" + courseName + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}
