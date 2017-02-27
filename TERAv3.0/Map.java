public class Map{
    private String name;
    private String description;
    private NamedThing[][] layout = new NamedThing[10][5];
    public Map(Priest p){
        name = "Sky Cruiser Endeavor";
        description = "A sky ship has been invaded by a creepy one-eye lazer-beam shooting monster and " +
        "a dood with Napolean complex and fire wings!";
        layout[0][0] = p;//double check this, not sure if this is right
        layout[3][0] = new Perimos(3, 0);
        layout[3][1] = new Perimos(3, 1);
        layout[3][2] = new Perimos(3, 2);
        layout[3][3] = new Perimos(3, 3);
        layout[3][4] = new Perimos(3, 4);
        layout[9][4] = new Darkan(9, 4);
    }
    public Map(Lancer l){
        name = "Sky Cruiser Endeavor";
        description = "A sky ship has been invaded by a creepy one-eye lazer-beam shooting monster and " +
        "a dood with Napolean complex and fire wings!";
        layout[0][0] = l;//double check this, not sure if this is right
        layout[3][0] = new Perimos(3, 0);
        layout[3][1] = new Perimos(3, 1);
        layout[3][2] = new Perimos(3, 2);
        layout[3][3] = new Perimos(3, 3);
        layout[3][4] = new Perimos(3, 4);
        layout[9][4] = new Darkan(9, 4);
    }
    public Map(Sorcerer s){
        name = "Sky Cruiser Endeavor";
        description = "A sky ship has been invaded by a creepy one-eye lazer-beam shooting monster and " +
        "a dood with Napolean complex and fire wings!";
        layout[0][0] = s;//double check this, not sure if this is right
        layout[3][0] = new Perimos(3, 0);
        layout[3][1] = new Perimos(3, 1);
        layout[3][2] = new Perimos(3, 2);
        layout[3][3] = new Perimos(3, 3);
        layout[3][4] = new Perimos(3, 4);
        layout[9][4] = new Darkan(9, 4);
    }
    public Map(){
        name = "Sky Cruiser Endeavor";
        description = "A sky ship has been invaded by a creepy one-eye lazer-beam shooting monster and " +
        "a dood with Napolean complex and fire wings!";
        layout[3][0] = new Perimos(3, 0);
        layout[3][1] = new Perimos(3, 1);
        layout[3][2] = new Perimos(3, 2);
        layout[3][3] = new Perimos(3, 3);
        layout[3][4] = new Perimos(3, 4);
        layout[1][1] = new Masterwork();
        layout[1][3] = new Masterwork();
        layout[7][2] = new Awakened();
        layout[9][4] = new Darkan(9, 4);
    }
    public NamedThing[][] getLayout(){
        return layout;
    }
    
}