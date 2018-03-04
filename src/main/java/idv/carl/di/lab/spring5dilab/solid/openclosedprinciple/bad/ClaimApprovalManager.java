package idv.carl.di.lab.spring5dilab.solid.openclosedprinciple.bad;

/**
 * @author Carl Lu
 */
public class ClaimApprovalManager {

    public void processHealthClaim(HealthInsuranceSurveyor surveyor) {
        if (surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }

    public void processVehicleClaim(VehicleInsuranceSurveyor surveyor) {
        if (surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }

}
