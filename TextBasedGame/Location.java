public abstract class Location extends NamedThing{
    private int x;
    private int y;
    public Location(String n, String d, int x, int y){
        super (n, d);
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
}