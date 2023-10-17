package commandpattern;

public class tv implements power{

    @Override
    public String on(){
        return "Tv is switched-on!";

    }

    @Override
    public String off(){
        return "Tv is switched-off!";
    }

    public String volumeUp(){
        return "Tv Volume is increasing";
    }

    public String volumeDown(){
        return "Tv Volume is decreasing";
    }
}