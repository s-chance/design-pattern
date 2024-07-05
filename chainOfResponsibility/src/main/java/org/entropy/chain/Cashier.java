package org.entropy.chain;

public class Cashier implements Department {
    private Department next;

    @Override
    public void execute(Patient patient) {
        if (patient.paymentDone) {
            System.out.println("Payment Done");
        } else {
            System.out.println("Cashier getting money from patient patient");
        }
    }

    @Override
    public void setNext(Department next) {
        this.next = next;
    }
}
