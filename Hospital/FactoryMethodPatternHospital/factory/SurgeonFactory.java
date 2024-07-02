package Hospital.FactoryMethodPatternHospital.factory;

import Hospital.FactoryMethodPatternHospital.entity.MedicalStaff;
import Hospital.FactoryMethodPatternHospital.entity.Surgeon;

public class SurgeonFactory implements MedicalStaffFactory {
    @Override
    public MedicalStaff createMedicalStaff(String id, String name, String field) {
        // TODO Auto-generated method stub
        return new Surgeon(id, name, field);
    }
}
