package idv.carl.di.lab.spring5dilab.solid.openclosedprinciple.bad;

/**
 * @author Carl Lu
 */
public class HealthInsuranceSurveyor {

    public boolean isValidClaim() {
        System.out.println("HealthInsuranceSurveyor: Validating health insurance claim...");
        /*Logic to validate health insurance claims*/
        return true;
    }

}
