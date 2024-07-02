package Hospital.FactoryMethodPatternHospital.factory;

public class MedicalStaffFactoryCreator {
    public static MedicalStaffFactory getFactory(String type) {
        switch (type.toLowerCase()) {
            case "doctor":
                return new DoctorFactory();

            case "nurse":
                return new NurseFactory();

            case "surgeon":
                return new SurgeonFactory();

            default:
                throw new IllegalArgumentException("Unknown medical staff type");
        }
    }
}
