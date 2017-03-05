public class Priest extends Character{
    public Priest (String n){
        super (n, "Priest", 100000);
    }

    public int iframe(){
        setCDI(2);
        return 0;
    }

    public int damage(){
        setCDD(2);
        return -15000;
    }

    public int specific(){
        setCDS(3);
        changeHealth(75000);
        if (getHealth() > 100000)
            this.setHealth(100000);
        return 75000;
    }

    public int superSkill(){
        setCDSS(4);
        return -35000;
    }

    public String toString(){
        return "You are a " + getDescrip() + " named " + getName() + " with " + getHealth() + " health.";
    }
}