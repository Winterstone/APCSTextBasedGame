public class Perimos extends Enemy{
    public Perimos (){
        super ("Perimos", "Lazer Bitch", 500000);
    }

    public String idle(){
        return "Perimos is recharging!";
    }

    public String one(){
        return "Perimos is preparing a Deadly Lazer attack!";
    }

    public int oneDMG();

    public String low(){
        return "Perimos is preparing to do a 360 noscope slap!";
    }

    public int lowDMG();

    public String high();

    public int highDMG();
}