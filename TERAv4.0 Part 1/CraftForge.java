import java.util.*;
public class CraftForge extends Forge{
    public CraftForge(){
        super("A crafting forge", "You can craft gear here");
    }

    public static void craft(Character p){
        System.out.print("\f");
        Scanner scan = new Scanner (System.in);
        int n = 0;
        System.out.println("You found a crafting forge!");
        while ((p.getGF() > 7 && p.getCT() > 4 && p.getDS() > 1) && n != 5){
            System.out.println(p.getInventory());
            System.out.println("You can craft the following the items:");
            System.out.println("NOTE: If you craft an item you previously crafted and enchanted,"
                + "\nthe new one will be worse than your current one.");
            if (p.getGF() > 11 && p.getCT() > 8 && p.getDS() > 5)
                System.out.println("1. A Weapon\n\tGear Fragment: 12\n\tCracked Tile: 9\n\tDarkan Scale: 6");
            if (p.getGF() > 9 && p.getCT() > 6 && p.getDS() > 3)
                System.out.println("2. A Chest\n\tGear Fragment: 10\n\tCracked Tile: 7\n\tDarkan Scale: 4");
            System.out.println("3. Gloves\n\tGear Fragment: 8\n\tCracked Tile: 5\n\tDarkan Scale: 2" + 
                      "\n4. Boots\n\tGear Fragment: 8\n\tCracked Tile: 5\n\tDarkan Scale: 2");
            System.out.print("What would you like to craft? (5 if you wish to craft nothing): ");
            n = scan.nextInt();
            System.out.print("\f");
            if (n == 1){
                p.addGF(-12);
                p.addCT(-9);
                p.addDS(-6);
                p.setWeapon(new Weapon("Forged Weapon", "A weapon you crafted", 0, 1, true));
                System.out.println("You crafted a weapon!");
            }
            if (n == 2){
                p.addGF(-10);
                p.addCT(-7);
                p.addDS(-4);
                p.setChest(new Chest("Forged Chest", "A chest you crafted", 0, 1, true));
                System.out.println("You crafted a chest!");
            }
            if (n == 3){
                p.addGF(-8);
                p.addCT(-5);
                p.addDS(-2);
                p.setGlove(new Glove("Forged Glove", "A glove you crafted", 0, 1, true));
                System.out.println("You crafted gloves!");
            }
            if (n == 4){
                p.addGF(-8);
                p.addCT(-5);
                p.addDS(-2);
                p.setBoot(new Boot("Forged Boot", "A boot you crafted", 0, 1, true));
                System.out.println("You crafted boots!");
            }
            System.out.println(p.getInventory());
            System.out.println("Press any key to continue.");
            String cont = scan.next();
            System.out.print("\f");
        }
        if (n == 5)
            System.out.println("Exiting the crafting forge. Please continue exploring!");
        else
            System.out.println("You do not have enough materials to craft anything. Come back later!");
    }
}