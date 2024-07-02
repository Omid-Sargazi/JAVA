package Hospital.FactoryMethodPatternHospital.main;

import Hospital.FactoryMethodPatternHospital.entity.MedicalStaff;
import Hospital.FactoryMethodPatternHospital.factory.MedicalStaffFactory;
import Hospital.FactoryMethodPatternHospital.factory.MedicalStaffFactoryCreator;

public class HospitalMain {
    public static void main(String[] args) {
        MedicalStaffFactory doctorFactory = MedicalStaffFactoryCreator.getFactory("doctor");
        MedicalStaff doctor = doctorFactory.createMedicalStaff("D1", "Dr. John Smith", "Cardiology");
        doctor.showDetails();

        MedicalStaffFactory nurseFactory = MedicalStaffFactoryCreator.getFactory("nurse");
        MedicalStaff nurse = nurseFactory.createMedicalStaff("N1", "Nurse Jane Doe", "");
        nurse.showDetails();

        MedicalStaffFactory surgeonFactory = MedicalStaffFactoryCreator.getFactory("surgeon");
        MedicalStaff surgeon = surgeonFactory.createMedicalStaff("S1", "Dr. Sam Brown", "Orthopedics");
        surgeon.showDetails();
    }
}
