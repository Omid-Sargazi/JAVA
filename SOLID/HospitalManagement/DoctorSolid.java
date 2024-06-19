package SOLID.HospitalManagement;

import java.util.ArrayList;
import java.util.List;

public class DoctorSolid {
    private String name;
    private int specialty;
    private List<PatientSolid> patientSolids = new ArrayList<>();

    public DoctorSolid(String name, int specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public void addPatientSolid(PatientSolid patientSolid) {
        patientSolids.add(patientSolid);
    }

    public int getPatientCount() {
        return patientSolids.size();
    }

}
