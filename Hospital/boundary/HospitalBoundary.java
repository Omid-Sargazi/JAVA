package Hospital.boundary;

import java.util.ArrayList;
import java.util.List;

import Hospital.Controller.HospitalController;
import Hospital.entity.Patient;

public class HospitalBoundary {
    private HospitalController controller;

    public HospitalBoundary() {
        controller = new HospitalController();
    }

    public void initialize() {
        controller.createHospital();
        controller.showHospitalDetails();
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("P1", "John Doe", 30, "Flu"));
        patients.add(new Patient("P2", "Jane Doe", 28, "Cough"));

        controller.assignPatientsToDoctor("D1", patients);
        controller.showHospitalDetails();
    }
}
