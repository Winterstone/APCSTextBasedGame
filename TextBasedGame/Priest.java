public class Priest extends Character{
    public Priest (String n){
        super (n, "Priest", 100000);
    }
    
    public boolean iframe(){
        setIframe(true);
        setCDI(2);
        return getIframe();
    }
    
    public int damage(){
        setCDD(2);
        return 15000;
    }
    
    public int specific(){
        setCDS(3);
        changeHealth(75000);
        return 75000;
    }
    
    public int superSkill(){
        setCDSS(4);
        return 35000;
    }
}