public class Lancer extends Character{
    public Lancer (String n){
        super (n, "Lancer", 150000);
    }
    
    public boolean iframe(){
        setIframe(true);
        setCDI(2);
        return getIframe();
    }
    
    public int damage(){
        setCDD(2);
        return -45000;
    }
    
    public int specific(){
        setCDS(1);
        return 25000;
    }
    
    public int superSkill(){
        setCDSS(4);
        return -75000;
    }
}