package SOLID.OnlineDoctorAppointment;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Smith", "Cardiology");
        doctor.addAppointment(new Appointment("2024-06-19", "10:00", new Patient("John Doe", 30)));
        System.out.println("Doctor: " + doctor.name + ", Appointments: " + doctor.appointments.size());
    }
}
