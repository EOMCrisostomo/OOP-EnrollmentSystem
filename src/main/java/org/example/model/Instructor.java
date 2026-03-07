package org.example.model;

public class Instructor extends Person {
    private String course;

    public Instructor(){
        super();
    }

    public Instructor(int id, String name, String course){
        super();
        this.course = course;
    }

    public String getCourse (String course){
        return course;
    }

    public void setCourse (){
        this.course = course;
    }
}
