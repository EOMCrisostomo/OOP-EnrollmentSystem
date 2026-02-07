package org.example;

import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// + public | - private | # protected | ~ package private
    Scanner scan = new Scanner(System.in);
    Student student = new Student();
    Course course = new Course();

    student.setStudentID(1200014254);
    student.setProgram("Information Technology");
    student.setStudentName("Editha Crisostomo");
    student.display();

    course.setProgram("Information Technology");
    course.setCourseID("0001");
    course.setCourseName("Integrative Programming");
    course.display();
    // Testing

    }
}