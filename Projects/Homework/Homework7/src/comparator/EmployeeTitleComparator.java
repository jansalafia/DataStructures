package comparator;

import entity.Employee;
import java.util.Comparator;

public class EmployeeTitleComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getTitle().compareTo(e2.getTitle());
    }
}