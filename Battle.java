package TextBasedGame;
import java.util.*;
public class Battle{
    private Enemy boss;
    private Character player;
    private int enemyDMG;
    private int playerDMG;
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
        while (boss.getHealth() > 0){
            if(player.getHealth() > 0){
                enemyDMG = bossDamage();
                System.out.println("What would you like to do?: "); 
                displaySkills();
                choose = scan.nextInt(); 
                playerDMG = playerSkill(choose);
                if(playerDMG < 0){
                    System.out.println("You attacked!");
                    System.out.println("Damage dealt: " + Math.abs(playerDMG));
                    System.out.println("Damage taken: " + Math.abs(enemyDMG));
                    player.changeHealth(enemyDMG);
                    boss.changeHealth(playerDMG);
                }
                else if(playerDMG == 0){
                    System.out.println("You iframed!");
                    System.out.println("Damage dealt: 0");
                    System.out.println("Damage taken: 0");
                }
                else{
                    System.out.println("You healed yourself, but still may take damage.");
                    System.out.println("Damage dealt: 0");
                    System.out.println("Damage taken: " + Math.abs(enemyDMG));
                    player.specific();
                    player.changeHealth(enemyDMG);
                }
                System.out.println("Your Health: " + player.getHealth());
                System.out.println("Boss Health: " + boss.getHealth());
            }
            else{
                System.out.println("You have died. How unfortunate. Reset the JVM to try again.");
                boss.changeHealth(-1000000000);//to get out of while loop;
            }
        }
    }

    public void fightLancer(){
        int choose;
        while (boss.getHealth() > 0){
            if(player.getHealth() > 0){
                enemyDMG = bossDamage();
                System.out.println("What would you like to do?: "); 
                displaySkills();
                choose = scan.nextInt(); 
                playerDMG = playerSkill(choose);
                if(playerDMG < 0){
                    System.out.println("You attacked!");
                    System.out.println("Damage dealt: " + Math.abs(playerDMG));
                    System.out.println("Damage taken: " + Math.abs(enemyDMG));
                    player.changeHealth(enemyDMG);
                    boss.changeHealth(playerDMG);
                }
                else if(playerDMG == 0){
                    System.out.println("You iframed!");
                    System.out.println("Damage dealt: 0");
                    System.out.println("Damage taken: 0");
                }
                else{
                    System.out.println("You blocked!");
                    System.out.println("Damage dealt: 0");
                    if (playerDMG + enemyDMG <  0){
                        System.out.println("Damage taken: " + Math.abs(playerDMG - enemyDMG));
                        player.changeHealth(Math.abs(playerDMG - enemyDMG));
                    }
                    else 
                        System.out.println("Damage taken: 0");
                }
                System.out.println("Your Health: " + player.getHealth());
                System.out.println("Boss Health: " + boss.getHealth());
            }
            else{
                System.out.println("You have died. How unfortunate. Reset the JVM to try again.");
                boss.changeHealth(-1000000000);
            }
        }
    }

    public void fightSorcerer(){
        int choose;
        while (boss.getHealth() > 0){
            if(player.getHealth() > 0){
                enemyDMG = bossDamage();
                System.out.println("What would you like to do?: "); 
                displaySkills();
                choose = scan.nextInt(); 
                playerDMG = playerSkill(choose);
                if(playerDMG < 0){
                    System.out.println("You attacked!");
                    System.out.println("Damage dealt: " + Math.abs(playerDMG));
                    System.out.println("Damage taken: " + Math.abs(enemyDMG));
                    player.changeHealth(enemyDMG);
                    boss.changeHealth(playerDMG);
                }
                else{
                    System.out.println("You iframed!");
                    System.out.println("Damage dealt: 0");
                    System.out.println("Damage taken: 0");
                }
                System.out.println("Your Health: " + player.getHealth());
                System.out.println("Boss Health: " + boss.getHealth());
            }
            else{
                System.out.println("You have died. How unfortunate. Reset the JVM to try again.");
                boss.changeHealth(-1000000000);
            }
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
            return 0;
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