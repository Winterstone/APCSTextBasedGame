public abstract class Character extends NamedThing{
    private int health;
    private int x = 0;
    private int y = 0;
    private int cdI = 0;
    private int cdD = 0;
    private int cdS = 0;
    private int cdSS = 0;
    private Weapon wep = new Weapon("0 Weapon", "A weapon that multiplies your damage by 1", 0, 1);
    
    public Character(String n, String d, int h){
        super (n, d);
        health = h;
    }
    
    public void setWeapon(Weapon w){
        wep = w;
    }
    
    public Weapon getWeapon(){
        return wep;
    }
    
    public int getX (){
        return x;
    }
    
    public void setX(int i){
        x = i;
    }
    
    public int getY(){
        return y;
    }
    
    public void setY(int i){
        y = i;
    }
    
    public int getHealth(){
        return health;
    }
    
    public void setHealth(int h){
        health = h;
    }
    
    public void changeHealth(int h){
        health += h;
    }
    
    public abstract int iframe();
    
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
    
    public void resetcd(){
        cdI = 0;
        cdD = 0;
        cdS = 0;
        cdSS = 0;
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
    }
}