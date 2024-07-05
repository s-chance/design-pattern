package org.entropy.chain;

public class Medical implements Department {
    private Department next;

    @Override
    public void execute(Patient patient) {
        if (patient.medicineDone) {
            System.out.println("Medicine already given to patient");
            this.next.execute(patient);
        } else {
            System.out.println("Medical giving medicine to patient");
            patient.medicineDone = true;
            this.next.execute(patient);
        }
    }

    @Override
    public void setNext(Department next) {
        this.next = next;
    }
}
