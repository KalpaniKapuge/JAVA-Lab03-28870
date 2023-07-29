package com.mycompany.employeetest;
public class EmployeeTest 
{
    public static void main(String[] args) 
    {   
        
        Employee mrBogdan = new Employee();
        Employee msBird = new Employee();
        
        mrBogdan.setEmpID(100);
        mrBogdan.setEmpName("Mr. Bogdan");
        mrBogdan.setEmpDesignation("Software Engineer");

        msBird.setEmpID(101);
        msBird.setEmpName("Ms. Bird");
        msBird.setEmpDesignation("Data Scientist");
        
        System.out.println("Details of Mr. Bogdan:");
        System.out.println("Employee ID: " + mrBogdan.getEmpID());
        System.out.println("Employee Name: " + mrBogdan.getEmpName());
        System.out.println("Employee Designation: " + mrBogdan.getEmpDesignation());

        System.out.println();

        System.out.println("Details of Ms. Bird:");
        System.out.println("Employee ID: " + msBird.getEmpID());
        System.out.println("Employee Name: " + msBird.getEmpName());
        System.out.println("Employee Designation: " + msBird.getEmpDesignation());
    }
    }

