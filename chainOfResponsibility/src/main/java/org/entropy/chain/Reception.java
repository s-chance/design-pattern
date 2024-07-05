package org.entropy.chain;

public class Reception implements Department {
    Department next;

    @Override
    public void execute(Patient patient) {
        if (patient.registrationDone) {
            System.out.println("Patient registration already done");
            this.next.execute(patient);
        } else {
            System.out.println("Reception registering patient");
            patient.registrationDone = true;
            this.next.execute(patient);
        }
    }

    @Override
    public void setNext(Department next) {
        this.next = next;
    }
}
