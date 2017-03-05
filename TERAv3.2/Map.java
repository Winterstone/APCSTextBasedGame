public class Map{
    private String name;
    private String description;
    private NamedThing[][] layout = new NamedThing[10][5];
    public Map(){
        name = "Sky Cruiser Endeavor";
        description = "A sky ship has been invaded by a creepy one-eye lazer-beam shooting monster and " +
        "a dood with Napolean complex and fire wings!";
        layout[3][0] = new Perimos(3, 0);
        layout[3][1] = new Perimos(3, 1);
        layout[3][2] = new TrollPerimos(3, 2);
        layout[3][3] = new Perimos(3, 3);
        layout[3][4] = new Perimos(3, 4);
        layout[1][1] = new Weapon("+12 Masterwork Weapon", "A weapon that multiplies your damage by 1.5", 12, 1.5);
        layout[1][3] = new Weapon("+12 Masterwork Weapon", "A weapon that multiplies your damage by 1.5", 12, 1.5);
        layout[7][2] = new Weapon("+15 Awakened Weapon", "A weapon that multiplies your damage by 2", 15, 2.0);
        layout[9][4] = new Darkan(9, 4);
    }
    public NamedThing[][] getLayout(){
        return layout;
    }
    
}