package org.entropy;

import org.entropy.chain.*;

public class Application {
    public static void main(String[] args) {
        Cashier cashier = new Cashier();

        // Set next for medical department
        Medical medical = new Medical();
        medical.setNext(cashier);


        // Set next for doctor department
        Doctor doctor = new Doctor();
        doctor.setNext(medical);

        // Set next for reception department
        Reception reception = new Reception();
        reception.setNext(doctor);

        Patient patient = new Patient();

        // Patient visiting
        reception.execute(patient);
    }
}
