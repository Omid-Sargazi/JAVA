package Interfaces;

public class Professor extends Person {
    private int profCode;
    private String Skill;

    public Professor(String name, String skill, String family, int pcode) {
        this.Name = name;
        this.profCode = pcode;
        this.Skill = skill;
        this.Family = family;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "[" + Name + " , " + ", " + Skill + ", " + Family + ", " + profCode + "]";
    }

}
