public class Sombra extends Character{
    private boolean invis = false;
    public Sombra(){
        super ("Sombra", "A Purple Stealth Assassin", 200);
    }
    
    public void invisible(){
        invis = true;
    }
}