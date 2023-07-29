package com.mycompany.testperson;
public class Student extends Person
{
     private String course;

    // Constructor
    public Student(String name, int id, String course) {
        super(name, id);
        this.course = course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
    
    
}
