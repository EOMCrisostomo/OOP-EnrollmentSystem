package org.example.service;
import org.example.model.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentRegistration {
    Scanner scan = new Scanner(System.in);
    private ArrayList<Student> studentArrayList = new ArrayList();

    public void addStudent (){
        System.out.print("Enter Program: ");
        String program = scan.next();
        System.out.print("Enter Student ID: ");
        int id = scan.nextInt();
        System.out.print("Enter Student Name: ");
        String name = scan.next();
        studentArrayList.add(new Student(id, name, program));
    }
    public void displayAll(){
        System.out.println(studentArrayList);
    }

    public void updateStudent (int id){
        for (int i = 0; i < studentArrayList.size(); i++){
            if(studentArrayList.get(i).getId() == (id)){
                System.out.print("Enter Program: ");
                String program = scan.next();
                System.out.print("Enter Student Name: ");
                String name = scan.next();
                studentArrayList.set(i, new Student(id, name, program));
                break;
            }
        }
    }
    public String removeStudent (int id){
        for (int i = 0; i < studentArrayList.size(); i++){
            if(studentArrayList.get(i).getId() == (id)){
                studentArrayList.remove(i);
                return "Successfully Deleted";
            }
        }
        return "Error";
    }
}
