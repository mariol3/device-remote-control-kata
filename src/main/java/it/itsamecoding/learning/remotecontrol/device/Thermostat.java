package it.itsamecoding.learning.remotecontrol.device;

public class Thermostat {
    private final String room;

    public Thermostat(String room) {
        this.room = room;
    }

    public void setTemperature(int temperature) {
        System.out.println(String.format("%s thermostat temperature is now %d", room, temperature));
    }
}
