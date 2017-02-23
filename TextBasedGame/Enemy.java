public abstract class Enemy extends NamedThing{
    private int health;

    public Enemy(String n, String d, int h){
        super (n, d);
        health = h;
    }

    public int getHealth(){
        return health;
    }

    public void changeHealth(int h){
        health += h;
    }

    public abstract String idle();

    public abstract String one();
    
    public abstract int oneDMG();

    public abstract String low();
    
    public abstract int lowDMG();

    public abstract String high();
    
    public abstract int highDMG();
}