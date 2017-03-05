public abstract class Gear extends NamedThing{
    private int enchantlvl;
    
    public Gear(String n, String d, int e){
        super (n, d);
        enchantlvl = e;
    }
    
        public int getEnchant(){
        return enchantlvl;
    }
}