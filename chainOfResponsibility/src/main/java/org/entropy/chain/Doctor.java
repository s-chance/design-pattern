package org.entropy.chain;

public class Doctor implements Department {
    private Department next;

    @Override
    public void execute(Patient patient) {
        if (patient.doctorCheckUpDone) {
            System.out.println("Doctor checkup already done");
            this.next.execute(patient);
        } else {
            System.out.println("Doctor checking patient");
            patient.doctorCheckUpDone = true;
            this.next.execute(patient);
        }
    }

    @Override
    public void setNext(Department next) {
        this.next = next;
    }
}
