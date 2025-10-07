package com.pluralsight;

import java.io.*;
import java.util.Arrays;

public class Payroll {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("src/main/resources/DataFiles/employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;

            // Employee
            while((input = bufReader.readLine()) != null) {
             String[] token = input.split("\\|");
                int token[0] = this.employeeId;
                String token[1] = this.name;
                int token[2] =   this.hoursWorked;
                double token[3] = this.payRate;


                Employee[] employees = {new Employee(token)};
                System.out.println(employees[0]);
            }

            bufReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
