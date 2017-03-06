public abstract class Character extends NamedThing{
    private int health;
    private int x = 0;
    private int y = 0;
    private int cdI = 0;
    private int cdD = 0;
    private int cdS = 0;
    private int cdSS = 0;
    private Weapon wep = new Weapon("0 Weapon", "A weapon that multiplies your damage by 1", 0, 1, false);
    private Chest chest = new Chest("0 Chest", "A chest that multiplies damage taken by 1", 0, 1, false);
    private Glove glove = new Glove("0 Glove", "A glove that multiplies damage taken by 1", 0, 1, false);
    private Boot boot = new Boot("0 Boot", "A boot that multiplies damage taken by 1", 0, 1, false);
    /*
     * 0 corresponds to GearFragment
     * 1 corresponds to PerimosHearts
     * 2 corresponds to DarkanScales
     * 3 corresponds to DarkanFeathers
     * 4 corresponds to CrackedTiles
     */
    private int[] mats = new int[5];

    public Character(String n, String d, int h){
        super (n, d);
        health = h;
    }
    
    public String getInventory(){
        return "******************************\nYour inventory:\nGear Fragment: " + mats[0] + 
            "\nPerimos Heart: " + mats[1] + "\nDarkan Scale: " + mats[2] + "\nDarkan Feather: " + 
            mats[3] + "\nCracked Tiles: " + mats[4] + "\n******************************";
    }
    
    public int getGF(){
        return mats[0];
    }
    
    public int getPH(){
        return mats[1];
    }
    
    public int getDS(){
        return mats[2];
    }
    
    public int getDF(){
        return mats[3];
    }
    
    public int getCT(){
        return mats[4];
    }
    
    public void addGF(int i){
        mats[0] += i;
    }
    
    public void addPH(int i){
        mats[1] += i;
    }
    
    public void addDS(int i){
        mats[2] += i;
    }

    public void addDF(int i){
        mats[3] += i;
    }
    
    public void addCT(int i){
        mats[4] += i;
    }

    public void setBoot(Boot b){
        boot = b;
    }

    public Boot getBoot(){
        return boot;
    }

    public void setGlove(Glove g){
        glove = g;
    }

    public Glove getGlove(){
        return glove;
    }

    public void setChest(Chest c){
        chest = c;
    }

    public Chest getChest(){
        return chest;
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