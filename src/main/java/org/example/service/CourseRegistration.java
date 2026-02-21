package org.example.service;
import org.example.model.Course;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseRegistration {
    Scanner scan = new Scanner(System.in);
    private ArrayList<Course> courseArrayList= new ArrayList();

    public void addCourse (){
        System.out.print("Enter Program: ");
        String program = scan.next();
        System.out.print("Enter Course ID: ");
        int ID = scan.nextInt();
        System.out.print("Enter Course Name: ");
        String name = scan.next();
        courseArrayList.add(new Course(name, ID, program));
}
    public void displayAll(){
        System.out.println(courseArrayList);
    }

    public void updateCourse (int ID){
        for (int i = 0; i < courseArrayList.size(); i++){
            if(courseArrayList.get(i).getcourseID() == (ID)){
                System.out.print("Enter Program: ");
                String program = scan.next();
                System.out.print("Enter Course Name: ");
                String name = scan.next();
                courseArrayList.set(i, new Course(name, ID, program));
                break;
            }
        }
    }
    public String removeCourse (int ID){
        for (int i = 0; i < courseArrayList.size(); i++){
            if(courseArrayList.get(i).getcourseID() == (ID)){
            courseArrayList.remove(i);
            return "Successfully Deleted";
            }
        }
        return "Error";
    }
}
