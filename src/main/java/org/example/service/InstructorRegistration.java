package org.example.service;

import org.example.model.Instructor;

import java.util.ArrayList;
import java.util.Scanner;

public class InstructorRegistration {
    Scanner scan = new Scanner(System.in);
    private ArrayList<Instructor> instructorArrayList = new ArrayList();

    public void addInstructor (){
        System.out.print("Enter Course: ");
        String course = scan.next();
        System.out.print("Enter Insructor ID: ");
        int id = scan.nextInt();
        System.out.print("Enter Instrucor Name: ");
        String name = scan.next();
        instructorArrayList.add(new Instructor(id, name, course));
    }
    public void displayAll(){
        System.out.println(instructorArrayList);
    }

    public void updateInstructor (int id){
        for (int i = 0; i < instructorArrayList.size(); i++){
            if(instructorArrayList.get(i).getId() == (id)){
                System.out.print("Enter Course: ");
                String course = scan.next();
                System.out.print("Enter Instructor Name: ");
                String name = scan.next();
                instructorArrayList.set(i, new Instructor(id, name, course));
                break;
            }
        }
    }
    public String removeInstructor (int id){
        for (int i = 0; i < instructorArrayList.size(); i++){
            if(instructorArrayList.get(i).getId() == (id)){
                instructorArrayList.remove(i);
                return "Successfully Deleted";
            }
        }
        return "Error";
    }
}
