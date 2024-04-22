package test01;

public class prefossor extends person {

    private int Profcode;
    private String Skill;

    public prefossor() {
        super();// this execute constructor parent
        Profcode = 0;
        Skill = "";
    }

    public prefossor(int pcode, String name, String family, String mellicode, String Skill) {
        super(name, family, mellicode);
        this.Profcode = pcode;
        // this.name = name;
        // this.Family = family;
        // this.mellicode = mellicode;
        this.Skill = Skill;

    }

    public void setActive(boolean isActive) {
        // we hide this method in parent and we want to check a if
        if (name.length() == 0) {
            super.setActive(false);
        }
    }

    public void setSkill(String newSkill) {
        this.Skill += ", " + newSkill;
    }

    @Override
    public String toString() {
        return "Profcode:" + this.Profcode + "Name: " + this.name + "Family: " +
                this.Family + "MelliCode: "
                + this.mellicode + "Skills " + this.Skill;
    }
}
