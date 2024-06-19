package SOLID.OnlineDoctorAppointment;

import java.util.ArrayList;
import java.util.List;

public class DoctorSolid implements AppointmentRepository {
    private String name;
    private String specialty;
    private List<Appointment> appointments = new ArrayList<>();

    public DoctorSolid(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    @Override
    public void addAppointment(Appointment appointment) {
        // TODO Auto-generated method stub
        appointments.add(appointment);

    }

    @Override
    public int getAppointmentCount() {
        // TODO Auto-generated method stub
        return appointments.size();
    }
}
