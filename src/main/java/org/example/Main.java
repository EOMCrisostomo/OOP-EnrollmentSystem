package org.example;

import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// + public | - private | # protected | ~ package private
    Scanner scan = new Scanner(System.in);
    Student s = new Student();
    Course c = new Course();

    s.setStudentID(1200014254);
    s.setProgram("Information Technology");
    s.setStudentName("Editha Crisostomo");
    s.display();

    c.setProgram("Information Technology");
    c.setCourseID("0001");
    c.setCourseName("Integrative Programming");
    c.display();
    // Testing

    }
}