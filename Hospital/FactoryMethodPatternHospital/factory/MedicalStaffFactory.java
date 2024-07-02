package Hospital.FactoryMethodPatternHospital.factory;

import Hospital.FactoryMethodPatternHospital.entity.MedicalStaff;

public interface MedicalStaffFactory {
    MedicalStaff createMedicalStaff(String id, String name, String additionalInfo);
}
