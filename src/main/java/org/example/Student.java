package org.example;

public class Student {
    private int studentID;
    private String studentName;
    private String program;

    public Student (){

    }
    public Student (String studentName, int studentID, String program){
        this.studentName = studentName;
        this.program = program;
        this.studentID = studentID;
    }
//    Name
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
//    ID
    public int getStudentID (){
        return studentID;
    }
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }
//   Program
    public String getProgram (){
        return program;
    }
    public void setProgram (String program){
        this.program = program;
    }
    public void display (){
        System.out.println("-----------------Student Information-----------------");
        System.out.printf("Student Name: %s \n", studentName);
        System.out.printf("Student ID: %d \n", studentID);
        System.out.printf("Program: %s\n", program);
    }
}
