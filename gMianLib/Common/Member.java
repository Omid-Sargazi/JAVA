package gMianLib.Common;

public class Member {
    private String MNO;
    private String Name;
    private String Family;
    private String MelliCode;
    private String Address;
    private String Phone;

    public String getMNO() {
        return MNO;
    }

    public void setMNO(String mNO) {
        MNO = mNO;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFamily() {
        return Family;
    }

    public void setFamily(String family) {
        Family = family;
    }

    public String getMelliCode() {
        return MelliCode;
    }

    public void setMelliCode(String melliCode) {
        MelliCode = melliCode;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return "Member [MNO=" + MNO + ", Name=" + Name + ", Family=" + Family + ", MelliCode=" + MelliCode
                + ", Address=" + Address + ", Phone=" + Phone + "]";
    }

}
