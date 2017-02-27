public class TrollPerimos extends Enemy{
    public TrollPerimos (int x, int y){
        super ("Troll Perimos", "Lazer Bitch", 500000000, x, y);
    }

    public String idle(){
        return "Perimos is recharging!";
    }

    public String one(){
        return "Perimos says \" Small things... So bothersome... I'll kill...\"";
    }

    public int oneDMG(){
        return -2000000;
    }

    public String low(){
        return "Perimos is preparing to do a 360 noscope slap!";
    }

    public int lowDMG(){
        return -1000000;
    }

    public String high(){
        return "Perimos is preparing to smash you into the earth!";
    }

    public int highDMG(){
        return -1500000;
    }
}