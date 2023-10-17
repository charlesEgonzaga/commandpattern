package commandpattern;

public class musicplayer implements power{

    @Override
    public String off() {
        return "Music Player is Off!";
    }

    @Override
    public String on() {
        return "Music Player is On!";
    }

    public String volumeUp(){
        return "Music volume is increasing";
    }

    public String volumeDown(){
        return "Music volume is decreasing";
    }

}
