package it.itsamecoding.learning.remotecontrol.device;

public class GarageDoor {
    public void up() {
        System.out.print("Garage door is opening");
        int seconds = 0;
        while (seconds < 3) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {}
            finally {
                System.out.print(".");
                seconds++;
            }
        }
        System.out.println();
        System.out.println("Garage door is open.");
    }

    public void down() {
        System.out.print("Garage door is closing");
        int seconds = 0;
        while (seconds < 3) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {}
            finally {
                System.out.print(".");
                seconds++;
            }
        }
        System.out.println();
        System.out.println("Garage door is closed.");
    }

    public void lightOn() {
        System.out.println("Garage light is on.");
    }

    public void lightOff() {
        System.out.println("Garage light is off.");
    }
}
