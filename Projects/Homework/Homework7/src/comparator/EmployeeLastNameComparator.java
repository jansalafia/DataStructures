package comparator;

import entity.Employee;
import java.util.Comparator;

public class EmployeeLastNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int lastNameComparison = e1.getLastName().compareTo(e2.getLastName());
        if (lastNameComparison != 0) {
            return lastNameComparison;
        } else {
            return Integer.compare(e1.getId(), e2.getId());
        }
    }
}