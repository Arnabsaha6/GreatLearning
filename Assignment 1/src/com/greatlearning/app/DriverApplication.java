package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeServiceImpl;

public class DriverApplication {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first name");
        String fName=sc.next();
        System.out.println("Please enter last name");
        String lName=sc.next();
        System.out.println("Please enter the department from the following");
        System.out.println("1.Technical");
        System.out.println("2.Admin");
        System.out.println("3.Human Resource");
        System.out.println("4.Legal");
        int ch=sc.nextInt();
        String dept="";
        switch(ch){
            case 1: dept="Technical";
                break;
            case 2: dept="Admin";
                break;
            case 3: dept="Human Resource";
                break;
            case 4: dept="Legal";
                break;
            default: System.out.println("Wrong Choice"); System.exit(0);
        }
        EmployeeServiceImpl cs= new EmployeeServiceImpl();
        Employee e =new Employee(fName,lName,cs.generateEmailId(fName, lName, dept),dept,cs.generatePassword());
        cs.showEmployeeDetails(e);
        sc.close();

    }

}
