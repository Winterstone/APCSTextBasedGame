public class Darkan extends Enemy{
    public Darkan (int x, int y){
        super ("Darkan", "Dood with wings of fire", 1000000, x, y);
    }

    public String idle(){
        return "Darkan is resting!";
    }

    public String one(){
        return "Darkan says \"All you are is dust...\"";
    }

    public int oneDMG(){
        return -1000000;
    }

    public String low(){
        return "Darkan says \"Your time is running out!\"";
    }

    public int lowDMG(){
        return -20000;
    }

    public String high(){
        return "Darkan says \"I will oblierate you!\"";
    }

    public int highDMG(){
        return -35000;
    }
}