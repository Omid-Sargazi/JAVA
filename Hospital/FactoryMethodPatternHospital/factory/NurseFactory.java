package Hospital.FactoryMethodPatternHospital.factory;

import Hospital.FactoryMethodPatternHospital.entity.MedicalStaff;
import Hospital.FactoryMethodPatternHospital.entity.Nurse;

public class NurseFactory implements MedicalStaffFactory {
    @Override
    public MedicalStaff createMedicalStaff(String id, String name, String additionalInfo) {
        // TODO Auto-generated method stub
        return new Nurse(id, name);
    }
}
