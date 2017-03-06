public class Map{
    private String name;
    private String description;
    private NamedThing[][] layout = new NamedThing[10][5];
    public Map(){
        name = "Sky Cruiser Endeavor";
        description = "A sky ship has been invaded by a creepy one-eye lazer-beam shooting monster and " +
        "a dood with Napolean complex and fire wings!";
        layout[4][0] = new Perimos(3, 0);
        layout[4][1] = new Perimos(3, 1);
        layout[4][2] = new TrollPerimos(3, 2);
        layout[4][3] = new Perimos(3, 3);
        layout[4][4] = new Perimos(3, 4);
        layout[5][2] = new PerimosHeart();
        layout[9][4] = new Darkan(9, 4);
        layout[9][0] = new EnchantForge();
        layout[6][3] = new EnchantForge();
        layout[2][1] = new EnchantForge();
        layout[9][2] = new AwakenedForge();
        layout[6][1] = new CraftForge();
        layout[8][2] = new CraftForge();
        layout[2][3] = new CraftForge();
        layout[9][1] = new GearFragment();
        layout[7][4] = new GearFragment();
        layout[6][0] = new GearFragment();
        layout[3][2] = new GearFragment();
        layout[0][2] = new GearFragment();
        layout[7][2] = new CrackedTile();
        layout[5][1] = new CrackedTile();
        layout[5][4] = new CrackedTile();
        layout[3][3] = new CrackedTile();
        layout[1][0] = new CrackedTile();
        layout[9][3] = new DarkanFeather();
        layout[7][1] = new DarkanFeather();
        layout[4][0] = new DarkanFeather();
        layout[8][0] = new DarkanScale();
        layout[8][3] = new DarkanScale();
        layout[3][0] = new DarkanScale();
        layout[1][2] = new DarkanScale();
    }

    public NamedThing[][] getLayout(){
        return layout;
    }

}