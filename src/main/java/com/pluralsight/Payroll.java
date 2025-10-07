package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        try {
            Scanner user = new Scanner(System.in);

            System.out.println("Enter the name of the file employee file to process: ");
            String processFileName =user.nextLine();

            System.out.println("Enter the name of the payroll file to create: ");
            String fileName = user.nextLine();

            FileReader fileReader = new FileReader("src/main/resources/DataFiles/"+ processFileName);
            BufferedReader bufReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter("src/main/resources/DataFiles/" + fileName);
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            String input;

            Employee[] employeeList = new Employee[10];

            int count = 0;

            while((input = bufReader.readLine()) != null) {
                String[] tokens = input.split("\\|");
                if (!tokens[0].equals("id")) { //Skipping the header row

                    int id = Integer.parseInt(tokens[0]); //id
                    String name = tokens[1];
                    double hoursWorked = Double.parseDouble(tokens[2]);
                    double payRate = Double.parseDouble(tokens[3]);

                    employeeList[count] = new Employee(id, name, hoursWorked, payRate);

                    System.out.printf("EmployeeID: %d\nEmployee Name: %s\nGross Pay: $%.2f\n\n", employeeList[count].getEmployeeId(), employeeList[count].getName(), employeeList[count].getGrossPay());
                    fileName = String.format("[\n {\n \"id\": %d,\n \"Name\": \"%s\", \n \"Gross Pay\": $%.2f\n }\n]", employeeList[count].getEmployeeId(), employeeList[count].getName(), employeeList[count].getGrossPay());
                    bufWriter.write(fileName);
                    count++;
                }

            }



            System.out.println(employeeList[0].getName());

            bufReader.close();
            bufWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}