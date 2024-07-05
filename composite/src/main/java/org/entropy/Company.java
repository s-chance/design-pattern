package org.entropy;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employeeList = new ArrayList<>() {
        {
            add(new Employee("A", "backend developer"));
            add(new Employee("B", "frontend developer"));
            add(new Employee("C", "ops developer"));
        }
    };

    public void add(Employee employee) {
        employeeList.add(employee);
    }

    public void remove(String id) {
        employeeList.removeIf(e -> e.getId().equals(id));
    }

    public void print() {
        employeeList.forEach(System.out::println);
    }
}
