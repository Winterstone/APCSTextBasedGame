public class DarkanFeather extends Material{
    public DarkanFeather(){
        super ("Darkan's Feather", "A feather from the fire demon Darkan.");
    }
    
    public int harvest(){
        return ((int) ((Math.random() * 3) + 1));
    }
}