import java.util.*;
public class AwakenedForge extends Forge{
    public AwakenedForge(){
        super("An awakening forge", "You can enchant gear to +15 from +12 here");
    }

    public static void awaken(Character p){
        System.out.print("\f");
        Scanner scan = new Scanner (System.in);
        int n = 0;
        System.out.println("You found an awakened enchanting forge!");
        System.out.println("This has a chance of increasing the enchantment level of your items by 1 from +12 to +15!");
        while (p.getGF() > 1 && p.getCT() > 0 && n != 5){
            System.out.println(p.getInventory());
            System.out.println("You can awaken enchant the following the items:");
            System.out.println("Note: if nothing appears, you have no eligible items for awakened enchanting.");
            if (p.getGF() > 3 && p.getCT() >  2 && p.getPH() > 0 && p.getWeapon().getEnchant() < 15 && p.getWeapon().getEnchant() > 11 && p.getWeapon().getCraft())
                System.out.println("1. +" + p.getWeapon().getEnchant() + " Weapon\n\tGear Fragment: 4\n\tPerimos Heart: 1\n\tCracked Tile: 3");
            if (p.getGF() > 2 && p.getCT() >  1 && p.getDF() > 1 && p.getChest().getEnchant() < 15 && p.getChest().getEnchant() > 11 && p.getChest().getCraft())
                System.out.println("2. +" + p.getChest().getEnchant() + " Chest\n\tGear Fragment: 3\n\tDarkan Feather: 2\n\tCracked Tile: 2");
            if (p.getDF() > 0 && p.getGlove().getEnchant() < 15 && p.getGlove().getEnchant() > 11 && p.getGlove().getCraft())
                System.out.println("3. +" + p.getGlove().getEnchant() + " Glove\n\tGear Fragment: 2\n\tDarkan Feather: 1\n\tCracked Tile: 1");
            if (p.getDF() > 0 && p.getBoot().getEnchant() < 15 && p.getBoot().getEnchant() > 11 && p.getBoot().getCraft())
                System.out.println("4. +" + p.getBoot().getEnchant() + " Boot\n\tGear Fragment: 2\n\tDarkan Feather: 1\n\tCracked Tile: 1");
            System.out.print("What would you like to try to awakened enchant? (5 if you wish to awaken enchant nothing): ");
            n = scan.nextInt();
            System.out.print("\f");
            if (n == 1){
                p.addGF(-4);
                p.addCT(-3);
                p.addPH(-1);
                if (((int)(Math.random()*2)) == 1){
                    p.getWeapon().addEnchant();
                    p.getWeapon().lup();
                    System.out.println("You awaken enchanted your weapon to " + p.getWeapon().getEnchant() + "!");
                }
                else
                    System.out.println("You failed to awaken enchant your weapon.");
            }
            if (n == 2){
                p.addGF(-3);
                p.addCT(-2);
                p.addDF(-2);
                if (((int)(Math.random()*2)) == 1){
                    p.getChest().addEnchant();
                    p.getChest().lup();
                    System.out.println("You awaken enchanted your chest to " + p.getChest().getEnchant() + "!");
                }
                else
                    System.out.println("You failed to awaken enchant your chest.");
            }
            if (n == 3){
                p.addGF(-2);
                p.addCT(-1);
                p.addDF(-1);
                if (((int)(Math.random()*2)) == 1){
                    p.getGlove().addEnchant();
                    p.getGlove().lup();
                    System.out.println("You awaken enchanted your gloves to " + p.getGlove().getEnchant() + "!");
                }
                else
                    System.out.println("You failed to awaken enchant your gloves.");
            }
            if (n == 4){
                p.addGF(-2);
                p.addCT(-1);
                p.addDF(-1);
                if (((int)(Math.random()*2)) == 1){
                    p.getBoot().addEnchant();
                    p.getBoot().lup();
                    System.out.println("You awaken enchanted your boots to " + p.getBoot().getEnchant() + "!");
                }
                else
                    System.out.println("You failed to awaken enchant your boots.");
            }
            System.out.println(p.getInventory());
            System.out.println("Press any key to continue.");
            String cont = scan.next();
            System.out.print("\f");
        }
        if (n == 5)
            System.out.println("Exiting the awakened enchanting forge. Please continue exploring!");
        else
            System.out.println("You do not have enough materials to enchant anything. Come back later!");
    }
}