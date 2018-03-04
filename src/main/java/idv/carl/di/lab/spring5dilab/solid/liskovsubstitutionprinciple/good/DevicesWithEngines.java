package idv.carl.di.lab.spring5dilab.solid.liskovsubstitutionprinciple.good;

import idv.carl.di.lab.spring5dilab.solid.liskovsubstitutionprinciple.Engine;

/**
 * @author Carl Lu
 */
public class DevicesWithEngines extends TransportationDevice {

    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void startEngine() {

    }

}
