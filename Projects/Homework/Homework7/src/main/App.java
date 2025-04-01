

import service.EmployeeReporter;
import service.EmployeeReporterImpl;
import service.WhimsicalToysEmployeeReporter;
import service.WhimsicalToysEmployeeReporterImpl;

public class App {

    public static void main(String[] args) {
        EmployeeReporter employeeReporter = new EmployeeReporterImpl();

        employeeReporter.displayEmployeesById();
        employeeReporter.displayEmployeesByFirstName();
        employeeReporter.displayEmployeesByLastName();
        employeeReporter.displayEmployeesByTitle();
        employeeReporter.displayEmployeesBySalary();

        WhimsicalToysEmployeeReporter whimsicalToysEmployeeReporter = new WhimsicalToysEmployeeReporterImpl();

        // Record some employee names
        whimsicalToysEmployeeReporter.recordEmployeeName("John Smith");
        whimsicalToysEmployeeReporter.recordEmployeeName("Rob Jones");
        whimsicalToysEmployeeReporter.recordEmployeeName("Tony Pisano");
        whimsicalToysEmployeeReporter.recordEmployeeName("Harold Chappy");
        whimsicalToysEmployeeReporter.recordEmployeeName("John Gingerhead");


        // Display unique first names
        whimsicalToysEmployeeReporter.displayEmployeesByUniqueFirstName();

        // Count number of employees with popular first names
        whimsicalToysEmployeeReporter.countNumberOfEmployeesWithPopularFirstName();

        // Add employees to the waiting list for  tickets
        whimsicalToysEmployeeReporter.addToWaitingList("John Robertson");
        whimsicalToysEmployeeReporter.addToWaitingList("John Nagy");
        whimsicalToysEmployeeReporter.addToWaitingList("Rob Shagglebury");

        // Display the waiting list for tickets
        whimsicalToysEmployeeReporter.displayWaitingListForTickets();
    }
}