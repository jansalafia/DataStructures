package service;

import java.util.Set;

public interface WhimsicalToysEmployeeReporter {
    void recordEmployeeName(String name);
    String pickRandomEmployee();
    Set<String> getUniqueFirstNames();
    void countFirstNames();
    void addToWaitingList(String name);
    String getNextInLine();
    void displayEmployeesByUniqueFirstName();
    void countNumberOfEmployeesWithPopularFirstName();
    void displayWaitingListForTickets();
}
