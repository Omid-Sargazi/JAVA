package Hospital.FactoryMethodPatternHospital.entity;

public class Nurse implements MedicalStaff {
    private String id;
    private String name;

    public Nurse(String id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void showDetails() {
        // TODO Auto-generated method stub
        System.out.println("Nurse [ID=" + id + ", Name=" + name + "]");
    }
}
