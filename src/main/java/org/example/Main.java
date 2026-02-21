package org.example;
import org.example.service.CourseRegistration;
import org.example.model.Course;
import org.example.model.Student;
import org.example.service.StudentRegistration;

import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// + public | - private | # protected | ~ package private
    Scanner scan = new Scanner(System.in);
        CourseRegistration cRegister = new CourseRegistration();
        StudentRegistration sRegister = new StudentRegistration();
    while (true) {
    System.out.println("[1] = Course\n[2] = Student\n[3] Exit\nChoice: ");
    int start = scan.nextInt();
    int choice;
        switch (start) {
            case 1:
                System.out.println("[1] Save Course \n[2] Display Course \n[3] Update Course \n[4] Remove Course\n[5] Exit \nEnter Choice: ");
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        cRegister.addCourse();
                        cRegister.displayAll();
                        break;
                    case 2:
                        cRegister.displayAll();
                        break;
                    case 3:
                        System.out.print("Enter Course ID: ");
                        int ID = scan.nextInt();
                        cRegister.updateCourse(ID);
                        break;
                    case 4:
                        System.out.println("Enter Course ID: ");
                        ID = scan.nextInt();
                        cRegister.removeCourse(ID);
                        break;
                    case 5:
                        break;
                }
            case 2:
                System.out.println("[1] Save Student \n[2] Display Student \n[3] Update Student \n[4] Remove Student \n[5] Exit\nEnter Choice: ");
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        sRegister.addStudent();
                        break;
                    case 2:
                        sRegister.displayAll();
                        break;
                    case 3:
                        System.out.print("Enter Student ID: ");
                        int ID = scan.nextInt();
                        sRegister.updateStudent(ID);
                        break;
                    case 4:
                        System.out.println("Enter Student ID: ");
                        ID = scan.nextInt();
                        sRegister.removeStudent(ID);
                        break;
                    case 5:
                        break;
                }
                }
        System.out.println("\n[0] = End Program\n[1] = Run Again\nAnswer:");
        int loop = scan.nextInt();
        if (loop == 0){
            break;
        }
        }
        }
    }

