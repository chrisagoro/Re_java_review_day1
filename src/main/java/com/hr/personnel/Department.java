package com.hr.personnel;

public class Department {

    private String name;
    private String location;
    private Employee[] employees= new Employee[100];
    private int currentIndex = 0;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public  void addEmployee(com.hr.personnel.Employee employee){
        employees[currentIndex] = employee;
        currentIndex++;

    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked(){
        int numberOfEmployeeWhoWorked = 0;
        for (int i = 0; i < currentIndex; i++);
        int i = 0;
        if (employees[i].work().contains("worked")) {
            numberOfEmployeeWhoWorked++;
        }
        return numberOfEmployeeWhoWorked;
    }


    public int getCurrentIndex() {
        return currentIndex;
    }

    public double computeDepartmentMonthlyTotalCompensation(){
        double sum = 0.0;
        for(int i = 0; 1 < currentIndex; i++) {
            double employeeCompensation = employees[i].computeMonthlyCompensation();
            sum = employeeCompensation;
        }
        return sum;
    }

    public Employee[] getEmployees() {
        return employees;
    }
}