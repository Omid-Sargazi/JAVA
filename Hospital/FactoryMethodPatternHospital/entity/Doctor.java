package Hospital.FactoryMethodPatternHospital.entity;

public class Doctor implements MedicalStaff {
    private String id;
    private String name;
    private String specialization;

    public Doctor(String id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public void showDetails() {
        // TODO Auto-generated method stub
        System.out.println("Doctor [ID=" + id + ", Name=" + name + ", Specialization=" + specialization + "]");
    }
}
