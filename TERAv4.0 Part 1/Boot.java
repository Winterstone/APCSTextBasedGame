public class Boot extends Gear{
    private double smult;
    public Boot(String n, String d, int e, double s, boolean b){
        super (n, d, e, b);
        smult = s;
    }

    public double getSMult(){
        return smult;
    }

    public void addSMult(double s){
        smult += s;
    }

    public void lup(){
        if (getEnchant() == 1)
            smult = .95;
        if (getEnchant() == 3)
            smult = .90;
        if (getEnchant() == 5)
            smult = .85;
        if (getEnchant() == 7)
            smult = .80;
        if (getEnchant() == 9)
            smult = .75;
        if (getEnchant() == 13)
            smult = .70;
        if (getEnchant() == 15)
            smult = .65;
    }
}