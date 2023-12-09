package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmployeeServiceImpl implements com.greatlearning.service.EmployeeService {

    @Override
    public String generateEmailId(String fName, String lName, String dept) {
        // TODO Auto-generated method stub
        return fName.toLowerCase()+"."+lName.toLowerCase()+"."+dept+"@.abc.com";
    }

    @Override
    public String generatePassword() {
        String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small="abcdefghijklmnopqrstuvwxyz";
        String num="0123456789";
        String sym="!@#$%^&*()";
        String full=caps+small+num+sym;
        String pwd="";
        for(int i=0;i<8;i++){
            pwd+=full.charAt(new Random().nextInt(full.length()));
        }
        return pwd;
    }

    @Override
    public void showEmployeeDetails(Employee e) {
        System.out.println("Employee First Name is :"+e.getfName());
        System.out.println("Employee Last Name is :"+e.getlName());
        System.out.println("Dear "+e.getfName()+" your generated credentials are as follows");
        System.out.println("Employee Email is :"+e.getEmail());
        System.out.println("Employee Password is :"+e.getPwd());
    }

}
