public class Chest extends Gear{
    private double cmult;
    public Chest(String n, String d, int e, double c, boolean b){
        super (n, d, e, b);
        cmult = c;
    }

    public double getCMult(){
        return cmult;
    }

    public void addCMult(double c){
        cmult += c;
    }

    public void lup(){
        if (getEnchant() == 1)
            cmult = .90;
        if (getEnchant() == 3)
            cmult = .80;
        if (getEnchant() == 5)
            cmult = .70;
        if (getEnchant() == 7)
            cmult = .60;
        if (getEnchant() == 9)
            cmult = .50;
        if (getEnchant() == 13)
            cmult = .40;
        if (getEnchant() == 15)
            cmult = .30;
    }
}