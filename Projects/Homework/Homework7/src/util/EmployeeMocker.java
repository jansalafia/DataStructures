package util;

import entity.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMocker {

	public static List <Employee> listOf8Employees;
	
	static{
		listOf8Employees = new ArrayList<>();
		listOf8Employees.add(new Employee(1,"john","smith","rlevel", 20000.0));
		listOf8Employees.add(new Employee(2,"rob","jones","olevel", 25000.0));
		listOf8Employees.add(new Employee(3,"tony","pisano","klevel", 60000.0));
		listOf8Employees.add(new Employee(4,"harold","chappy","jlevel", 80000.0));
		listOf8Employees.add(new Employee(5,"sebastian","gingerhead","clevel", 120000.0));
		listOf8Employees.add(new Employee(6,"john","robertson","blevel", 240000.0));
		listOf8Employees.add(new Employee(7,"john","nagy","jlevel", 80000.0));
		listOf8Employees.add(new Employee(8,"rob","shagglebury","llevel", 550000.0));
	}

	
}
