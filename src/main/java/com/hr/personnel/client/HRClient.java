package com.hr.personnel.client;

import java.time.LocalDate;
import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

class HRClient {
    public static void main(String[] args) {
        SalariedEmployee employee1 = new SalariedEmployee("Chris ", LocalDate.of(2020, 4, 20), 3000.0);


        SalariedEmployee employee2 = new SalariedEmployee("Ben ",
                LocalDate.of(1999, 01, 03), 2500.0);


        HourlyEmployee employee3 = new HourlyEmployee("Dave", LocalDate.of(2019, 02, 01)
                , 15, 10);

        Department department = new Department("Marketing", "America");
        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);

        Employee[] employees = department.getEmployees();
        int currentIndex = department.getCurrentIndex();

        for (int i = 0; i < currentIndex; i++) {
            System.out.println(employees[i].getEmployeeInfo());
        }

        int numberOfEmployeeWhoWorked = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        System.out.println("number = " + numberOfEmployeeWhoWorked);

        double sum = department.computeDepartmentMonthlyTotalCompensation();
        System.out.println(sum);
    }
}