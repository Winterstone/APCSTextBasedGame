public abstract class Material extends NamedThing{    
    public Material(String n, String d){
        super (n, d);
    }
    
    public abstract int harvest();
}