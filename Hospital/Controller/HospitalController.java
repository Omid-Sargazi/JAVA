package Hospital.Controller;

import java.util.ArrayList;
import java.util.List;

import Hospital.entity.Department;
import Hospital.entity.Doctor;
import Hospital.entity.Hospital;
import Hospital.entity.Patient;

public class HospitalController {

    private Hospital hospital;

    public void createHospital() {
        List<Doctor> doctors1 = new ArrayList<>();
        doctors1.add(new Doctor("D1", "Dr. Smith", 45, "Cardiology"));
        doctors1.add(new Doctor("D2", "Dr. Jones", 50, "Neurology"));

        List<Doctor> doctors2 = new ArrayList<>();
        doctors2.add(new Doctor("D3", "Dr. Taylor", 39, "Orthopedics"));
        doctors2.add(new Doctor("D4", "Dr. Brown", 47, "Dermatology"));

        List<Department> departments = new ArrayList<>();
        departments.add(new Department("Cardiology", doctors1, null));
        departments.add(new Department("Orthopedics", doctors2, null));

        hospital = new Hospital("City Hospital", departments);

    }

    public void showHospitalDetails() {
        if (hospital != null) {
            hospital.showDetails();
        } else {
            System.out.println("No hospital created yet.");
        }
    }

    public void assignPatientsToDoctor(String doctorId, List<Patient> patients) {
        for (Department department : hospital.gDepartments()) {
            for (Doctor doctor : department.geDoctors()) {
                if (doctor.getId().equals(doctorId)) {
                    doctor.setPatients(patients);
                    return;
                }
            }
        }
    }
}
