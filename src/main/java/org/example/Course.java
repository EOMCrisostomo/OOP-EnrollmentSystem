package org.example;

public class Course {
    private String courseID;
    private String courseName;
    private String program;

    public Course (){

    }
    public Course (String courseName, String courseID, String program){
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
    public String getcourseID (){
        return courseID;
    }
    public void setCourseID(String courseID){
        this.courseID = courseID;
    }
    //   Program
    public String getProgram (){
        return program;
    }
    public void setProgram (String program){
        this.program = program;
    }

    public void display (){
        System.out.println("-----------------Course Information-----------------");
        System.out.printf("Program: %s \n", program);
        System.out.printf("Course: %s \n", courseName);
        System.out.printf("Course ID: %s \n", courseID);

    }
}
