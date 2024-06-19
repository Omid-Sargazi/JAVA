package SOLID.OnlineDoctorAppointment;

public interface AppointmentRepository {
    void addAppointment(Appointment appointment);

    int getAppointmentCount();
}
