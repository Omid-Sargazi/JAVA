package SOLID.OnlineDoctorAppointment;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    String name;
    String specialty;
    List<Appointment> appointments = new ArrayList<>();

    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
}
