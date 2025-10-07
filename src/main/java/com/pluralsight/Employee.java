package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private int hoursWorked;
   private double payRate;


    public Employee(String[] token) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;

    }

    @Override
    public String toString() {
        return "Employee: " +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", payRate=" + payRate;
    }

    public int getemployeeId() {
        return employeeId;
    }

    public void setemployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    public double getGrossPay(){
        double grossPay = hoursWorked * payRate;
        return grossPay;

    }


}
