package idv.carl.di.lab.spring5dilab.solid.dependencyinjection.good;

/**
 * @author Carl Lu
 */
public class LightBulb implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("LightBulb: Bulb turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off...");
    }

}
