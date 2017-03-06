public class GearFragment extends Material{
    public GearFragment(){
        super ("Gear Fragment", "A fragment from an ancient piece of gear. It may be useful.");
    }
    
    public int harvest(){
        return ((int) ((Math.random() * 6) + 1));
    }
}