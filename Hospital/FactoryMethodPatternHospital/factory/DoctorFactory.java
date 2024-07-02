package Hospital.FactoryMethodPatternHospital.factory;

import Hospital.FactoryMethodPatternHospital.entity.Doctor;
import Hospital.FactoryMethodPatternHospital.entity.MedicalStaff;

public class DoctorFactory implements MedicalStaffFactory {
    @Override
    public MedicalStaff createMedicalStaff(String id, String name, String specialization) {
        // TODO Auto-generated method stub
        return new Doctor(id, name, specialization);
    }
}
