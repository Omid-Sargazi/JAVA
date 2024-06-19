package SOLID.HospitalManagement;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr.Omid", "Cardiology");
        doctor.addPatient(new Patient("Omid", 40));
        doctor.addPatient(new Patient("Dadi", 43));
        System.out.println("Doctor" + doctor.getName() + " ,Patients" + doctor.getPatients().size());
    }
}
