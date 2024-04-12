public class BigInt {
    private String Number;

    public BigInt() {
        Number = "0";
    }

    public BigInt(String s) {
        Number = s;
    }

    public BigInt(BigInt b) {
        this.Number = b.Get();
    }

    public void Set(String s) {
        this.Number = s;
    }

    public String Get() {
        return this.Number;
    }

    @Override
    public String toString() {
        return this.Get();
    }

    public void setSum(String s1, String s2) {
        this.Number = s1 + s2;
    }

    public void setSum(BigInt b1, BigInt b2) {
        setSum(b1.Get(), b2.Get());
    }

    public void setSum(String s1, BigInt b2) {
        setSum(s1, b2.Get());
    }

    public void setSum(BigInt b1, String s2) {
        setSum(b1.Get(), s2);
    }
}
