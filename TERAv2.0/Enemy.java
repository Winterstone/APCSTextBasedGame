public abstract class Enemy extends NamedThing{
    private int health;
    private int x;
    private int y;

    public Enemy(String n, String d, int h, int i, int j){
        super (n, d);
        health = h;
        x = i;
        y = j;
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
        x = i;
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

    public abstract String idle();

    public abstract String one();

    public abstract int oneDMG();

    public abstract String low();

    public abstract int lowDMG();

    public abstract String high();

    public abstract int highDMG();
}