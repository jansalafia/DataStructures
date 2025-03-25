package comparator;

import java.util.Comparator;

import entity.Employee;

public class EmployeeIdComparator implements Comparator<Employee> {

	@Override
    public int compare(Employee e1, Employee e2) {
        return e1.getId().compareTo(e2.getId());
    }

}