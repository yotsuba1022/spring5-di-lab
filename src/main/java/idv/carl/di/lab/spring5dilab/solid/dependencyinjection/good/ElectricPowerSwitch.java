package idv.carl.di.lab.spring5dilab.solid.dependencyinjection.good;

/**
 * @author Carl Lu
 */
public class ElectricPowerSwitch implements Switch {

    public Switchable client;
    public boolean on;

    public ElectricPowerSwitch(Switchable client) {
        this.client = client;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public void press() {
        boolean checkOn = isOn();
        if (checkOn) {
            client.turnOff();
            this.on = false;
        } else {
            client.turnOn();
            this.on = true;
        }
    }

}
