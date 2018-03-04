package idv.carl.di.lab.spring5dilab.solid.liskovsubstitutionprinciple.good;

/**
 * @author Carl Lu
 */
public class TransportationDevice {

    private String name;
    private double speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

}
