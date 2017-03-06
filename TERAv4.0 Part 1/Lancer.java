public class Lancer extends Character{
    public Lancer (String n){
        super (n, "Lancer", 150000);
    }

    public int iframe(){
        setCDI(2);
        return 0;
    }

    public int damage(){
        setCDD(2);
        return -45000;
    }

    public int specific(){
        setCDS(1);
        return 25000;
    }

    public int superSkill(){
        setCDSS(4);
        return -75000;
    }

    public String toString(){
        return "You are a " + getDescrip() + " named " + getName() + " with " + getHealth() + " health.";
    }
}