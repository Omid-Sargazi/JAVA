package Hospital.FactoryMethodPatternHospital.entity;

public class Surgeon implements MedicalStaff {
    private String id;
    private String name;
    private String field;

    public Surgeon(String id, String name, String field) {
        this.name = name;
        this.field = field;
        this.id = id;
    }

    @Override
    public void showDetails() {
        // TODO Auto-generated method stub
        System.out.println("Surgeon [ID=" + id + ", Name=" + name + ", Field=" + field + "]");
    }
}
