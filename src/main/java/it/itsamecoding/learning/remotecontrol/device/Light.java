package it.itsamecoding.learning.remotecontrol.device;

public class Light {
    private final String room;

    public Light(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println(String.format("%s light is on.", room));
    }

    public void off() {
        System.out.println(String.format("%s light is off.", room));
    }
}
