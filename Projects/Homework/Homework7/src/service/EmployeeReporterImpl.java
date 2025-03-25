package service;

import comparator.EmployeeFirstNameComparator;
import comparator.EmployeeIdComparator;
import comparator.EmployeeLastNameComparator;
import comparator.EmployeeTitleComparator;
import comparator.EmployeeSalaryComparator;
import entity.Employee;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import util.EmployeeMocker;

public class EmployeeReporterImpl implements EmployeeReporter {

    @Override
    public void displayEmployeesById() {
        EmployeeIdComparator comp = new EmployeeIdComparator();
        SortedMap<Employee, Integer> sMap = new TreeMap<>(comp);

        EmployeeMocker.listOf8Employees.stream().forEach(e -> sMap.put(e, e.getId()));
        System.out.println("[Employees sorted by ID]: ");

        Set<Employee> ks = sMap.keySet();
        for (Employee key : ks) {
            System.out.println("Employee Id: " + " ==> " + sMap.get(key));
        }
        System.out.println(" ------- ");
    }

    @Override
    public void displayEmployeesByFirstName() {
        EmployeeFirstNameComparator comp = new EmployeeFirstNameComparator();
        SortedMap<Employee, String> sMap = new TreeMap<>(comp);

        EmployeeMocker.listOf8Employees.stream().forEach(e -> sMap.put(e, e.getFirstName()));
        System.out.println("[Employees sorted by First Name]: ");

        Set<Employee> ks = sMap.keySet();
        for (Employee key : ks) {
            System.out.println("Employee First Name: " + " ==> " + sMap.get(key));
        }
        System.out.println(" ------- ");
    }

    @Override
    public void displayEmployeesByLastName() {
        EmployeeLastNameComparator comp = new EmployeeLastNameComparator();
        SortedMap<Employee, String> sMap = new TreeMap<>(comp);

        EmployeeMocker.listOf8Employees.stream().forEach(e -> sMap.put(e, e.getLastName()));
        System.out.println("[Employees sorted by Last Name]: ");

        Set<Employee> ks = sMap.keySet();
        for (Employee key : ks) {
            System.out.println("Employee Last Name: " + " ==> " + sMap.get(key));
        }
        System.out.println(" ------- ");
    }

    @Override
    public void displayEmployeesByTitle() {
        EmployeeTitleComparator comp = new EmployeeTitleComparator();
        SortedMap<Employee, String> sMap = new TreeMap<>(comp);

        EmployeeMocker.listOf8Employees.stream().forEach(e -> sMap.put(e, e.getTitle()));
        System.out.println("[Employees sorted by Title]: ");

        Set<Employee> ks = sMap.keySet();
        for (Employee key : ks) {
            System.out.println("Employee Title: " + " ==> " + sMap.get(key));
        }
        System.out.println(" ------- ");
    }

    @Override
    public void displayEmployeesBySalary() {
        EmployeeSalaryComparator comp = new EmployeeSalaryComparator();
        SortedMap<Employee, Double> sMap = new TreeMap<>(comp);

        EmployeeMocker.listOf8Employees.stream().forEach(e -> sMap.put(e, e.getSalary()));
        System.out.println("[Employees sorted by Salary]: ");

        Set<Employee> ks = sMap.keySet();
        for (Employee key : ks) {
            System.out.println("Employee Salary: " + " ==> " + sMap.get(key));
        }
        System.out.println(" ------- ");
    }
}
