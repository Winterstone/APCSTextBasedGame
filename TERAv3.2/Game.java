import java.util.*;
public class Game{
    static Scanner scan = new Scanner(System.in);
    static Map schm = new Map();
    static MP3 mapmusic = new MP3("Map.mp3");
    public static void main(String[] args){
        System.out.println("\f");
        titleScreen();
        Character player = newCharacter();
        System.out.print("\f");
        System.out.println(player.toString());
        NamedThing[][] map = schm.getLayout();
        mapmusic.play();
        while (((Darkan)map[9][4]).getHealth() > 0 && player.getHealth() > 0){
            if (mapmusic.getPlayer() == null)
                mapmusic.play();
            player = explore(player, map);
        }
        endScreen();
    }

    public static void titleScreen(){
        MP3 title = new MP3("Godspeed.mp3");
        title.play();
        System.out.println("         ,.-~·-.,__,.-::^·- .,'                   ,.-:~:'*:~-.              .:'/*/'`:,·:~·–:.,                          ,.-:~:-." +            
            "\n     /:::::::::::::::::::::::::/';          .·´::::::::::::::;           /::/:/:::/:::;::::::/`':.,'                   /':::::::::'`,          " +
            "\n   /;:·–– :;:::::::_ ;: – .,/::;i'‘         /:::;:-·~^*^~-:;:/           /·*'`·´¯'`^·-~·:–-'::;:::'`;                  /;:-·~·-:;':::',         "+
            "\n  /´          ¯¯           ';::/        ,.-/:´     .,       ;/          '\\                      '`;::'             ,'´          '`:;::`,     "+  
            "\n,:                          ,:/        /::';      ,'::`:~.-:´;          '`;        ,– .,        'i:'/              /               `;::\\      "+
            "\n';_,..–-.,_     _    _,.·´‘            /;:- ´        `'·–·;:'/' _          i       i':/:::';       ;/'            ,'                  '`,::;    "+
            "\n         ,·´'    '`·;'i¯             /     ;:'`:.., __,.·'::/:::';         i       i/:·'´       ,:''            i'      ,';´'`;         '\\:: "+
            "\n         i         'i:i'             ;'      ';:::::::::::::::/;;::/       '; '    ,:,     ~;'´:::'`:,         ,'      ,;'/´:`';         ';::"+
            "\n         ';        ';:i'             ¦         '`·-·:;::·-·'´   ';:/‘      'i     i:/\\       `;::::/:'`;     ';        ;/:;::;:';         ',:::"+
            "\n          i        i:/'             '\\                         /'         ;     ;/    \\       '`:/::::/'    'i       '´        `'         'i::'"+
            "\n           ;      i/                 `·,                  ,·'  '          ';   ,'       \\         '`;/'     ¦       '/`' *^~-·'´`\\         ';'/'"+
            "\n            \\   '/'                       '`~·- . , . -·'´                 `'*´          '`~·-·^'´          '`., .·´              `·.,_,.·´  "+
            "\n              ¯                                                                                                                      ");
        System.out.println();
        System.out.println("                        (                                                                                                 " + 
            "\n                        )\\ )    )          (                                                (                              " +
            "\n                       (()/( ( /( (        )\\   (      (   (         (   (     (            )\\ )   (     )   )        (    "+
            "\n                        /(_)))\\()))\\ )   (((_)  )(    ))\\  )\\  (    ))\\  )(    )\\    (     (()/(  ))\\ ( /(  /((   (   )(   "+
            "\n                       (_)) ((_)\\(()/(   )\\___ (()\\  /((_)((_) )\\  /((_)(()\\  ((_)   )\\ )   ((_))/((_))(_))(_))\\  )\\ (()\\  "+
            "\n                       / __|| |(_))(_)) ((/ __| ((_)(_))(  (_)((_)(_))   ((_) | __| _(_/(   _| |(_)) ((_)_ _)((_)((_) ((_) "+
            "\n                       \\__ \\| / /| || |  | (__ | '_|| || | | |(_-</ -_) | '_| | _| | ' \\))/ _` |/ -_)/ _` |\\ V // _ \\| '_| "+
            "\n                       |___/|_\\_\\ \\_, |   \\___||_|   \\_,_| |_|/__/\\___| |_|   |___||_||_| \\__,_|\\___|\\__,_| \\_/ \\___/|_|   "+
            "\n                                  |__/                                                                                     ");
        System.out.println();
        System.out.println("Press any key to continue.");
        String cont = scan.next();
        System.out.print("\f");
        title.close();
    }

    public static Character newCharacter(){
        MP3 charcreation = new MP3("Charcre.mp3");
        charcreation.play();
        System.out.println("Welcome to TERA: Sky Cruiser Endeavor. You will soon embark on an adventure aboard a Skyship to oust the evil fire demon known as Darkan!\n");
        System.out.print("First, you need to pick a class to play. Your options are as follows:" + "\n1. Lancer - A mitigation tank able to block attacks and deal moderate damage."
            + "\n2. Priest - A defensive healer able to heal and deal low damage." + "\n3. Sorcerer - A high burst damage DPS class able to quickly take out bosses."
            + "\nEnter the number of the class you want to play: ");
        int num = scan.nextInt();
        if (num == 1){
            System.out.print("\nWhat would you like to name your Lancer?: ");
            Character player = new Lancer(scan.next());
            charcreation.close();
            return player;
        }
        else if (num == 2){
            System.out.print("\nWhat would you like to name your Priest?: ");
            Character player = new Priest(scan.next());
            charcreation.close();
            return player;
        }
        else {
            System.out.print("\nWhat would you like to name your Sorcerer?: ");
            Character player = new Sorcerer(scan.next());
            charcreation.close();
            return player;
        }
    }

    public static void endScreen(){
        System.out.print("\f");
        MP3 end = new MP3("End.mp3");
        end.play();
        System.out.println("Congratulations! You have bested Darkan! You are the champion of Sky Cruiser Endeavor!\n\nCredits:" +
            "\nCreated by Audrie Chan and Kevin Tobias\nMP3 class made with help of Zachary Goode\nOriginal TERA MMORPG used as inspiration created by Blue Hole Studios"
            + "\n\tMusic:\n\t\tTitle Screen: TERA - Godspeed\n\t\tCharacter Creation: TERA - Character Select Screen\n\t\tMap Exploration: "
            + "TERA - Ship of Destiny\n\t\tPerimos Boss Fight: TERA - Blood and Triumph\n\t\tDarkan Boss Fight: TERA - Yana's Theme"
            + "\n\t\tEnd Credits: TERA - Edge of Dream\n\nRestart the game and reset the JVM to play again.");
    }

    public static Character explore(Character p, NamedThing[][] m){
        System.out.println("Where would you like to go?");
        if (p.getY() != 9)
            System.out.println("Up");
        if (p.getY() != 0)
            System.out.println("Down");
        if (p.getX() != 0)
            System.out.println("Left");
        if (p.getX() != 4)
            System.out.println("Right");
        String direction;
        System.out.print("Enter direction here: ");
        direction = scan.next();
        while (direction.equalsIgnoreCase("up") && direction.equalsIgnoreCase("down") && direction.equalsIgnoreCase("left") && direction.equalsIgnoreCase("right") == false){
            System.out.print("Enter direction here: ");
            direction = scan.next();
        }

        if (direction.equalsIgnoreCase("up"))
            p.setY(p.getY() + 1);
        if (direction.equalsIgnoreCase("down"))
            p.setY(p.getY() - 1);
        if (direction.equalsIgnoreCase("left"))
            p.setX(p.getX() - 1);
        if (direction.equalsIgnoreCase("right"))
            p.setX(p.getX() + 1);    
        System.out.print("\f");
        if (m[p.getY()][p.getX()] instanceof Enemy && ((Enemy)m[p.getY()][p.getX()]).getHealth() > 0){
            Battle b = new Battle((Enemy)m[p.getY()][p.getX()], p);
            mapmusic.close();
            mapmusic.nullPlayer();
            if (p instanceof Priest)
                b.fightPriest();
            else if (p instanceof Lancer)
                b.fightLancer();
            else
                b.fightSorcerer();   
        }
        else if (m[p.getY()][p.getX()] instanceof Weapon)
            weaponAnalysis((Weapon)m[p.getY()][p.getX()], p);        
        else
            System.out.println("There is nothing of importance in the area. Move along.\n");
        return p;
    }

    public static void weaponAnalysis(Weapon w, Character p){
        int pweplvl = p.getWeapon().getEnchant();
        System.out.println("You found a " + w.getName() + " (" + w.getDescrip() + ")!");
        if (pweplvl < w.getEnchant()){
            System.out.println("This weapon is better than your weapon. Let's replace it.");
            p.setWeapon(w);
        }
        else
            System.out.println("This weapon is worse than your weapon. Let's destroy it.");
    }
}