package idv.carl.di.lab.spring5dilab.solid.interfacesegregationpriciple.good;

import org.junit.Test;

/**
 * @author Carl Lu
 */
public class ToyBuilderTest {

    @Test
    public void testBuildToyHouse() throws Exception {
        ToyHouse toyHouse = ToyBuilder.buildToyHouse();
        System.out.println(toyHouse);
    }

    @Test
    public void testBuildToyCar() throws Exception {
        ToyCar toyCar = ToyBuilder.buildToyCar();
        System.out.println(toyCar);
    }

    @Test
    public void testBuildToyPlane() throws Exception {
        ToyPlane toyPlane = ToyBuilder.buildToyPlane();
        System.out.println(toyPlane);
    }

}
