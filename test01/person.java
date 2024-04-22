package test01;

public class person {

    protected String Family;
    protected String mellicode;
    protected String name;

    private boolean isActive;

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public person() {
        name = "";
        mellicode = "";
        Family = "";
    }

    public person(String Name, String family, String Mellicode) {
        this.Family = family;
        this.name = Name;
        this.mellicode = Mellicode;
    }

}
