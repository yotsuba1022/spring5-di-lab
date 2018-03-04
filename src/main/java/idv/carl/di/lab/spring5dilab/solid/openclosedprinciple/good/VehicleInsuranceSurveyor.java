package idv.carl.di.lab.spring5dilab.solid.openclosedprinciple.good;

/**
 * @author Carl Lu
 */
public class VehicleInsuranceSurveyor implements InsuranceSurveyor {

    @Override
    public boolean isValidClaim() {
        System.out.println("VehicleInsuranceSurveyor: Validating vehicle insurance claim...");
        /*Logic to validate vehicle insurance claims*/
        return true;
    }

}
