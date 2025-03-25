package comparator;

import entity.Employee;
import java.util.Comparator;

public class EmployeeFirstNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int firstNameComparison = e1.getFirstName().compareTo(e2.getFirstName());
        if (firstNameComparison != 0) {
            return firstNameComparison;
        } else {
            return Integer.compare(e1.getId(), e2.getId());
        }
    }
}