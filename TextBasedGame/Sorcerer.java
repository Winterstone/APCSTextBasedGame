public class Sorcerer extends Character{
    public Sorcerer (String n){
        super (n, "Sorcerer", 125000);
    }
    
    public boolean iframe(){
        setIframe(true);
        setCDI(2);
        return getIframe();
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
}