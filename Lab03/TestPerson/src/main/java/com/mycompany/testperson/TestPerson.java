package com.mycompany.testperson;
public class TestPerson 
{

    public static void main(String[] args) 
    {
       Student student = new Student("John Doe", 1001, "Computer Science");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Course: " + student.getCourse());

        System.out.println();

        // Creating a Lecturer object
        Lecturer lecturer = new Lecturer("Dr. Smith", 2001, "Physics");
        System.out.println("Lecturer Name: " + lecturer.getName());
        System.out.println("Lecturer ID: " + lecturer.getId());
        System.out.println("Lecturer Programme: " + lecturer.getProgramme());
    }
    }

