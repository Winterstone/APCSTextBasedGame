public class Weapon extends Gear{
    private double bmult;
    public Weapon(String n, String d, int e, double b, boolean bd){
        super (n, d, e, bd);
        bmult = b;
    }

    public double getBMult(){
        return bmult;
    }

    public void addBMult(double b){
        bmult += b;
    }

    public void lup(){
        if (getEnchant() == 1)
            bmult = 1.2;
        if (getEnchant() == 3)
            bmult = 1.4;
        if (getEnchant() == 5)
            bmult = 1.6;
        if (getEnchant() == 7)
            bmult = 1.8;
        if (getEnchant() == 9)
            bmult = 2;
        if (getEnchant() == 13)
            bmult = 2.5;
        if (getEnchant() == 15)
            bmult = 3;
    }
}