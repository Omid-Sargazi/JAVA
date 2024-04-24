package test02;

public class person {
    protected String Name;
    protected String Mellicode;
    protected String Family;

    private boolean isActive;

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public person() {
        Name = "";
        Mellicode = "";
        Family = "";
    }

    public person(String name, String mellicode, String family) {
        this.Name = name;
        this.Mellicode = mellicode;
        this.Family = family;
    }
}
