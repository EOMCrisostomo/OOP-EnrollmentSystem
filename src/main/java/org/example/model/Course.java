package org.example.model;

public class Course extends Person{
    private String program;
    public Course (){
        super();
    }
    public Course (int id, String name, String program){
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
        return "Course{" +
                "courseID=" + getId() +
                ", courseName='" + getName() + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}
