public class Sorcerer extends Character{
    public Sorcerer (String n){
        super (n, "Sorcerer", 125000);
    }
    
    public int iframe(){
        setCDI(0);
        return 0;
    }
    
    public int damage(){
        setCDD(2);
        return -15000;
    }
    
    public int specific(){
        setCDS(4);
        return -70000;
    }
    
    public int superSkill(){
        setCDSS(6);
        return -110000;
    }
    
    public String toString(){
        return "You are a " + getDescrip() + " named " + getName() + " with " + getHealth() + " health.";
    }
}