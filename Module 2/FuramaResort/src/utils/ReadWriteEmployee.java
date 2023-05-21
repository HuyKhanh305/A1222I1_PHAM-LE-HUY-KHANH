package utils;

import model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteEmployee {

    public static final String EMPLOYEE_PATH = "C:\\Users\\mike.khanh\\Desktop\\CODEGYM\\A1222I1- PHAM LE HUY KHANH\\Module 2\\FuramaResort\\src\\data\\Employee.csv";

    public static List<Employee> readEmployeeFile() throws IOException, ClassNotFoundException {
        List<Employee> employeeList = new ArrayList<>();

        FileReader fileReader = new FileReader(EMPLOYEE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);
        String line;
        String temp[];
        Employee employee;

        while ((line = buff.readLine()) != null){
            temp = line.split(",");
            String id = temp[0];
            String name = temp[1];
            String gender = temp[2];
            String card = temp[3];
            String phoneNumber = temp[4];
            String mail = temp[5];
            String position = temp[6];
            String level = temp[7];
            int salary = Integer.parseInt(temp[8]);

            employee = new Employee(id,name,gender,card,phoneNumber,mail,position,level,salary);
            employeeList.add(employee);
        }
        buff.close();
        return employeeList;
    }

    public static void writeEmployeeList(List<Employee> employees) throws IOException {
        FileWriter fw = new FileWriter(EMPLOYEE_PATH);
        BufferedWriter buff = new BufferedWriter(fw);
        buff.write(employees.toString() + "\n");
        buff.close();
    }
}
