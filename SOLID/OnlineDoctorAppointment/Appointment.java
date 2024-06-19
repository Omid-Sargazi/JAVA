package SOLID.OnlineDoctorAppointment;

public class Appointment {
    String date;
    String time;
    Patient patient;

    public Appointment(String date, String time, Patient patient) {
        this.date = date;
        this.time = time;
        this.patient = patient;
    }
}
