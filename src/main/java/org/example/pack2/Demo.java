package org.example.pack2;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {


        Employee e1=new Employee(1,"Ashish"," Software Engineer");
        Employee e2=new Employee(1,"Ashok"," Software Engineer");

        List a=new ArrayList<>();
        a.add(e1);
        a.add(e2);

        System.err.println(a);



    }
}

class Employee{
    private int empId;
    private String empName;
    private String department;

    public int getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(int empId, String empName, String department) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
    }


}
