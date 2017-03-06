public class Glove extends Gear{
    private double gmult;
    public Glove(String n, String d, int e, double g, boolean b){
        super (n, d, e, b);
        gmult = g;
    }

    public double getGMult(){
        return gmult;
    }

    public void addGMult(double g){
        gmult += g;
    }

    public void lup(){
        if (getEnchant() == 1)
            gmult = .95;
        if (getEnchant() == 3)
            gmult = .90;
        if (getEnchant() == 5)
            gmult = .85;
        if (getEnchant() == 7)
            gmult = .80;
        if (getEnchant() == 9)
            gmult = .75;
        if (getEnchant() == 13)
            gmult = .70;
        if (getEnchant() == 15)
            gmult = .65;
    }
}