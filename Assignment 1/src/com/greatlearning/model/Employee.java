package com.greatlearning.model;

public class Employee {
    private String fName;
    private String lName;
    private String email;
    private String dept;
    private String pwd;

    public Employee() {
    }

    public Employee(String fName, String lName, String email, String dept, String pwd) {
        super();
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.dept = dept;
        this.pwd = pwd;
    }

    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


}
