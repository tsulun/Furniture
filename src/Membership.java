public class Membership {

    private String nName;
    private String nBirth;
    private double nFee;

    public Membership(String name,String dateOfBirth, double fees){
        this.nName = name;
        this.nBirth = dateOfBirth;
        this.nFee = fees;
    }

    public String getName() {
        return nName;
    }

    public String getnBirthday() {
        return  nBirth;
    }

    public double getFees() {
        return  nFee;
    }
}
