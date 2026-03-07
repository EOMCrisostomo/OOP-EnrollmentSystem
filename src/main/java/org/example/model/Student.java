package org.example.model;

public class Student extends Person{
    private String program;

    public Student(){
        super();
    }
    public Student (int id, String name, String program){
        super(id, name);
        this.program = program;
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
        return "Student{" +
                "studentID=" + getId() +
                ", studentName='" + getName() + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}
