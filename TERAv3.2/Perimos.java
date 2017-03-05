public class Perimos extends Enemy{
    public Perimos (int x, int y){
        super ("Perimos", "Lazer Bitch", 500000, x, y);
    }

    public String idle(){
        return "Perimos is recharging!";
    }

    public String one(){
        return "Perimos says \" Small things... So bothersome... I'll kill...\"";
    }

    public int oneDMG(){
        return -150001;
    }

    public String low(){
        return "Perimos is preparing to do a 360 noscope slap!";
    }

    public int lowDMG(){
        return -15000;
    }

    public String high(){
        return "Perimos is preparing to smash you into the earth!";
    }

    public int highDMG(){
        return -30000;
    }
}