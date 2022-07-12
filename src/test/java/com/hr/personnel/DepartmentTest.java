package com.hr.personnel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DepartmentTest {
    Department department;
    Employee employee1;
    Employee employee2;

    @Before
    public void setUp(){
        department = new Department("Marketing", "America");
        employee1 = new SalariedEmployee("Liveth ",
                LocalDate.of(2022, 01, 10), 2500.0);
        employee2 = new HourlyEmployee("Daniel ",
                LocalDate.of(2022, 01, 10), 10, 15.0);
        department.addEmployee(employee1);
        department.addEmployee(employee2);
    }

    @Test
    public void addEmployee_should_return_correct_number_of_employee_when_added() {
        int currentIndex = department.getCurrentIndex();
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Benson", LocalDate.of(2018, 05,01),20, 10.0);
        department.addEmployee(hourlyEmployee1);
        Assert.assertEquals(1+ currentIndex, department.getCurrentIndex());
    }

    @Test
    public void letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        Assert.assertEquals(1, department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked());
    }
}