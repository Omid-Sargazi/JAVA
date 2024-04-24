package test02;

public class professor extends person {
    private int ProfCode;
    private String Skill;

    public professor() {
        super();
        ProfCode = 0;
        Skill = "";
    }

    public professor(int pcode, String name, String family, String melicode, String skill) {
        super(name, melicode, family);
        this.ProfCode = pcode;
        // this.Family = family;
        // this.Mellicode = melicode;
        // this.Name = name;
        this.Skill = skill;
    }

    @Override
    public void setActive(boolean b) {
        if (Name.length() > 0) {
            super.setActive(b);
        }
    }

    public void setSkill(String newSkill) {
        this.Skill += ", " + newSkill;
    }

    @Override
    public String toString() {
        return "{" + ProfCode + " " + Skill + " " + Name + " " + "" + " " + Mellicode + " " + Family + ";"
                + " isActive:" + this.isActive() + "}";

    }

}
