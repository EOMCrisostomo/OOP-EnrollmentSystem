package org.example.model;

public class Course{
    private String name;
    private String program;
    private int id;

    public Course (int id, String name, String program){
        this.id = id;
        this.name = name;
        this.program = program;
    }

    //   Program
    public String getProgram (){
        return program;
    }

    public void setProgram (String program){
        this.program = program;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }


    public String toString() {
        return "Course{" +
                "courseID=" + id +
                ", courseName='" + name + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}
