package commandpattern;

public class viewerapp {

    public static void main(String[] args){

        remotecontrol rc = new remotecontrol();
        poweron on;
        poweroff off;
        String cmd;
        
        tv tv = new tv();
        on = new poweron(tv);
        rc.setCommand(on);
        cmd = rc.clickButton();
        System.out.println(cmd);
        System.out.println(tv.volumeUp());

        System.out.println();

        musicplayer mp = new musicplayer();
        on = new poweron(mp);
        rc.setCommand(on);
        cmd = rc.clickButton();
        System.out.println(cmd);
        System.out.println(mp.volumeDown());

        System.out.println();

        thermostat thermostat = new thermostat();
        off = new poweroff(thermostat);
        rc.setCommand(off);
        cmd = rc.clickButton();
        System.out.println(thermostat.tempDown());
        System.out.println(cmd);

        System.out.println();

        radio rd = new radio();
        on = new poweron(rd);
        rc.setCommand(on);
        cmd =rc.clickButton();
        System.out.println(cmd);
        System.out.println(rd.nextChannel());
        System.out.println(rd.volumeUp());

        System.out.println();

        floodlight lamp = new floodlight();
        on = new poweron(lamp);
        cmd = rc.clickButton();
        System.out.println(lamp.on());
        System.out.println(lamp.yellowLightSetting());
        System.out.println(lamp.brightnessDown());
        System.out.println(lamp.off());
    }
}