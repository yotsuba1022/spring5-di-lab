package idv.carl.di.lab.spring5dilab.solid.liskovsubstitutionprinciple.bad;

/**
 * @author Carl Lu
 */
public class Bicycle extends TransportationDevice {

    /*
     * A bicycle is a transportation device, however, it does not have an engine and hence, the method startEngine cannot be implemented.
     * */
    @Override
    public void startEngine() {

    }

}
