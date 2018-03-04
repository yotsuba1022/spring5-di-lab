package idv.carl.di.lab.spring5dilab.solid.openclosedprinciple.good;

/**
 * @author Carl Lu
 */
public class ClaimApprovalManager {

    public void processClaim(InsuranceSurveyor surveyor) {
        if (surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }

}
