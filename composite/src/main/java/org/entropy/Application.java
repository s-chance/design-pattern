package org.entropy;

public class Application {
    public static void main(String[] args) {
        Company headquarters = new Company();
        headquarters.print();

        Company subsidiary = new Company();
        subsidiary.remove("A");
        subsidiary.add(new Employee("AA", "full stack developer"));
        subsidiary.print();
    }
}

