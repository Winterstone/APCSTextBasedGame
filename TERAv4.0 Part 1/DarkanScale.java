public class DarkanScale extends Material{
    public DarkanScale(){
        super ("Darkan's Scale", "A scale from the fire demon Darkan.");
    }
    
    public int harvest(){
        return ((int) ((Math.random() * 2) + 1));
    }
}