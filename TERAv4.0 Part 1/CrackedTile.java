public class CrackedTile extends Material{
    public CrackedTile(){
        super ("Cracked Tile", "A cracked tile with an intricate design. It may be useful.");
    }
    
    public int harvest(){
        return ((int) ((Math.random() * 4) + 1));
    }
}