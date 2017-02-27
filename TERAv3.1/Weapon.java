public abstract class Weapon extends NamedThing{
    private int enchantlvl;
    private double bmult;
    public Weapon(String n, String d, int e, double b){
        super (n, d);
        enchantlvl = e;
        bmult = b;
    }
    
    public int getEnchant(){
        return enchantlvl;
    }
    
    public double getBMult(){
        return bmult;
    }
}