public abstract class Character extends NamedThing{
    private int health;
    
    public Character(String n, String d, int h){
        super (n, d);
        health = h;
    }
    
    public int getHealth(){
        return health;
    }
}