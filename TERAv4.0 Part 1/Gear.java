public abstract class Gear extends NamedThing{
    private int enchantlvl;
    private boolean craft;
    
    public Gear(String n, String d, int e, boolean b){
        super (n, d);
        enchantlvl = e;
        craft = b;
    }
    
        public int getEnchant(){
        return enchantlvl;
    }
    
    public boolean getCraft(){
        return craft;
    }    
    
    public void addEnchant(){
        enchantlvl++;
    }
    
    public abstract void lup();
}