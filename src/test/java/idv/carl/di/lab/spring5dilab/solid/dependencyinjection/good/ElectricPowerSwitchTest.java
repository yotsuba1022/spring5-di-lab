package idv.carl.di.lab.spring5dilab.solid.dependencyinjection.good;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * @author Carl Lu
 */
public class ElectricPowerSwitchTest {

    @Test
    public void testPress() throws Exception {
        Switchable switchableBulb = new LightBulb();
        Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();
        assertFalse(bulbPowerSwitch.isOn());

        Switchable switchableFan = new Fan();
        Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
        fanPowerSwitch.press();
        fanPowerSwitch.press();
        assertFalse(fanPowerSwitch.isOn());
    }

}
