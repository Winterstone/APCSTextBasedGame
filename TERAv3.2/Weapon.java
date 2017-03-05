public class Weapon extends Gear{
    private double bmult;
    public Weapon(String n, String d, int e, double b){
        super (n, d, e);
        bmult = b;
    }
    
    public double getBMult(){
        return bmult;
    }
}