import java.util.*;
public class Battle{
    private Enemy boss;
    private Character player;
    private int enemyDMG;
    private int playerDMG;
    static MP3 perimosmusic = new MP3("Perimos.mp3");
    static MP3 darkanmusic = new MP3("Darkan.mp3");
    Scanner scan = new Scanner(System.in);
    public Battle(Enemy e, Character c){
        /*
         * no clue why this is here
         */
        boss = e;
        player = c;
    }

    public void fightPriest(){
        int choose;
        if (boss instanceof Perimos){
            perimosmusic.play();
            System.out.println("You encountered Perimos, the lazer demon!");
        }
        else{
            darkanmusic.play();
            System.out.println("You encountered Darkan, the fire demon and ruler of Sky Cruiser Endeavor!");
        }
        while (boss.getHealth() > 0){
            if(player.getHealth() > 0){
                enemyDMG = bossDamage();
                System.out.println("What would you like to do?: "); 
                displaySkills();
                choose = scan.nextInt(); 
                playerDMG = playerSkill(choose);
                if(playerDMG < 0){
                    System.out.print("\f");
                    System.out.println("You attacked!");
                    System.out.println("Damage dealt: " + Math.abs(playerDMG));
                    System.out.println("Damage taken: " + Math.abs(enemyDMG));
                    player.changeHealth(enemyDMG);
                    boss.changeHealth(playerDMG);
                }
                else if(playerDMG == 0){
                    System.out.print("\f");
                    System.out.println("You iframed!");
                    System.out.println("Damage dealt: 0");
                    System.out.println("Damage taken: 0");
                }
                else{
                    System.out.print("\f");
                    System.out.println("You healed yourself, but still may take damage.");
                    System.out.println("Damage dealt: 0");
                    System.out.println("Damage taken: " + Math.abs(enemyDMG));
                    player.changeHealth(enemyDMG);
                    if(player.getHealth() > 0)
                        player.specific();
                }
                System.out.println("Your Health: " + player.getHealth());
                System.out.println("Boss Health: " + boss.getHealth());
                player.cd();
                System.out.println();
            }
            else{
                System.out.println("You have died. How unfortunate. You respawned at entrance.");
                System.out.println();
                player.setX(0);
                player.setY(0);
                boss.changeHealth(-1000000000);
            }
        }
        if (player.getHealth()<=0){
            if (boss instanceof Perimos){
                boss.setHealth(500000);
            }
            else{
                boss.setHealth(1000000);                
            }
        }
        else {
            if (boss instanceof Perimos){
                System.out.println("You defeated Perimos!");
            }
            else{
                System.out.println("You defeated Darkan!");
            }
        }
        player.setHealth(100000);
        player.resetcd();
        if (boss instanceof Perimos){
            perimosmusic.close();
        }
        else{
            darkanmusic.close();
        }
    }

    public void fightLancer(){
        int choose;
        if (boss instanceof Perimos){
            perimosmusic.play();
            System.out.println("You encountered Perimos, the lazer demon!");
        }
        else{
            darkanmusic.play();
            System.out.println("You encountered Darkan, the fire demon and ruler of Sky Cruiser Endeavor!");
        }
        while (boss.getHealth() > 0){
            if(player.getHealth() > 0){
                enemyDMG = bossDamage();
                System.out.println("What would you like to do?: "); 
                displaySkills();
                choose = scan.nextInt(); 
                playerDMG = playerSkill(choose);
                if(playerDMG < 0){
                    System.out.print("\f");
                    System.out.println("You attacked!");
                    System.out.println("Damage dealt: " + Math.abs(playerDMG));
                    System.out.println("Damage taken: " + Math.abs(enemyDMG));
                    player.changeHealth(enemyDMG);
                    boss.changeHealth(playerDMG);
                }
                else if(playerDMG == 0){
                    System.out.print("\f");
                    System.out.println("You iframed!");
                    System.out.println("Damage dealt: 0");
                    System.out.println("Damage taken: 0");
                }
                else{
                    System.out.println("You blocked!");
                    System.out.println("Damage dealt: 0");
                    if (playerDMG + enemyDMG <  0){
                        System.out.println("Damage taken: " + Math.abs(playerDMG + enemyDMG));
                        player.changeHealth(playerDMG + enemyDMG);
                    }
                    else 
                        System.out.println("Damage taken: 0");
                }
                System.out.println("Your Health: " + player.getHealth());
                System.out.println("Boss Health: " + boss.getHealth());
                player.cd();
                System.out.println();
            }
            else{
                System.out.println("You have died. How unfortunate. You respawned at entrance.");
                System.out.println();
                player.setX(0);
                player.setY(0);
                boss.changeHealth(-1000000000);
            }
        }
        if (player.getHealth()<=0){
            if (boss instanceof Perimos){
                boss.setHealth(500000);
            }
            else{
                boss.setHealth(1000000);                
            }
        }
        else {
            if (boss instanceof Perimos){
                System.out.println("You defeated Perimos!");
            }
            else{
                System.out.println("You defeated Darkan!");
            }
        }
        player.setHealth(150000);
        player.resetcd();
        if (boss instanceof Perimos){
            perimosmusic.close();
        }
        else{
            darkanmusic.close();
        }
    }

    public void fightSorcerer(){
        int choose;
        if (boss instanceof Perimos){
            perimosmusic.play();
            System.out.println("You encountered Perimos, the lazer demon!");
        }
        else{
            darkanmusic.play();
            System.out.println("You encountered Darkan, the fire demon and ruler of Sky Cruiser Endeavor!");
        }
        while (boss.getHealth() > 0){
            if(player.getHealth() > 0){
                enemyDMG = bossDamage();
                System.out.println("What would you like to do?: "); 
                displaySkills();
                choose = scan.nextInt(); 
                playerDMG = playerSkill(choose);
                if(playerDMG < 0){
                    System.out.print("\f");
                    System.out.println("You attacked!");
                    System.out.println("Damage dealt: " + Math.abs(playerDMG));
                    System.out.println("Damage taken: " + Math.abs(enemyDMG));
                    player.changeHealth(enemyDMG);
                    boss.changeHealth(playerDMG);
                }
                else{
                    System.out.print("\f");
                    System.out.println("You iframed!");
                    System.out.println("Damage dealt: 0");
                    System.out.println("Damage taken: 0");
                }
                System.out.println("Your Health: " + player.getHealth());
                System.out.println("Boss Health: " + boss.getHealth());
                player.cd();
                System.out.println();
            }
            else{
                System.out.println("You have died. How unfortunate. You respawned at entrance.");
                System.out.println();
                player.setX(0);
                player.setY(0);
                boss.changeHealth(-1000000000);
            }
        }
        if (player.getHealth()<=0){
            if (boss instanceof Perimos){
                boss.setHealth(500000);
            }
            else{
                boss.setHealth(1000000);                
            }
        }
        else {
            if (boss instanceof Perimos){
                System.out.println("You defeated Perimos!");
            }
            else{
                System.out.println("You defeated Darkan!");
            }
        }
        player.setHealth(125000);
        player.resetcd();
        if (boss instanceof Perimos){
            perimosmusic.close();
        }
        else{
            darkanmusic.close();
        }
    }

    public int bossAttackType(){
        return (int)(Math.random()*100 + 1);
    }

    public int bossDamage(){
        if (bossAttackType()<= 20){
            System.out.println(boss.one());
            return boss.oneDMG();
        }
        else if (bossAttackType()> 20 && bossAttackType() <=27){
            System.out.println(boss.low());
            return boss.lowDMG();
        }
        else if (bossAttackType()> 27 && bossAttackType() <= 54){
            System.out.println(boss.high());
            return boss.highDMG();
        }
        else{
            System.out.println(boss.idle());
            return 0;
        }
    }

    public int playerSkill(int playerNum){
        /*
         * 1 = iframe
         * 2 = damage
         * 3 = class specific
         * 4 = super
         */
        if (playerNum == 1){
            return player.iframe();
        }
        else if (playerNum == 2){
            return player.damage();
        }
        else if (playerNum == 3){
            return player.specific();
        }
        else{
            return player.superSkill();
        }
    }

    public void displaySkills(){
        if (player instanceof Priest){
            if (player.getCDI() == 0){
                System.out.println("1. Backstep");
            }
            if (player.getCDD() == 0){
                System.out.println("2. Triple Nemesis");
            }
            if (player.getCDS() == 0){
                System.out.println("3. Heal Thyself");
            }
            if (player.getCDSS() == 0){
                System.out.println("4. Zenobia's Vortex");
            }
        }
        else if (player instanceof Lancer){
            if (player.getCDI() == 0){
                System.out.println("1. Backstep");
            }
            if (player.getCDD() == 0){
                System.out.println("2. Spring Attack");
            }
            if (player.getCDS() == 0){
                System.out.println("3. Block");
            }
            if (player.getCDSS() == 0){
                System.out.println("4. Wallop");
            }
        }
        else {
            if (player.getCDI() == 0){
                System.out.println("1. Warp Barrier");
            }
            if (player.getCDD() == 0){
                System.out.println("2. Lightning Strike");
            }
            if (player.getCDS() == 0){
                System.out.println("3. Hail Storm");
            }
            if (player.getCDSS() == 0){
                System.out.println("4. Meteor Strike");
            }
        }
    }
}