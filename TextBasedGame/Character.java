public abstract class Character extends NamedThing{
    private int health;
    private int cdI = 0;
    private int cdD = 0;
    private int cdS = 0;
    private int cdSS = 0;
    private boolean isIframing = false;
    
    public Character(String n, String d, int h){
        super (n, d);
        health = h;
    }
    
    public int getHealth(){
        return health;
    }
    
    public void changeHealth(int h){
        health += h;
    }
    
    public boolean getIframe(){
        return isIframing;
    }
    
    public void setIframe(boolean b){
        isIframing = b;
    }
    
    public abstract boolean iframe();
    
    public abstract int damage();
    
    public abstract int specific();
    
    public abstract int superSkill();
    
    public void setCDI(int c){
        cdI = c;
    }
    
    public void setCDD(int c){
        cdD = c;
    }
    
    public void setCDS(int c){
        cdS = c;
    }
    
    public void setCDSS(int c){
        cdSS = c;
    }
    
    public int getCDI(){
        return cdI;
    }
    
    public int getCDD(){
        return cdD;
    }
    
    public int getCDS(){
        return cdS;
    }
    
    public int getCDSS(){
        return cdSS;
    }
    
    public void cd(){
        if (cdI > 0)
            cdI -= 1;
        if (cdD > 0)
            cdD -= 1;
        if (cdS > 0)
            cdS -= 1;
        if (cdSS > 0)
            cdSS -= 1;
        if (isIframing = true)
            isIframing = false;
    }
}