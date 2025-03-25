package service;

import java.util.*;

public class WhimsicalToysEmployeeReporterImpl implements WhimsicalToysEmployeeReporter {
    private Set<String> employeeNames = new HashSet<>();
    private Map<String, Integer> nameCounts = new HashMap<>();
    private Queue<String> waitingList = new LinkedList<>();

    @Override
    public void recordEmployeeName(String name) {
        employeeNames.add(name);
    }

    @Override
    public String pickRandomEmployee() {
        List<String> names = new ArrayList<>(employeeNames);
        Collections.shuffle(names);
        return names.get(0);
    }

    @Override
    public Set<String> getUniqueFirstNames() {
        Set<String> uniqueFirstNames = new HashSet<>();
        for (String name : employeeNames) {
            uniqueFirstNames.add(name.split(" ")[0]);
        }
        return uniqueFirstNames;
    }

    @Override
    public void countFirstNames() {
        nameCounts.clear();
        for (String name : employeeNames) {
            String firstName = name.split(" ")[0];
            nameCounts.put(firstName, nameCounts.getOrDefault(firstName, 0) + 1);
        }
    }

    @Override
    public void addToWaitingList(String name) {
        waitingList.add(name);
    }

    @Override
    public String getNextInLine() {
        return waitingList.poll();
    }

    @Override
    public void displayEmployeesByUniqueFirstName() {
        Set<String> uniqueFirstNames = getUniqueFirstNames();
        System.out.println("[Unique First Names]: ");
        for (String firstName : uniqueFirstNames) {
            System.out.println(firstName);
        }
        System.out.println(" ------- ");
    }

    @Override
    public void countNumberOfEmployeesWithPopularFirstName() {
        countFirstNames();
        System.out.println("[Number of Employees with Popular First Names]: ");
        for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(" ------- ");
    }

    @Override
    public void displayWaitingListForTickets() {
        System.out.println("[Waiting List for Tickets]: ");
        for (String name : waitingList) {
            System.out.println(name);
        }
        System.out.println(" ------- ");
    }
}
