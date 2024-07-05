package org.entropy;

public class Employee {
    private String id;
    private String dept;

    public Employee(String id, String dept) {
        this.id = id;
        this.dept = dept;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
